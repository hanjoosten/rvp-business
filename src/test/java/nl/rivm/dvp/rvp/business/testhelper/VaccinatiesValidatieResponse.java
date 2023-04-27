package nl.rivm.dvp.rvp.business.testhelper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import nl.rivm.dvp.rvp.business.model.GevalideerdeVaccinatieComponent;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class VaccinatiesValidatieResponse {

    @JsonProperty("gevalideerde vaccinatie componenten")
    private List<GevalideerdeVaccinatieComponent> gevalideerdeVaccinatieComponenten;

    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("gevalideerde vaccinatie componenten: [");
        for (int i = 0; i < gevalideerdeVaccinatieComponenten.size(); i++) {
            result.append(gevalideerdeVaccinatieComponenten.get(i).toString());
            if (i < gevalideerdeVaccinatieComponenten.size() - 1) {
                result.append(", ");
            }
        }
        ;
        result.append("]");
        return result.toString();
    }
}
