package at.spengergasse.spring_thymeleaf.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository für Schaerfe-Entities.
 * Stellt Standardmethoden wie findAll, save etc. bereit.
 */
@Repository
public interface SchaerfeRepository extends JpaRepository<Schaerfe, Integer> {
}
