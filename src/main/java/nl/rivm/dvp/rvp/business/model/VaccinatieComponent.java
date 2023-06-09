package nl.rivm.dvp.rvp.business.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
public class VaccinatieComponent {
    /**
     * Een specifieke component gegeven in een specifieke vaccinatie
     */
    Component component;
    Vaccinatie vaccinatie;
}
