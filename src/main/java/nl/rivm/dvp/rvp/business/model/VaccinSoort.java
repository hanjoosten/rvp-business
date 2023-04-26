package nl.rivm.dvp.rvp.business.model;

public enum VaccinSoort {
     AK("aK"),
     BMR("BMR"),
     DKT("DKT"),
     DKT_BOOSTER("KTP booster"),
     DKTP_HEPB("DKTP-HepB"),
     DKTP_HIB("DKTP-Hib"),
     DKT_HIB_HEPB("DKT+Hib+HepB"),
     DTP("DTP"),
     HEPB("Hep B"),
     HIB("Hib"),
     HPV("HPV"),
     MENACWY("MenACWY"),
     MENC("MenC"),
     PNEU("Pneu");

     // TODO: Aanvullen op basis van soorten in rvp.adl

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
