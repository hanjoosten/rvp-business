# language: nl
Functionaliteit: validatie van vaccinaties

    @Test
    Scenario: DTP test
        Gegeven een client geboren op 2020-01-01
        En de volgende vaccinaties zijn gegeven voor deze client:
            | VaccinSoort | Uitvoerdatum | Product | Expiratiedatum | toelichting |
            | DTP         | 2020-02-02   | null    | 2025-01-01     | valide      |
        Als deze vaccinaties worden gevalideerd
        Dan verwacht ik 3 vaccinatiecomponenten
