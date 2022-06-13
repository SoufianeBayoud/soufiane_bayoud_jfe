package be.ehb.soufiane_bayoud_jfe.Model;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.time.LocalDateTime;

@Entity
public class Verhuur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDateTime start_huur;
    @Future
    private LocalDateTime eind_huur;
    @OneToOne
    @JoinColumn(name = "auto_id")
    private Auto auto;
    @OneToOne
    @JoinColumn(name = "huurder_id")
    private Huurder huurder;

    public Verhuur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getStart_huur() {
        return start_huur;
    }

    public void setStart_huur(LocalDateTime start_huur) {
        this.start_huur = start_huur;
    }

    public LocalDateTime getEind_huur() {
        return eind_huur;
    }

    public void setEind_huur(LocalDateTime eind_huur) {
        this.eind_huur = eind_huur;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Huurder getHuurder() {
        return huurder;
    }

    public void setHuurder(Huurder huurder) {
        this.huurder = huurder;
    }
}
