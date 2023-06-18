package miaad.sd.immatriculationservice.webServices.graphql;

import miaad.sd.immatriculationservice.entities.Proprietaire;
import miaad.sd.immatriculationservice.entities.ProprietaireRequest;
import miaad.sd.immatriculationservice.repositories.ProprietaireRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProprietaireGraphqlController {
    private ProprietaireRepository proprietaireRepository;

    // Dependencies Injection
    public ProprietaireGraphqlController(ProprietaireRepository proprietaireRepository) {
        this.proprietaireRepository = proprietaireRepository;
    }

    // Operations in proprietaire
    // - Get all owners
    @QueryMapping
    public List<Proprietaire> getProprietaires(){
        return proprietaireRepository.findAll();
    }

    // - Get proprietaire by id
    @QueryMapping
    public Proprietaire getProprietaireById(@Argument Long id){
        return proprietaireRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Proprietaire %s not found ! ", id)));
    }

    // - Save proprietaire
    @MutationMapping
    public Proprietaire addOwner(@Argument ProprietaireRequest proprietaire){
        Proprietaire o = new Proprietaire();
        o.setNom(proprietaire.getNom());
        o.setEmail(proprietaire.getEmail());
        o.setDateNaissance(proprietaire.getDateNaissance());
        return proprietaireRepository.save(o);
    }

    // - Delete proprietaire
    @MutationMapping
    public Boolean deleteProprietaire(@Argument Long id){
        proprietaireRepository.deleteById(id);
        return true;
    }
}
