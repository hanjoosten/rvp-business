# language: nl
Functionaliteit: validatie van vaccinaties

    @Test
    Scenario: dummy
        Gegeven een client geboren op 2020-01-01
        En de volgende vaccinaties zijn gegeven voor deze client:
            | VaccinSoort | Uitvoerdatum | Product | Expiratiedatum |
            | "BMR"       | 2020-02-02   | null    | 2025-01-01     |
            | "BMR"       | 2020-12-31   | null    | 2025-01-01     |
            | "BMR"       | 2021-01-01   | null    | 2025-01-01     |
            | "BMR"       | 2021-02-01   | null    | 2025-01-01     |
            | "BMR"       | 2021-03-01   | null    | 2025-01-01     |
        Als deze vaccinaties worden gevalideerd
        Dan verwacht ik dat 3 van deze vaccinaties geldig zijn verklaard
