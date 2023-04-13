package nl.rivm.dvp.rvp.business.testhelper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import nl.rivm.dvp.rvp.business.model.BeoordeeldeVaccinatie;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class VaccinatiesValidatieResponse {

    @JsonProperty("BeoordeeldeVaccinaties")
    private List<BeoordeeldeVaccinatie> beoordeeldeVaccinaties;

    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("BeoordeeldeVaccinaties: [");
        for (int i = 0; i < beoordeeldeVaccinaties.size(); i++) {
            result.append(beoordeeldeVaccinaties.get(i).toString());
            if (i < beoordeeldeVaccinaties.size() - 1) {
                result.append(", ");
            }
        }
        ;
        result.append("]");
        return result.toString();
    }
}
