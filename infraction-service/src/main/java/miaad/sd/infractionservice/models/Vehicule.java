package miaad.sd.infractionservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Vehicule {
    private Long id;
    private String numMatricule;
    private String marque;
    private Double puissanceFiscale;
    private String modele;
    private Proprietaire proprietaire;
}
