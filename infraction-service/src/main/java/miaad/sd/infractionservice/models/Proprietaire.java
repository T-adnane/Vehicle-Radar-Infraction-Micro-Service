package miaad.sd.infractionservice.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Proprietaire {
    private Long id;
    private String nom;
    private Date dateNaissance;
    private String email;
}
