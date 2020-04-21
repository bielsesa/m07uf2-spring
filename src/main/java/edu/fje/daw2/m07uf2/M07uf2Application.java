package edu.fje.daw2.m07uf2;

import edu.fje.daw2.m07uf2.model.Previsio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class M07uf2Application implements CommandLineRunner {

    @Autowired
    private PrevisioRepositori repositori;

    public static void main(String[] args) {
        SpringApplication.run(M07uf2Application.class, args);
    }

    @RequestMapping(value = "/user")
    public Principal user(Principal principal) {
        return principal;
    }

    @Override
    public void run(String... args) throws Exception {

        repositori.deleteAll();

        repositori.save(new Previsio(13, "21-04-2020", "Nuvolat"));
        repositori.save(new Previsio(50, "23-04-2020", "Solejat"));

        for (Previsio c : repositori.findAll()) {
            System.out.println(c);
        }

        System.out.println();
        System.out.println(repositori.findByDia("21-04-2020"));

        for (Previsio c : repositori.findByDia("23-04-2020")) {
            System.out.println(c);
        }

    }
}
