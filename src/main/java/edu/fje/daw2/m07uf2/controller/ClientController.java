package edu.fje.daw2.m07uf2.controller;

import edu.fje.daw2.m07uf2.PrevisioRepositori;
import edu.fje.daw2.m07uf2.model.Previsio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("previsions")
public class ClientController {

    @Autowired
    private PrevisioRepositori repositori;

    @ModelAttribute("previsions")
    public List<Previsio> inicialitzar() {

        List<Previsio> previsios = new ArrayList<>();
        for (Previsio c : repositori.findAll()) {
           previsios.add(c);
        }
        return previsios;
    }

    @RequestMapping(value={"/previsions", "/usuari"})
    String mostrarFormulari() {
        return("formulari");
    }

    @RequestMapping(value="/desarPrevisions", method = RequestMethod.POST)
    String desarClient(@SessionAttribute("previsions") List<Previsio> previsios,
                        @RequestParam (defaultValue = "") float temperatura,
                        @RequestParam (defaultValue = "") String dia,
                       @RequestParam (defaultValue = "") String temps,
                            ModelMap model){
        Previsio c = new Previsio(temperatura, dia, temps);
        repositori.save(c);

        if(!model.containsAttribute("previsions")) {
            model.addAttribute("previsions", previsios);
        }
        previsios.add(c);
        return("llistaPrevisions");
    }

    @RequestMapping(value="/esborrarPrevisio", method = RequestMethod.GET)
    String esborrarClient(@SessionAttribute("previsions") List<Previsio> previsios,
                       @RequestParam (defaultValue = "") String id){

        System.out.println(id);

        repositori.deleteById(id);
        Previsio t = new Previsio();
        t.setId(id);
        previsios.remove(0);

        return("llistaPrevisions");
    }

}
