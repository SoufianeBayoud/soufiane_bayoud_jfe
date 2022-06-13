package be.ehb.soufiane_bayoud_jfe.Model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AutoDAO extends CrudRepository<Auto, Integer> {


    @Query("SELECT * FROM `auto` WHERE `fabrikant` = ?fabrikant")
    Iterable<Auto> findAllByFabrikant(String fabrikant);
}
