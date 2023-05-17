package tn.esprit.tic.azizallouche.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.azizallouche.entities.Abonnement;
import tn.esprit.tic.azizallouche.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long > {
    List<Abonnement> findByTypeAbonOrderByDateDebut(TypeAbonnement typeAbonnement);
    List<Abonnement> findAbonnementByDateDebutAndDateFin(LocalDate startDate, LocalDate endDate);
}


