package tn.esprit.ds.ski_aziz_allouche.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skimelekboussif.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long > {
}