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
public class Client {
    LocalDate geboortedatum;
    Indicaties indicaties;
    LocalDate onbeschermdDatum; //datum waarop is gebleken dat er onvoldoende bescherming is opgebouwd voor HepB
    
}

