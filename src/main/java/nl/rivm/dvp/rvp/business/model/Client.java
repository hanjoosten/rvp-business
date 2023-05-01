package nl.rivm.dvp.rvp.business.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    List<Indicatie> indicaties;
    LocalDate onbeschermdDatum; // datum waarop is gebleken dat er onvoldoende bescherming is opgebouwd voor
                                // HepB

    public Client(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
        this.indicaties = new ArrayList<Indicatie>();
        this.onbeschermdDatum = null;
    };

}
