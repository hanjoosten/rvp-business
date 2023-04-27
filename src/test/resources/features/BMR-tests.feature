# language: nl
Functionaliteit: validatie van vaccinaties

    @Test
    Scenario: dummy
        Gegeven een client geboren op 2020-01-01
        En de volgende vaccinaties zijn gegeven voor deze client:
            | VaccinSoort | Uitvoerdatum | Product | Expiratiedatum | toelichting          |
            | BMR         | 2020-02-02   | null    | 2025-01-01     | te jong              |
            | BMR         | 2020-12-30   | null    | 2025-01-01     | Geldig, rangnummer 0 |
            | BMR         | 2021-01-01   | null    | 2025-01-01     | interval te krap     |
            | BMR         | 2021-02-01   | null    | 2025-01-01     | Geldig, rangnummer 1 |
            | BMR         | 2021-03-01   | null    | 2025-01-01     | Geldig, rangnummer 2 |
        Als deze vaccinaties worden gevalideerd
        Dan verwacht ik 15 vaccinatiecomponenten
