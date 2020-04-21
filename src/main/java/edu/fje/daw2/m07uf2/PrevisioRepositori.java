package edu.fje.daw2.m07uf2;

import edu.fje.daw2.m07uf2.model.Previsio;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

/**
 * Interficie de persistència amb Spring Data i MongoDB.
 * @author sergi.grau@fje.edu
 * @version 1.0 02.4.20
 */

public interface PrevisioRepositori extends MongoRepository<Previsio, String> {
    
    Previsio findByTemperatura(float temperatura);
    List<Previsio> findByDia(String dia);
    List<Previsio> findByTemps(String temps);

}