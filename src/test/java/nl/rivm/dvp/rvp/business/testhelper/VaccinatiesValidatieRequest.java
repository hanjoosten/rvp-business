package nl.rivm.dvp.rvp.business.testhelper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import nl.rivm.dvp.rvp.business.model.Client;
import nl.rivm.dvp.rvp.business.model.Vaccinatie;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Slf4j
public class VaccinatiesValidatieRequest {
    private List<Vaccinatie> vaccinaties;
    private LocalDate peildatum;
    private Client client;

    public String toJSON() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"));
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (JsonProcessingException jpe) {
            log.error("kon requeststring niet maken", jpe);
        }

        return null;
    }

}
