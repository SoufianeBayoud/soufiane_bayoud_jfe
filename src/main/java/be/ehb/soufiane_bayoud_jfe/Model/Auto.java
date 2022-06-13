package be.ehb.soufiane_bayoud_jfe.Model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @UniqueElements
    private int id;
    private int chassisnr;
    private String merk;
    private String fabrikant;
    private int aantal_deuren;

    public Auto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChassisnr() {
        return chassisnr;
    }

    public void setChassisnr(int chassisnr) {
        this.chassisnr = chassisnr;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getFabrikant() {
        return fabrikant;
    }

    public void setFabrikant(String fabrikant) {
        this.fabrikant = fabrikant;
    }

    public int getAantal_deuren() {
        return aantal_deuren;
    }

    public void setAantal_deuren(int aantal_deuren) {
        this.aantal_deuren = aantal_deuren;
    }
}
