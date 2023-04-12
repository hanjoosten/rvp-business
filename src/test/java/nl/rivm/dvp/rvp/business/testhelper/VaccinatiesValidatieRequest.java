package nl.rivm.dvp.rvp.business.testhelper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import nl.rivm.dvp.rvp.business.model.Client;
import nl.rivm.dvp.rvp.business.model.Vaccinatie;
import java.util.List;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class VaccinatiesValidatieRequest {
    private List<Vaccinatie> vaccinaties;
    private LocalDate peildatum;
    private Client client;

}
