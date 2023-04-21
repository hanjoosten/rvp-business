package nl.rivm.dvp.rvp.business.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Indicaties {
    Boolean hepbDCode; // (moeder is draagster van HepB)
    Boolean hepbECode; // (minstens een ouder afkomstig uit land met hoog-emdemisch voorkomen HepB)
    Boolean hepbVCode; // (kind is geboren voor 1-8-2011 en in buitenland gestart met HepB vaccinatie)
    Boolean hepbDownCode; // (kind is geboren voor 1-8-2011 en heeft Down-syndroom)
    Boolean hepbWHOCode; // (kind heeft in buitenland WHO schema gevolgd voor HepB)
    Boolean dKTP3_5_11; // (Kind volgt 3-5-11 schema voor zuigelingen voor DKTP en HepB)
    Boolean dKTP2_3_5_11; // (Kind volgt 2-3-5-11 schema voor zuigelingen voor DKTP en HepB)

    public Indicaties() {
        hepbDCode = false;
        hepbECode = false;
        hepbVCode = false;
        hepbDownCode = false;
        hepbWHOCode = false;
        dKTP3_5_11 = false;
        dKTP2_3_5_11 = false;

    }
}
