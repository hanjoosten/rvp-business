package nl.rivm.dvp.rvp.business.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Dossier {
    Client client;
    List<Vaccinatie> vaccinaties;
    LocalDate peildatum;

}
