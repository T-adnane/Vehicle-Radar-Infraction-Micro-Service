package miaad.sd.immatriculationservice.repositories;

import miaad.sd.immatriculationservice.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface ProprietaireRepository extends JpaRepository<Proprietaire, Long> {
    @RestResource(path = "/byProprietaireId")
    Proprietaire findProprietaireById(@Param("proprietaireId") Long proprietaireId);
}
