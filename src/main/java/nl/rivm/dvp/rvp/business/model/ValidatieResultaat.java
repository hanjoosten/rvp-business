package nl.rivm.dvp.rvp.business.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class ValidatieResultaat {
    Integer rangnummer;
    VaccinatieToestand vaccinatieToestand;
    String toelichting;
}
