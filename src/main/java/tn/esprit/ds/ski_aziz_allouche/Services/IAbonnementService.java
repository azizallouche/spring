package tn.esprit.ds.ski_aziz_allouche.Services;

import tn.esprit.ds.ski_aziz_allouche.Entities.Abonnement;
import tn.esprit.ds.ski_aziz_allouche.Entities.Skieur;
import tn.esprit.ds.ski_aziz_allouche.Entities.TypeAbonnement;

import java.util.List;
import java.util.Optional;

public interface IAbonnementService {

    List<Abonnement> retrieveAllAbonnement();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Optional<Abonnement> retrieveAbonnement (Long numAbon);
    List<Abonnement> findByTypeAbonOrderByDateDebut(TypeAbonnement typeAbonnement);

    void removeAbonnement(Long numAbon);
}
