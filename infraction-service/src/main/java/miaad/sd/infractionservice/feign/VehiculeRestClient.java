package miaad.sd.infractionservice.feign;

import miaad.sd.infractionservice.models.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "immatriculation-service")
public interface VehiculeRestClient {
    @GetMapping("/api/vehicule/vehiculeByNumMatricule/{rn}")
    Vehicule getByNumMatricule(@PathVariable String rn);
}
