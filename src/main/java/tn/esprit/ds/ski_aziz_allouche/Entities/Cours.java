package tn.esprit.ds.ski_aziz_allouche.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.ORDINAL)
    private Support support;
    private float prix;
    private int crenau;
    @OneToMany(mappedBy = "cours", cascade=CascadeType.REMOVE)
    public List<Inscription> inscription;
    @ManyToOne
    public Monitor monitor;
}
