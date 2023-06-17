package miaad.sd.infractionservice.repositories;

import miaad.sd.infractionservice.entites.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction, Long> {
}
