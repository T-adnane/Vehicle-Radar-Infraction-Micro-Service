package miaad.sd.radarservice.entites;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Radar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int maxSpeed = 120;
    private double longitude;
    private double latitude;

}
