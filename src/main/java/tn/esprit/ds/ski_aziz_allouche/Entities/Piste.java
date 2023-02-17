package tn.esprit.ds.ski_aziz_allouche.Entities;



import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int pente;
    private int longueur;

    @ManyToMany(mappedBy="piste")
    private List<Skieur> Skieur;
}
