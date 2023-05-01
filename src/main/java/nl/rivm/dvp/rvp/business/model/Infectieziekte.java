package nl.rivm.dvp.rvp.business.model;

public enum Infectieziekte {
    // using the constructor defined below

    RODEHOND("Rodehond"),
    KINKHOEST("Kinkhoest"),
    BOF("Bof"),
    DIFTERIE("Difterie"),
    PNEUMOKOKKENZIEKTE("Pneumokokkenziekte"),
    HPVKANKER("HPV-kanker"),
    HIBZIEKTEN("HiB-ziekten"),
    HEPATITISB("Hepatitis B"),
    TETANUS("Tetanus"),
    POLIO("Polio"),
    MAZELEN("Mazelen"),
    MENINGOKOKKENZIEKTEC("Meningokokkenziekte C"),
    MENINGOKOKKENZIEKTEY("Meningokokkenziekte Y"),
    HEPATITISA("Hepatitis A"),
    WATERPOKKEN("Waterpokken"),
    BACILLUSCALMETTEGUÉRIN("Bacillus Calmette-Guérin"),
    SARSCOV2("SARS-CoV-2"),
    ROTAVIRUS("Rotavirus"),
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
}