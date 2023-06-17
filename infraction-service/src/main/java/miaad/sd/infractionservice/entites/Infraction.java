package miaad.sd.infractionservice.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import miaad.sd.infractionservice.models.Radar;
import miaad.sd.infractionservice.models.Vehicule;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Infraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Long radarId;
    private String vehicleMatricule;
    @Transient
    private Vehicule vehicule;
    private double vehicleSpeed;
    @Transient
    private Radar radar;
    private double radarMaxSpeed;
    private double infractionAmount;
}
