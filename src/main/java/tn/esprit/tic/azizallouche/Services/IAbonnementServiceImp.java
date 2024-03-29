package tn.esprit.tic.azizallouche.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.azizallouche.entities.Abonnement;
import tn.esprit.tic.azizallouche.Repositories.AbonnementRepository;
import tn.esprit.tic.azizallouche.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class IAbonnementServiceImp implements IAbonnementService{
    private final AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> retrieveAllAbonnement() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Optional<Abonnement> retrieveAbonnement(Long numAbon) {
        return abonnementRepository.findById(numAbon);
    }

    @Override
    public void removeAbonnement(Long numAbon) {
        abonnementRepository.deleteById(numAbon);
    }

    @Override
    public List<Abonnement> getSubscriptionByType(TypeAbonnement type) {
        return abonnementRepository.findByTypeAbonOrderByDateDebut(type);
    }
    @Override
    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return  abonnementRepository.findAbonnementByDateDebutAndDateFin(startDate,endDate);
    }
}
