package tn.esprit.ds.ski_aziz_allouche.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.skimelekboussif.entities.Cours;

import java.util.List;
import java.util.Optional;

@Service
public class ICoursServiceImp implements ICoursService{

    @Autowired
    CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCours() {
        return  coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);    }

    @Override
    public Optional<Cours> retrieveCours(Long numCours) {
        return coursRepository.findById(numCours);
    }

    @Override
    public void removeCours(Long numCours) {
        coursRepository.deleteById(numCours);
    }
}
