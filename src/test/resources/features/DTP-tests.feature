# language: nl
Functionaliteit: validatie van vaccinaties

    @Test
    Scenario: dummy
        Gegeven een client geboren op 2020-01-01
        En de volgende vaccinaties zijn gegeven voor deze client:
            | VaccinSoort | Uitvoerdatum | Product | Expiratiedatum | toelichting |
            | DKTP        | 2020-02-02   | null    | 2025-01-01     | te jong     |
        Als deze vaccinaties worden gevalideerd
        Dan verwacht ik 4 vaccinatiecomponenten
