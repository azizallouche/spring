package tn.esprit.ds.ski_aziz_allouche.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.ski_aziz_allouche.Entities.Skieur;
import tn.esprit.ds.ski_aziz_allouche.Entities.TypeAbonnement;

import java.util.List;


public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    List<Skieur> findSkieurByAbonnementTypeAbon(TypeAbonnement typeAbonnement);
}
