package miaad.sd.immatriculationservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numMatricule;
    private String marque;
    private Double puissanceFiscale;
    private String modele;

    @ManyToOne
    private Proprietaire proprietaire;
}
