package at.spengergasse.spring_thymeleaf.controllers;

import at.spengergasse.spring_thymeleaf.entities.Pirate;
import at.spengergasse.spring_thymeleaf.entities.PirateRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/pirate")
public class PirateController {

    private final PirateRepository pirateRepository;

    public PirateController(PirateRepository pirateRepository) {
        this.pirateRepository = pirateRepository;
    }


    @GetMapping("/list")
    public String pirates(Model model) {
        model.addAttribute("pirates", pirateRepository.findAll());
        return "piratelist";
    }


    @GetMapping("/add")
    public String addPirate(Model model) {
        model.addAttribute("pirate", new Pirate());
        return "add_pirate";
    }


    @PostMapping("/add")
    public String addPirate(@ModelAttribute("pirate") Pirate pirate) {  // wenn ich auf den link .../add klicke, dann wird ein neues Pirate-Objekt erstellt und mit dem Namen "pirate" in das Model gepackt. Das heißt, dass ich in der add_pirate.html auf dieses Objekt zugreifen kann. Wenn ich dann das Formular absende, werden die Daten aus dem Formular in das Pirate-Objekt gepackt und an die Methode übergeben. Dann wird das Pirate-Objekt in die Datenbank gespeichert und ich werde auf die Liste der Piraten weitergeleitet.
        pirateRepository.save(pirate);
        return "redirect:/pirate/list";
    }
}
