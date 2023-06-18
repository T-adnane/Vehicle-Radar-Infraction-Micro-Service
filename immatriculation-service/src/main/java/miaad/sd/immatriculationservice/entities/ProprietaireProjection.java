package miaad.sd.immatriculationservice.entities;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "proprietaire", types = Proprietaire.class)
public interface ProprietaireProjection {
    Long getid();
    String getnom();
    Date getdateNaissance();
    String getemail();
}
