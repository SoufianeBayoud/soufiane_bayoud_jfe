package be.ehb.soufiane_bayoud_jfe.Model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Huurder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @UniqueElements
    private int id;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String voornaam;
    @NotBlank
    private String achternaam;
    private int telefoonnumer;



    public Huurder() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public int getTelefoonnumer() {
        return telefoonnumer;
    }

    public void setTelefoonnumer(int telefoonnumer) {
        this.telefoonnumer = telefoonnumer;
    }
}
