package tn.esprit.ds.ski_aziz_allouche.Services;

import tn.esprit.ds.ski_aziz_allouche.Entities.Cours;

import java.util.List;
import java.util.Optional;

public interface ICoursService {

    List<Cours> retrieveAllCours();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Optional<Cours> retrieveCours (Long numCours);

    void removeCours(Long numCours);

}
