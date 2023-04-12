package nl.rivm.dvp.rvp.business.scenariosteps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.cucumber.java8.Nl;
import io.cucumber.java.ParameterType;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.with;
import io.restassured.http.ContentType;
import lombok.Getter;
import lombok.val;
import lombok.extern.slf4j.Slf4j;
import nl.rivm.dvp.rvp.business.model.Client;
import nl.rivm.dvp.rvp.business.model.Vaccinatie;
import nl.rivm.dvp.rvp.business.model.BeoordeeldeVaccinatie;
import nl.rivm.dvp.rvp.business.testhelper.VaccinatiesValidatieRequest;
import nl.rivm.dvp.rvp.business.testhelper.VaccinatiesValidatieResponse;

@Slf4j
public class VaccinatieValidatieTestSteps implements Nl {
    public VaccinatieValidatieTestSteps() {
        log.error("Teststappen aangetrapt, maar er zijn nog geen teststappen (TODO).");
    }
}
