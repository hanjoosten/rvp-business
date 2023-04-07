package nl.rivm.dvp.rvp.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VaccinSoort {
   AK, // Het losse aK-vaccin (acellulair Kinkhoest)
   BMR, // BMR-vaccin (bof, mazelen, rodehond): Dit vaccin biedt bescherming tegen bof,
        // mazelen en rodehond.
   DKT, // Het DKT-vaccin (een cocktail van D, K en T) wat wordt ingezet om zwangeren te
        // beschermen tegen kinkhoest
   DKTP_BOOSTER, // - Het DKTP booster vaccin (een cocktail van D, K, T en P maar met een lagere
                 // dosis waardoor het uitsluitend ingezet kan worden als booster vaccin)
   DKTP_HEPB, // Het DKTP-HepB vaccin
   DKTP_HIB, // Het DKTP-Hib vaccin

   DKTP_HIB_HEPB, // een cocktail van D – difterie, K – kinkhoest, T – tetanus, P – polio, Hib –
   // Haemophilus influenzae type B en HepB – Hepatitis B
   DTP, // Het DTP-vaccin (een cocktail van D, T en P)
   HEPB, // Het losse EepB vaccin
   HIB, // Hib-vaccin (Haemophilus influenzae type b): Dit vaccin biedt bescherming
        // tegen infecties veroorzaakt door de bacterie Haemophilus influenzae type b.
   HPV, // HPV-vaccin (humaan papillomavirus): Dit vaccin biedt bescherming tegen
        // infecties veroorzaakt door het humaan papillomavirus, dat kan leiden tot
        // baarmoederhalskanker en andere kankers.
   MENACWY, // MenACWY-vaccin (meningokokken ACWY): Dit vaccin biedt bescherming tegen
   // infecties veroorzaakt door de bacterie Neisseria meningitidis serogroepen A,
   // C, W en Y.
   MENC, // Het MenC-vaccin (Meningokokken type C)
   PNEU, // Pneumokokkenvaccin: Dit vaccin biedt bescherming tegen infecties veroorzaakt
         // door de bacterie Streptococcus pneumoniae.
}
