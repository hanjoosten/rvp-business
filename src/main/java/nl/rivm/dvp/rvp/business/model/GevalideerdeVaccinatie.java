package nl.rivm.dvp.rvp.business.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class GevalideerdeVaccinatie {
    Vaccinatie vaccinatie;
    Integer rangnummer;
    Boolean isGeldig;
    String vaccinatieToestand;
    Integer leeftijdInDagen;
    String toelichting;

}
