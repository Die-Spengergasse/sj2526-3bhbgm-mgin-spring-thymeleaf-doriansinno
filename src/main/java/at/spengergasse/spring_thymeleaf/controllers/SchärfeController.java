package at.spengergasse.spring_thymeleaf.controllers;

import at.spengergasse.spring_thymeleaf.entities.Schaerfe;
import at.spengergasse.spring_thymeleaf.entities.SchaerfeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


@Controller
@RequestMapping("/schaerfe")
public class SchärfeController {

    private final SchaerfeRepository schaerfeRepository;

    public SchärfeController(SchaerfeRepository schaerfeRepository) {
        this.schaerfeRepository = schaerfeRepository;
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("schaerfen", schaerfeRepository.findAll());
        return "Schärfelist";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("schaerfe", new Schaerfe());
        return "add_schärfe";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("schaerfe") Schaerfe schaerfe) {
        schaerfeRepository.save(schaerfe);
        return "redirect:/schaerfe/list";
    }

    @GetMapping("/delete/{id}")
    public String confirmDelete(@PathVariable Integer id, Model model) {
        Optional<Schaerfe> s = schaerfeRepository.findById(id);
        if (s.isPresent()) {
            model.addAttribute("schaerfe", s.get());
            return "delete_schaerfe";
        }
        return "redirect:/schaerfe/list";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        schaerfeRepository.deleteById(id);
        return "redirect:/schaerfe/list";
    }
}
