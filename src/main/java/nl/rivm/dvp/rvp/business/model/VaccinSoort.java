package nl.rivm.dvp.rvp.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VaccinSoort {
     aK, // Het losse aK-vaccin (acellulair Kinkhoest)
     BMR, // BMR-vaccin (bof, mazelen, rodehond): Dit vaccin biedt bescherming tegen bof,
          // mazelen en rodehond.
     DKT, // Het DKT-vaccin (een cocktail van D, K en T) wat wordt ingezet om zwangeren te
          // beschermen tegen kinkhoest

     DKTP booster, // - Het DKTP booster vaccin (een cocktail van D, K, T en P maar met een lagere
                   // dosis waardoor het uitsluitend ingezet kan worden als booster vaccin)
     DKTP-HepB, // Het DKTP-HepB vaccin
     DKTP-Hib, // Het DKTP-Hib vaccin

     DKT+Hib+HepB, // een cocktail van D – difterie, K – kinkhoest, T – tetanus, P – polio, Hib –
     // Haemophilus influenzae type B en HepB – Hepatitis B
     DTP, // Het DTP-vaccin (een cocktail van D, T en P)
     Hep B, // Het losse EepB vaccin
     Hib, // Hib-vaccin (Haemophilus influenzae type b): Dit vaccin biedt bescherming
          // tegen infecties veroorzaakt door de bacterie Haemophilus influenzae type b.
     HPV, // HPV-vaccin (humaan papillomavirus): Dit vaccin biedt bescherming tegen
          // infecties veroorzaakt door het humaan papillomavirus, dat kan leiden tot
          // baarmoederhalskanker en andere kankers.
     MenACWY, // MenACWY-vaccin (meningokokken ACWY): Dit vaccin biedt bescherming tegen
     // infecties veroorzaakt door de bacterie Neisseria meningitidis serogroepen A,
     // C, W en Y.
     MenC, // Het MenC-vaccin (Meningokokken type C)
     Pneu, // Pneumokokkenvaccin: Dit vaccin biedt bescherming tegen infecties veroorzaakt
           // door de bacterie Streptococcus pneumoniae.
}
