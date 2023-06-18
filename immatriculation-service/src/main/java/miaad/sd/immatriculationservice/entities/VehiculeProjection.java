package miaad.sd.immatriculationservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "vehicule", types = Vehicule.class)
public interface VehiculeProjection {
    Long getid();
    String getnumMatricule();
    String getmarque();
    Double getpuissanceFiscale();
    String getmodele();
}
