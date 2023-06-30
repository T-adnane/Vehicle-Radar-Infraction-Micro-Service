package miaad.sd.infractionservice.repositories;

import feign.Param;
import miaad.sd.infractionservice.entites.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface InfractionRepository extends JpaRepository<Infraction, Long> {

}
