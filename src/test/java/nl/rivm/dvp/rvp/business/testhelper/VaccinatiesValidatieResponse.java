package nl.rivm.dvp.rvp.business.testhelper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import nl.rivm.dvp.rvp.business.model.GevalideerdeVaccinatie;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class VaccinatiesValidatieResponse {

    @JsonProperty("GevalideerdeVaccinaties")
    private List<GevalideerdeVaccinatie> gevalideerdeVaccinaties;

    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("GevalideerdeVaccinaties: [");
        for (int i = 0; i < gevalideerdeVaccinaties.size(); i++) {
            result.append(gevalideerdeVaccinaties.get(i).toString());
            if (i < gevalideerdeVaccinaties.size() - 1) {
                result.append(", ");
            }
        }
        ;
        result.append("]");
        return result.toString();
    }
}
