package miaad.sd.immatriculationservice.webServices.graphql;

import miaad.sd.immatriculationservice.entities.Vehicule;
import miaad.sd.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VehiculeGraphqlController {
    private VehiculeRepository vehiculeRepository;

    // Dependencies Injection
    public VehiculeGraphqlController(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    // Operations in Vehicules
    // - Get all vehicules
    @QueryMapping
    public List<Vehicule> getVehicules(){
        return vehiculeRepository.findAll();
    }

    // - Get vehicule by id
    @QueryMapping
    public Vehicule getVehiculeById(@Argument Long id){
        return vehiculeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Vehicule %s not found ! ", id)));
    }

    // - Save vehicule
    @MutationMapping
    public Vehicule addVehicule(@Argument Vehicule vehicule){
        return vehiculeRepository.save(vehicule);
    }

    // - Delete vehicule
    @MutationMapping
    public Boolean deleteVehicule(@Argument Long id){
        vehiculeRepository.deleteById(id);
        return true;
    }
}
