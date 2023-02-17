package tn.esprit.ds.ski_aziz_allouche.Entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Monitor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long numMonitor;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;

    @OneToMany(mappedBy = "monitor", cascade=CascadeType.REMOVE)
    public List<Cours> cours;
}
