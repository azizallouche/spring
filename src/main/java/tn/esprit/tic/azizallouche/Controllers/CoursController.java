package tn.esprit.tic.azizallouche.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.azizallouche.entities.Cours;
import tn.esprit.tic.azizallouche.Services.ICoursService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cours")

public class CoursController {

    @Autowired
    ICoursService iCoursService;
    @GetMapping
    public List<Cours> getAll(){
        return iCoursService.retrieveAllCours();

    }
    @GetMapping("{numCours}")

    public Optional<Cours> retrieveCours(@PathVariable Long numCours) {

        return  iCoursService.retrieveCours(numCours);

    }
    @PostMapping

    public Cours addCours(@RequestBody Cours cours){

        return iCoursService.addCours(cours);
    }
    @DeleteMapping("{numCours}")
    public void removeCours(@PathVariable Long numCours){

        iCoursService.removeCours(numCours);
    }
    @PutMapping
    public Cours updateCours(@RequestBody Cours Cours) {

        return  iCoursService.updateCours(Cours);

    }
}
