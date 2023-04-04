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

public class RefVac {
    String naam;
    VaccinSoort vaccinsoort;
    Integer rangnummer;

    // TODO: Hier moet op een of andere manier nog de indicatierestricties en
    // voorwaarden worden ingevlochten.
}
