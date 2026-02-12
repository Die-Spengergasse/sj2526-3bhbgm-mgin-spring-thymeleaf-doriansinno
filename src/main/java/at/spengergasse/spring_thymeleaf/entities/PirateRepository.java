package at.spengergasse.spring_thymeleaf.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository-Schnittstelle für Pirate-Entities.
 *
 * Erklärung:
 * - JpaRepository stellt Standardmethoden wie save, findAll, findById usw. bereit.
 * - <Pirate, Integer> gibt an: verwaltete Entity = Pirate, Typ des Primärschlüssels = Integer.
 */
@Repository
public interface PirateRepository extends JpaRepository<Pirate, Integer> {
}
