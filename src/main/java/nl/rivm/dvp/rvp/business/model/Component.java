package nl.rivm.dvp.rvp.business.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Component {

    @JsonProperty("aK")
    AK("aK"),
    @JsonProperty("B")
    B("B"),
    @JsonProperty("BCG")
    BCG("BCG"),
    @JsonProperty("COVID")
    COVID("COVID"),
    @JsonProperty("D")
    D("D"),
    @JsonProperty("D booster")
    DBOOSTER("D booster"),
    @JsonProperty("HBIg")
    HBIG("HBIg"),
    @JsonProperty("HepA")
    HEPA("HepA"),
    @JsonProperty("HepB")
    HEPB("HepB"),
    @JsonProperty("Hib")
    HIB("Hib"),
    @JsonProperty("HPV")
    HPV("HPV"),
    @JsonProperty("IPV")
    IPV("IPV"),
    @JsonProperty("K")
    K("K"),
    @JsonProperty("K booster")
    KBOOSTER("K booster"),
    @JsonProperty("M")
    M("M"),
    @JsonProperty("MenACWY")
    MENACWY("MenACWY"),
    @JsonProperty("MenC")
    MENC("MenC"),
    @JsonProperty("OPV")
    OPV("OPV"),
    @JsonProperty("P")
    P("P"),
    @JsonProperty("P booster")
    PBOOSTER("P booster"),
    @JsonProperty("Pneu")
    PNEU("Pneu"),
    @JsonProperty("R")
    R("R"),
    @JsonProperty("Rota")
    ROTA("Rota"),
    @JsonProperty("T")
    T("T"),
    @JsonProperty("T booster")
    TBOOSTER("T booster"),
    @JsonProperty("Waterpokken")
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
