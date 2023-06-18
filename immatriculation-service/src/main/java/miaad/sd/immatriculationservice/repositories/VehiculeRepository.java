package miaad.sd.immatriculationservice.repositories;

import miaad.sd.immatriculationservice.entities.Vehicule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
    // get vehicle by numMatricule
    Vehicule findVehiculeBynumMatricule(String rn);

    // Search vehicule by numMatricule number containing keyword
    Page<Vehicule> findBynumMatriculeContaining(String keyword, Pageable pageable);
}
