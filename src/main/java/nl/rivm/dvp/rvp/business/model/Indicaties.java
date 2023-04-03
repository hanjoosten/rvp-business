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
    Boolean HepbDCode; // (moeder is draagster van HepB)
    Boolean HepbECode; // (minstens een ouder afkomstig uit land met hoog-emdemisch voorkomen HepB)
    Boolean HepbVCode; // (kind is geboren voor 1-8-2011 en in buitenland gestart met HepB vaccinatie)
    Boolean HepbDownCode; // (kind is geboren voor 1-8-2011 en heeft Down-syndroom)
    Boolean HepbWHOCode; // (kind heeft in buitenland WHO schema gevolgd voor HepB)
    Boolean DKTP3_5_11; // (Kind volgt 3-5-11 schema voor zuigelingen voor DKTP en HepB)
    Boolean DKTP2_3_5_11; // (Kind volgt 2-3-5-11 schema voor zuigelingen voor DKTP en HepB)
}
