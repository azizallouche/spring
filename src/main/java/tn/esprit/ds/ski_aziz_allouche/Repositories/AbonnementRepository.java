package tn.esprit.ds.ski_aziz_allouche.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.ski_aziz_allouche.Entities.Abonnement;
import tn.esprit.ds.ski_aziz_allouche.Entities.TypeAbonnement;

import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long > {
    List<Abonnement> findByTypeAbon(TypeAbonnement typeAbonnement);
}
