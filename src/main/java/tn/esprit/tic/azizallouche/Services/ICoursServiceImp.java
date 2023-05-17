package tn.esprit.tic.azizallouche.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.azizallouche.entities.Cours;
import tn.esprit.tic.azizallouche.Repositories.CoursRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ICoursServiceImp implements ICoursService{
    private final CoursRepository coursRepository;
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
