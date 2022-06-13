package be.ehb.soufiane_bayoud_jfe.Controller;

import be.ehb.soufiane_bayoud_jfe.DAO.AutoDAO;
import be.ehb.soufiane_bayoud_jfe.DAO.HuurderDAO;
import be.ehb.soufiane_bayoud_jfe.DAO.VerhuurDAO;
import be.ehb.soufiane_bayoud_jfe.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    private AutoDAO autoDAO;
    private HuurderDAO huurderDAO;
    private VerhuurDAO verhuurDAO;

    @Autowired
    public MainController(AutoDAO autoDAO, HuurderDAO huurderDAO, VerhuurDAO verhuurDAO) {
        this.autoDAO = autoDAO;
        this.huurderDAO = huurderDAO;
        this.verhuurDAO = verhuurDAO;
    }

    @RequestMapping(value = "/api/cars", method = RequestMethod.GET)
    public Iterable<Auto> findAllCars() {
        return autoDAO.findAll();
    }

    @RequestMapping(value = "/api/locations", method = RequestMethod.GET)
    private Iterable<Verhuur> findAllLocations() {
        return verhuurDAO.findAll();
    }


    /*Hier gebruiken we een specifieke query die we gaan definiëren in de AutoDAO, ook moeten we de PathVariable gebruiken zodat we
    de te gezochte manufacturer */
    @RequestMapping(value = "/api/cars/{manufacturer}", method = RequestMethod.GET)
    public Iterable<Auto> findAllByFabrikant(@PathVariable("manufacturer") String fabrikant) {
        return autoDAO.findAllByFabrikant(fabrikant);
    }

    @RequestMapping(value = "/api/customers/new", method = RequestMethod.POST)
    public HttpStatus addNewHuurder(@RequestParam("voornaam")String voornaam,
                                    @RequestParam("achternaam")String achternaam,
                                    @RequestParam("email")String email,
                                    @RequestParam("telefoonnummer")int telefoonnummer){
        Huurder huurder = new Huurder();
        huurder.setVoornaam(voornaam);
        huurder.setAchternaam(achternaam);
        huurder.setEmail(email);
        huurder.setTelefoonnumer(telefoonnummer);

        huurderDAO.save(huurder);

        return HttpStatus.OK;

    }


    @RequestMapping(value = "/api/cars/now", method = RequestMethod.GET)
    public HttpStatus getAllCarsNow(@RequestParam("id")int id) {

        /*if(autoDAO.existsById(id)){
            Auto auto = autoDAO.findById(id).get();
            if(huurderDAO.existsById(id)){
                Huurder huurder = huurderDAO.findById(id).get();
                if(verhuurDAO.existsById(id));

            }
        }*/

        /*Checken (via een if) of de id van de verhuur bestaat via verhuurDAO.existsById(id) als die bestaat gaan we
        checken of de eindtijd van de huur groter is dan de starttijd (via if) indien dit het geval creeërt je een controller Verhuur
        die link aan verhuurDAO.findById(id).get(); en daarna ga je verhuur.getAuto() in een lijst returnen. Indien je niet aan de conditie voldoet return je
        HttpStatus.NOT_ACCEPTABLE*/
        return HttpStatus.NOT_ACCEPTABLE;
    }



}
