package tn.esprit.ds.ski_aziz_allouche.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skimelekboussif.entities.Piste;

public interface PisteRepository extends JpaRepository<Piste,Long > {
}