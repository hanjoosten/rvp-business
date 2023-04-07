package nl.rivm.dvp.rvp.business.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class BeoordeeldeVaccinatie {
    Vaccinatie vaccinatie;
    Integer rangnummer;
    Boolean isGeldig;
    LocalDate beoordelingsDatum;
}
