package nl.rivm.dvp.rvp.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VaccinSoort {
   IPV, // Geïnactiveerd poliovaccin (IPV): Dit vaccin biedt bescherming tegen polio.
   BMR, // BMR-vaccin (bof, mazelen, rodehond): Dit vaccin biedt bescherming tegen bof, mazelen en rodehond.
   DTP, // DTP-vaccin (difterie, tetanus, pertussis): Dit vaccin biedt bescherming tegen difterie, tetanus en pertussis (kinkhoest).
   DKTP, 
   DKT,
   HIB, // Hib-vaccin (Haemophilus influenzae type b): Dit vaccin biedt bescherming tegen infecties veroorzaakt door de bacterie Haemophilus influenzae type b.
   PCV, // Pneumokokkenvaccin (PCV): Dit vaccin biedt bescherming tegen infecties veroorzaakt door de bacterie Streptococcus pneumoniae.
   MENACWY, //MenACWY-vaccin (meningokokken ACWY): Dit vaccin biedt bescherming tegen infecties veroorzaakt door de bacterie Neisseria meningitidis serogroepen A, C, W en Y.
   HPV // HPV-vaccin (humaan papillomavirus): Dit vaccin biedt bescherming tegen infecties veroorzaakt door het humaan papillomavirus, dat kan leiden tot baarmoederhalskanker en andere kankers.
}

// Het Rijksvaccinatieprogramma (RVP) in Nederland maakt momenteel gebruik van de volgende vaccinsoorten:
// 1. Geïnactiveerd poliovaccin (IPV): Dit vaccin biedt bescherming tegen polio.
// 2. BMR-vaccin (bof, mazelen, rodehond): Dit vaccin biedt bescherming tegen bof, mazelen en rodehond.
// 3. DTP-vaccin (difterie, tetanus, pertussis): Dit vaccin biedt bescherming tegen difterie, tetanus en pertussis (kinkhoest).
// 4. Hib-vaccin (Haemophilus influenzae type b): Dit vaccin biedt bescherming tegen infecties veroorzaakt door de bacterie Haemophilus influenzae type b.
// 5. Pneumokokkenvaccin (PCV): Dit vaccin biedt bescherming tegen infecties veroorzaakt door de bacterie Streptococcus pneumoniae.
// 6. MenACWY-vaccin (meningokokken ACWY): Dit vaccin biedt bescherming tegen infecties veroorzaakt door de bacterie Neisseria meningitidis serogroepen A, C, W en Y.
// 7. HPV-vaccin (humaan papillomavirus): Dit vaccin biedt bescherming tegen infecties veroorzaakt door het humaan papillomavirus, dat kan leiden tot baarmoederhalskanker en andere kankers.
// Het Rijksvaccinatieprogramma is aan veranderingen onderhevig en kan in de toekomst vaccins van andere types bevatten, afhankelijk van de aanbevelingen van de Gezondheidsraad.