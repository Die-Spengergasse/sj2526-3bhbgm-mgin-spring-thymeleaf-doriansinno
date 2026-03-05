package at.spengergasse.spring_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Ein sehr einfacher Controller für die Startseite.
 *
 * Zweck:
 * - Lädt das aktuelle Datum in das Model (Attribut "today").
 * - Gibt die View "index" zurück (Thymeleaf-Template index.html).
 */
@Controller
public class HelloController {

    @GetMapping("")
    /**
     * GET auf "/" (Root). Fügt das heutige Datum formatiert hinzu
     * und rendert danach die Startseite.
     */
    public  String index(Model model) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        model.addAttribute("today", LocalDate.now().format(dtf));
        return "index";
    }
}
