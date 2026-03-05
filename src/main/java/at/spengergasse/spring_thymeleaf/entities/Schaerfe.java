package at.spengergasse.spring_thymeleaf.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Schaerfe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Primärschlüssel

    private String chiliArt; // Name/Art der Chili
    private Integer schaerfe; // Schärfegrad (z. B. 1–10)
    private Integer scoville; // Scoville )

    // Getter/Setter werden von Spring/Thymeleaf für Binding benötigt
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
