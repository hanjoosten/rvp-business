package nl.rivm.dvp.rvp.business.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum VaccinSoort {
     @JsonProperty("aK")
     AK("aK"),
     @JsonProperty("B")
     B("B"),
     @JsonProperty("BCG")
     BCG("BCG"),
     @JsonProperty("BM")
     BM("BM"),
     @JsonProperty("BMR")
     BMR("BMR"),
     @JsonProperty("BMRW")
     BMRW("BMRW"),
     @JsonProperty("COVID")
     COVID("COVID"),
     @JsonProperty("D")
     D("D"),
     @JsonProperty("DK-Hib")
     DKHIB("DK-Hib"),
     @JsonProperty("DKT")
     DKT("DKT"),
     @JsonProperty("DKT+HepB")
     DKTHEPB("DKT+HepB"),
     @JsonProperty("DKT+Hib")
     DKTHIB("DKT+Hib"),
     @JsonProperty("DKT+Hib+HepB")
     DKTHIBHEPB("DKT+Hib+HepB"),
     @JsonProperty("DKTP booster")
     DKTPBOOSTER("DKTP booster"),
     @JsonProperty("DKTP-HepB")
     DKTPHEPB("DKTP-HepB"),
     @JsonProperty("DKTP-Hib-HepB")
     DKTPHIBHEPB("DKTP-Hib-HepB"),
     @JsonProperty("DKTP-Hib")
     DKTPHIB("DKTP-Hib"),
     @JsonProperty("DKTP")
     DKTP("DKTP"),
     @JsonProperty("DT")
     DT("DT"),
     @JsonProperty("DTP")
     DTP("DTP"),
     @JsonProperty("HBIg")
     HBIG("HBIg"),
     @JsonProperty("Hep A")
     HEPA("Hep A"),
     @JsonProperty("Hep B")
     HEPB("Hep B"),
     @JsonProperty("Hib")
     HIB("Hib"),
     @JsonProperty("Hib+HepB")
     HIBHEPB("Hib+HepB"),
     @JsonProperty("HPV")
     HPV("HPV"),
     @JsonProperty("IPV")
     IPV("IPV"),
     @JsonProperty("K")
     K("K"),
     @JsonProperty("M")
     M("M"),
     @JsonProperty("MenACWY")
     MENACWY("MenACWY"),
     @JsonProperty("MenC")
     MENC("MenC"),
     @JsonProperty("MR")
     MR("MR"),
     @JsonProperty("OPV")
     OPV("OPV"),
     @JsonProperty("P")
     P("P"),
     @JsonProperty("Pneu")
     PNEU("Pneu"),
     @JsonProperty("R")
     R("R"),
     @JsonProperty("Rota")
     ROTA("Rota"),
     @JsonProperty("T")
     T("T"),
     @JsonProperty("TP")
     TP("TP"),
     @JsonProperty("Waterpokken")
     WATERPOKKEN("Waterpokken");

     // Member to hold the name
     private String string;

     // constructor to set the string
     VaccinSoort(String name) {
          string = name;
     }

     // the toString just returns the given name
     @Override
     public String toString() {
          return string;
     }
}
