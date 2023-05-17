package tn.esprit.tic.azizallouche.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.azizallouche.entities.Moniteur;
import tn.esprit.tic.azizallouche.Repositories.MoniteurRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class IMoniteurServiceImp implements IMoniteurService{

    private final MoniteurRepository moniteurRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);    }

    @Override
    public Optional<Moniteur> retrieveMoniteur(Long numMoniteur) {

        return moniteurRepository.findById(numMoniteur);
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {
        moniteurRepository.deleteById(numMoniteur);

    }
}
