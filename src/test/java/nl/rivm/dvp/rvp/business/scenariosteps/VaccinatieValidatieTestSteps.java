package nl.rivm.dvp.rvp.business.scenariosteps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.*;

import io.cucumber.java8.Nl;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ParameterType;
import io.cucumber.java.DataTableType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.with;
import io.restassured.http.ContentType;
import lombok.Getter;
import lombok.val;
import lombok.extern.slf4j.Slf4j;
import nl.rivm.dvp.rvp.business.model.Client;
import nl.rivm.dvp.rvp.business.model.VaccinSoort;
import nl.rivm.dvp.rvp.business.model.Vaccinatie;
import nl.rivm.dvp.rvp.business.testhelper.VaccinatiesValidatieRequest;
import nl.rivm.dvp.rvp.business.testhelper.VaccinatiesValidatieResponse;

@Slf4j
public class VaccinatieValidatieTestSteps implements Nl {

    // Scenario context bedodigd
    Client client;
    List<Vaccinatie> vaccinaties;
    LocalDate peildatum;

    // response (bij normale werking)
    @Getter
    VaccinatiesValidatieResponse resultaat;

    @ParameterType("\\d{4}\\-\\d{2}\\-\\d{2}")
    public LocalDateTime datumZonderTijd(String dateString) {
        return LocalDate
                .parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE)
                .atStartOfDay();
    };

    @ParameterType("\\d{4}\\-\\d{2}\\-\\d{2}T\\d{2}:\\d{2}")
    public LocalDateTime datumMetTijd(String datetimeString) {
        return LocalDateTime.parse(datetimeString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    };

    // @DataTableType
    // public Vaccinatie vaccinatieEntry(Map<String, String> entry) {
    // return new Vaccinatie(
    // VaccinSoort.valueOf(entry.get("vaccinSoort")),
    // entry.get("lastName"),
    // entry.get("lastName"),
    // entry.get("famousBook"));
    // }

    public VaccinatieValidatieTestSteps() {
        Before(() -> {
            client = null;
            vaccinaties = new ArrayList<>();
            peildatum = LocalDate.now();
        });

        Gegeven("een client geboren op {datumZonderTijd}", (LocalDateTime geboortedatum) -> {
            client = new Client(geboortedatum.toLocalDate());
        });

        Gegeven("de volgende vaccinaties zijn gegeven voor deze client:", (DataTable dataTable) -> {

            List<Map<String, String>> records = dataTable.asMaps();

            records.forEach(record -> {
                String vaccinSoort = record.get("VaccinSoort");
                String uitvoerdatum = record.get("Uitvoerdatum");
                String product = record.get("Product");
                String expiratiedatum = record.get("Expiratiedatum");

                vaccinaties.add(Vaccinatie.builder()
                        .vaccinSoort(VaccinSoort.valueOf(vaccinSoort))
                        .uitvoerdatum(LocalDate.parse(uitvoerdatum, DateTimeFormatter.ISO_LOCAL_DATE))
                        .product(product)
                        .expiratiedatum(LocalDate.parse(expiratiedatum, DateTimeFormatter.ISO_LOCAL_DATE))
                        .build());

            });
        });

        Als("deze vaccinaties worden gevalideerd", () -> {
            val request = new VaccinatiesValidatieRequest(client, vaccinaties, peildatum);
            val result = with()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body(request.toJSON())
                    // .log().all() // commentaar verwijderen voor requestlogging
                    .when()
                    .request("POST", "/BeoordelenVaccinaties")
                    .then()
                    // .log().all() // commentaar verwijderen voor responselogging
                    .statusCode(200)
                    .extract();
            assertDoesNotThrow(() -> this.resultaat = (VaccinatiesValidatieResponse) result.jsonPath()
                    .getObject("$", VaccinatiesValidatieResponse.class));
            /*
             * commentaar verwijderen voor logging result
             * object waarmee de assertions worden gedaan
             */
            // log.info(resultaat.toString());
        });

        Dan("verwacht ik dat {int} van deze vaccinaties geldig zijn verklaard",
                (Integer aantalGeldig) -> {
                    var aantal = getResultaat()
                            .getBeoordeeldeVaccinaties()
                            .stream()
                            .filter(x -> x.getIsGeldig())
                            .collect(Collectors.toList())
                            .size();
                    assertEquals(aantalGeldig, aantal);
                });
    }
}
