package nl.rivm.dvp.rvp.business.model;

public enum Indicatie {
    // using the constructor defined below

    // Onderstaande waarden uit de export van wat er nu in de database staat
    // (mailtje van Marvin d.d. 26 april 2023)
    HEPBDCODE("HepB D-code"), // (moeder is draagster van HepB)
    HEPBECODE("HepB E-code"), // (minstens een ouder afkomstig uit land met hoog-emdemisch voorkomen HepB)
    HEPBVCODE("HepB V-code"), // (kind is geboren voor 1-8-2011 en in buitenland gestart met HepB vaccinatie)
    HEPBDOWNCODE("Down-code"), // (kind is geboren voor 1-8-2011 en heeft Down-syndroom)
    HEPBWHOCODE("HepB WHO-schema"), // (kind heeft in buitenland WHO schema gevolgd voor HepB)
    DKTP3_5_11("DKTP 2-3-5-11"), // (Kind volgt 3-5-11 schema voor zuigelingen voor DKTP en HepB)
    DKTP2_3_5_11("DKTP 3-5-11"); // (Kind volgt 2-3-5-11 schema voor zuigelingen voor DKTP en HepB)

    // Member to hold the name
    private String string;

    // constructor to set the string
    Indicatie(String name) {
        string = name;
    }

    // the toString just returns the given name
    @Override
    public String toString() {
        return string;
    }
}