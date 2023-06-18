package miaad.sd.immatriculationservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProprietaireRequest {
    private String nom;
    private Date dateNaissance;
    private String email;
}
