package be.ehb.soufiane_bayoud_jfe.Controller;

import be.ehb.soufiane_bayoud_jfe.Model.Auto;
import be.ehb.soufiane_bayoud_jfe.Model.AutoDAO;
import be.ehb.soufiane_bayoud_jfe.Model.HuurderDAO;
import be.ehb.soufiane_bayoud_jfe.Model.VerhuurDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "api/cars", method = RequestMethod.GET)
    public Iterable<Auto> findAll() {
        return autoDAO.findAll();
    }


}
