package tn.esprit.ds.ski_aziz_allouche.Entities;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skieur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaiss;
    private String ville;

    @OneToMany(mappedBy = "skieur", cascade= CascadeType.REMOVE)
    public List<Inscription> inscription;

    @ManyToMany
    List<Piste> piste;

    @OneToOne(cascade = CascadeType.ALL)
    public Abonnement abonnement;




}
