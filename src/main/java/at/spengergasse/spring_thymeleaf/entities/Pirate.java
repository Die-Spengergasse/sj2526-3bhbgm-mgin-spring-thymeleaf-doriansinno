package at.spengergasse.spring_thymeleaf.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

/**
 * Einfache JPA-Entity „Pirate“ (Pirat), analog zu „Patient“.
 *
 * Erklärung:
 * - @Entity markiert die Klasse als persistierbar (wird von JPA/Hibernate verwaltet).
 * - @Id kennzeichnet den Primärschlüssel.
 * - @GeneratedValue(strategy = GenerationType.IDENTITY) sagt, dass die Datenbank die ID fortlaufend vergibt.
 */
@Entity
public class Pirate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // eindeutige ID in der Datenbank

    private String name; // Name des Piraten
    private LocalDate birth; // Geburtsdatum des Piraten

    // Getter und Setter: werden von Spring/Thymeleaf benötigt, um auf die Felder zuzugreifen/befüllen
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
}
