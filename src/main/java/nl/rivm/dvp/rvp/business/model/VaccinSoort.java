package nl.rivm.dvp.rvp.business.model;

public enum VaccinSoort {
     AK("aK"),
     B("B"),
     BCG("BCG"),
     BM("BM"),
     BMR("BMR"),
     BMRW("BMRW"),
     COVID("COVID"),
     D("D"),
     DKHIB("DK-Hib"),
     DKT("DKT"),
     DKTHEPB("DKT+HepB"),
     DKTHIB("DKT+Hib"),
     DKTHIBHEPB("DKT+Hib+HepB"),
     DKTPBOOSTER("DKTP booster"),
     DKTPHEPB("DKTP-HepB"),
     DKTPHIBHEPB("DKTP-Hib-HepB"),
     DKTPHIB("DKTP-Hib"),
     DKTP("DKTP"),
     DT("DT"),
     DTP("DTP"),
     HBIG("HBIg"),
     HEPA("Hep A"),
     HEPB("Hep B"),
     HIB("Hib"),
     HIBHEPB("Hib+HepB"),
     HPV("HPV"),
     IPV("IPV"),
     K("K"),
     M("M"),
     MENACWY("MenACWY"),
     MENC("MenC"),
     MR("MR"),
     OPV("OPV"),
     P("P"),
     PNEU("Pneu"),
     R("R"),
     ROTA("Rota"),
     T("T"),
     TP("TP"),
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
