package tn.esprit.ds.ski_aziz_allouche.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_aziz_allouche.Entities.Skieur;
import tn.esprit.ds.ski_aziz_allouche.Repositories.PisteRepository;
import tn.esprit.ds.ski_aziz_allouche.Services.ISkieurService;

import java.util.List;

@RestController
@RequestMapping("/skieur")
public class SkieurController {
    @Autowired
    ISkieurService skieurService;
    @GetMapping
    public List<Skieur> getAll(){
        return skieurService.retrieveAllSkieurs();
    }
    @GetMapping("/{numSkieur}")
    public Skieur retrieveSkieur (@PathVariable Long numSkieur){
        return skieurService.retrieveSkieur(numSkieur);
    }
    @PostMapping
    public Skieur postSkieur(@RequestBody Skieur skieur){
        return skieurService.addSkieur(skieur);
    }
    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur skieur){
        return skieurService.updateSkieur(skieur);
    }
    @DeleteMapping("/{id}")
    public void removeSkieur (@PathVariable(name = "id") Long numSkieur){
        skieurService.removeSkieur(numSkieur);
    }
    @PutMapping("/{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable Long numSkieur,@PathVariable Long numPiste){
        return skieurService.assignSkierToPiste(numSkieur,numPiste);
    }

    @PutMapping("skiAbon/{numSkieur}/{numAbon}")
    public Skieur AssignSkierToSubscription(@PathVariable Long numSkieur,@PathVariable Long numAbon){
        return skieurService.AssignSkierToSubscription(numSkieur,numAbon);
    }
}