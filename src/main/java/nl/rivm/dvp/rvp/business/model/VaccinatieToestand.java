package nl.rivm.dvp.rvp.business.model;

public enum VaccinatieToestand {
  // using the constructor defined below
  VOLLEDIGAFGESLOTEN("Volledig afgesloten");

  // Member to hold the name
  private String string;

  // constructor to set the string
  VaccinatieToestand(String name){string = name;}

  // the toString just returns the given name
  @Override
  public String toString() {
      return string;
  }
}
