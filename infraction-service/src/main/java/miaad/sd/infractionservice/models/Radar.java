package miaad.sd.infractionservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Radar {
    private Long id;
    private String name;
    private int maxSpeed;
    private double longitude;
    private double latitude;
}
