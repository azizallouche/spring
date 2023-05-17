package tn.esprit.tic.azizallouche.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.azizallouche.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long > {
}
