package nl.rivm.dvp.rvp.business.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum VaccinatieToestand {
  // using the constructor defined below

  @JsonProperty("Basisimmuun")
  BASISIMMUUN("Basisimmuun"),
  @JsonProperty("Gerevaccineerd")
  GEREVACCINEERD("Gerevaccineerd"),
  @JsonProperty("Primaire serie")
  PRIMAIRE_SERIE("Primaire serie"),
  @JsonProperty("Volledig afgesloten")
  VOLLEDIGAFGESLOTEN("Volledig afgesloten");

  // Member to hold the name
  private String string;

  // constructor to set the string
  VaccinatieToestand(String name) {
    string = name;
  }

  // the toString just returns the given name
  @Override
  public String toString() {
    return string;
  }
}
