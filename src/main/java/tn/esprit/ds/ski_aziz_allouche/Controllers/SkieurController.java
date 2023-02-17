package tn.esprit.ds.ski_aziz_allouche.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ds.ski_aziz_allouche.Entities.Skieur;
import tn.esprit.ds.ski_aziz_allouche.Services.ISkieurService;

import java.util.List;

@RestController
public class SkieurController {
    @Autowired
    ISkieurService iSkieurService;
    @GetMapping(path = "retrieveSkieurs")
    public List<Skieur> getall(){
        return iSkieurService.retrieveAllSkieurs();
    }
    @PostMapping(path="addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return iSkieurService.addSkieur(skieur);
    }
}
