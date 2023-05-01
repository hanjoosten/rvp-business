package nl.rivm.dvp.rvp.business.model;

public enum Component {

    AK("aK"),
    B("B"),
    BCG("BCG"),
    COVID("COVID"),
    D("D"),
    DBOOSTER("D booster"),
    HBIG("HBIg"),
    HEPA("HepA"),
    HEPB("HepB"),
    HIB("Hib"),
    HPV("HPV"),
    IPV("IPV"),
    K("K"),
    KBOOSTER("K booster"),
    M("M"),
    MENACWY("MenACWY"),
    MENC("MenC"),
    OPV("OPV"),
    P("P"),
    PBOOSTER("P booster"),
    PNEU("Pneu"),
    R("R"),
    ROTA("Rota"),
    T("T"),
    TBOOSTER("T booster"),
    WATERPOKKEN("Waterpokken");

    // Member to hold the name
    private String string;

    // constructor to set the string
    Component(String name) {
        string = name;
    }

    // the toString just returns the given name
    @Override
    public String toString() {
        return string;
    }
}
