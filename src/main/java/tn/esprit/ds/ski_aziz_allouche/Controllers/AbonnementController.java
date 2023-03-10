package tn.esprit.ds.ski_aziz_allouche.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_aziz_allouche.Entities.Abonnement;
import tn.esprit.ds.ski_aziz_allouche.Entities.TypeAbonnement;
import tn.esprit.ds.ski_aziz_allouche.Services.IAbonnementService;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("abonnement")

public class AbonnementController {
    @Autowired
    IAbonnementService iAbonnementService;
    @GetMapping
    public List<Abonnement> getAll(){
        return iAbonnementService.retrieveAllAbonnement();

    }
    @GetMapping("{numAbon}")

    public Optional<Abonnement> retrieveAbonnement(@PathVariable Long numAbon) {

        return  iAbonnementService.retrieveAbonnement(numAbon);

    }
    @PostMapping

    public Abonnement addAbonnement(@RequestBody Abonnement abonnement){

        return iAbonnementService.addAbonnement(abonnement);
    }
    @DeleteMapping("{numAbon}")
    public void removeAbonnement(@PathVariable Long numAbon){

        iAbonnementService.removeAbonnement(numAbon);
    }

    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement) {

        return  iAbonnementService.updateAbonnement(abonnement);

    }
    @GetMapping("type/{TypeAbon}")

    public List<Abonnement> retrieveAbonnementByTypeAbon(@PathVariable TypeAbonnement TypeAbon) {

        return  iAbonnementService.findByTypeAbonOrderByDateDebut(TypeAbon);

    }
}
