package miaad.sd.radarroad.models;

import lombok.Data;

@Data
public class Vehicule {
    private Long id;
    private String numMatricule;
    private String marque;
    private Double puissanceFiscale;
    private String modele;

}
