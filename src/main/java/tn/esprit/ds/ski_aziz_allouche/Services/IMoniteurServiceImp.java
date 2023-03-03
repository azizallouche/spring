package tn.esprit.ds.ski_aziz_allouche.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_aziz_allouche.Entities.Monitor;
import tn.esprit.ds.ski_aziz_allouche.Repositories.MoniteurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class IMoniteurServiceImp implements IMoniteurService{

    @Autowired
    MoniteurRepository moniteurRepository;
    @Override
    public List<Monitor> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Monitor addMoniteur(Monitor moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Monitor updateMoniteur(Monitor moniteur) {
        return moniteurRepository.save(moniteur);    }

    @Override
    public Optional<Monitor> retrieveMoniteur(Long numMoniteur) {

        return moniteurRepository.findById(numMoniteur);
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {
        moniteurRepository.deleteById(numMoniteur);

    }
}
