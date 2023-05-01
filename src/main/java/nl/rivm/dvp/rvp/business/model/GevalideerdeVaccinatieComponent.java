package nl.rivm.dvp.rvp.business.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class GevalideerdeVaccinatieComponent {
    VaccinatieComponent vaccinatieComponent;
    Integer rangnummer;
    Boolean isGeldig;
    VaccinatieToestand vaccinatieToestand;
    Integer leeftijdInDagen;
    String toelichting;
}
