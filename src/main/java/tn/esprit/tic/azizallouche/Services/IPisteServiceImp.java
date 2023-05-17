package tn.esprit.tic.azizallouche.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.azizallouche.entities.Piste;
import tn.esprit.tic.azizallouche.Repositories.PisteRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class IPisteServiceImp implements IPisteService{
    private final PisteRepository pisteRepository;
    @Override
    public List<Piste> retrieveAllPistes() {
        return  pisteRepository.findAll();    }

    @Override
    public Piste addPiste(Piste piste) {
         return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Optional<Piste> retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste);
    }

    @Override
    public void removePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }
}
