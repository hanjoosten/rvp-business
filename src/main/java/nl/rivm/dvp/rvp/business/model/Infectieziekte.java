package nl.rivm.dvp.rvp.business.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Infectieziekte {
    // using the constructor defined below

    @JsonProperty("Rodehond")
    RODEHOND("Rodehond"),
    @JsonProperty("Kinkhoest")
    KINKHOEST("Kinkhoest"),
    @JsonProperty("Bof")
    BOF("Bof"),
    @JsonProperty("Difterie")
    DIFTERIE("Difterie"),
    @JsonProperty("Pneumokokkenziekte")
    PNEUMOKOKKENZIEKTE("Pneumokokkenziekte"),
    @JsonProperty("HPV-kanker")
    HPVKANKER("HPV-kanker"),
    @JsonProperty("HiB-ziekten")
    HIBZIEKTEN("HiB-ziekten"),
    @JsonProperty("Hepatitis B")
    HEPATITISB("Hepatitis B"),
    @JsonProperty("Tetanus")
    TETANUS("Tetanus"),
    @JsonProperty("Polio")
    POLIO("Polio"),
    @JsonProperty("Mazelen")
    MAZELEN("Mazelen"),
    @JsonProperty("Meningokokkenziekte C")
    MENINGOKOKKENZIEKTEC("Meningokokkenziekte C"),
    @JsonProperty("Meningokokkenziekte Y")
    MENINGOKOKKENZIEKTEY("Meningokokkenziekte Y"),
    @JsonProperty("Hepatitis A")
    HEPATITISA("Hepatitis A"),
    @JsonProperty("Waterpokken")
    WATERPOKKEN("Waterpokken"),
    @JsonProperty("Bacillus Calmette-Guérin")
    BACILLUSCALMETTEGUÉRIN("Bacillus Calmette-Guérin"),
    @JsonProperty("SARS-CoV-2")
    SARSCOV2("SARS-CoV-2"),
    @JsonProperty("Rotavirus")
    ROTAVIRUS("Rotavirus"),
    @JsonProperty("Hepatitis B Immunoglobuline")
    HEPATITISBIMMUNOGLOBULINE("Hepatitis B Immunoglobuline");

    // Member to hold the name
    private String string;

    // constructor to set the string
    Infectieziekte(String name) {
        string = name;
    }

    // the toString just returns the given name
    @Override
    public String toString() {
        return string;
    }

    // @JsonCreator
    // public static Infectieziekte fromString(String key) {
    // return key == null
    // ? null
    // : Arrays.stream(Infectieziekte.values())
    // .filter(e -> e.string == key)
    // .findAny()
    // .orElseThrow(
    // () -> new IllegalArgumentException(
    // "Sukkel! " + key + " wordt niet herkend als geldige Infectieziekte."));
    // }

    // @JsonSetter("infectieziekte")
    // public Infectieziekte setInfectieziekte(String str) {
    // return fromString(str);
    // }
}