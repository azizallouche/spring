package tn.esprit.ds.ski_aziz_allouche.Entities;

import javax.persistence.*;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int numInscription;
   private int numSemaine;
   @ManyToOne
   public Cours cours;
   @ManyToOne
    public Skieur skieur;
}
