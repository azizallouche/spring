package tn.esprit.ds.ski_aziz_allouche.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_aziz_allouche.Entities.Skieur;
import tn.esprit.ds.ski_aziz_allouche.Services.ISkieurService;

import java.util.List;

@RestController
@RequestMapping
public class SkieurController {
    @Autowired
    ISkieurService iSkieurService;
    @GetMapping
    public List<Skieur> getall(){
        return iSkieurService.retrieveAllSkieurs();
    }
    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return iSkieurService.addSkieur(skieur);
    }
    @GetMapping(path = "{num}")
    public Skieur getbyId(@PathVariable Long num){
        return iSkieurService.retrieveSkieur(num);
    }
    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur skieur){
        return iSkieurService.updateSkieur(skieur);
    }
    @DeleteMapping("{num}")
    public void removeSkieur(@PathVariable Long num){
        iSkieurService.removeSkieur(num);
    }
}
