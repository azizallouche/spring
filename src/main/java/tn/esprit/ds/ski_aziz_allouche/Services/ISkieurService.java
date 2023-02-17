package tn.esprit.ds.ski_aziz_allouche.Services;

import tn.esprit.ds.ski_aziz_allouche.Entities.Skieur;

import java.util.List;
import java.util.Optional;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    Skieur updateSkieur(Skieur skieur);

    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);
}
