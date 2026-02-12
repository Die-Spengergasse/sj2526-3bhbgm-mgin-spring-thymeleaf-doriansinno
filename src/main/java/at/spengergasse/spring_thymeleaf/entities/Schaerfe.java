package at.spengergasse.spring_thymeleaf.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Einfache JPA-Entity für Chili-Schärfe Angaben.
 *
 * Felder:
 * - chiliArt: Name/Varietät der Chili (z. B. Jalapeño, Habanero)
 * - schaerfe: frei wählbarer Schärfegrad (z. B. 1–10)
 * - scoville: Scoville Heat Units (SHU) als numerischer Wert
 */
@Entity
public class Schaerfe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Primärschlüssel

    private String chiliArt; // Name/Art der Chili
    private Integer schaerfe; // Schärfegrad (z. B. 1–10)
    private Integer scoville; // Scoville Heat Units (SHU)

    // Getter/Setter werden von Spring/Thymeleaf für Binding benötigt
    public String getChiliArt() {
        return chiliArt;
    }

    public void setChiliArt(String chiliArt) {
        this.chiliArt = chiliArt;
    }

    public Integer getSchaerfe() {
        return schaerfe;
    }

    public void setSchaerfe(Integer schaerfe) {
        this.schaerfe = schaerfe;
    }

    public Integer getScoville() {
        return scoville;
    }

    public void setScoville(Integer scoville) {
        this.scoville = scoville;
    }
}
