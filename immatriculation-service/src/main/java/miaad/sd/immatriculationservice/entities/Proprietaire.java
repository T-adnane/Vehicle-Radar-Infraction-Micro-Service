package miaad.sd.immatriculationservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "vehicules", includeFieldNames = false)
public class Proprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Date dateNaissance;
    private String email;

    @Transient
    // EAGER == Load vehicles on same time
    @OneToMany(mappedBy = "proprietaire", fetch = FetchType.EAGER)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Vehicule> vehicles;

    public Proprietaire(long id, String nom, Date convertToJavaDate, String email) {
        this.dateNaissance = convertToJavaDate;
        this.id = id;
        this.email = email;
        this.nom = nom;
    }
}