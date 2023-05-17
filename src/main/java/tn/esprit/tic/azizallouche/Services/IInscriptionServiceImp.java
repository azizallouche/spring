package tn.esprit.tic.azizallouche.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.azizallouche.entities.Inscription;
import tn.esprit.tic.azizallouche.Repositories.InscriptionRepository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class IInscriptionServiceImp implements IInscriptionService{
    private final InscriptionRepository inscriptionRepository;
    @Override
    public List<Inscription> retrieveAllInscription() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Optional<Inscription> retrieveInscription(Long numInscription) {
        return inscriptionRepository.findById(numInscription);
    }

    @Override
    public void removeInscription(Long numInscription) {
        inscriptionRepository.deleteById(numInscription);
    }
}
