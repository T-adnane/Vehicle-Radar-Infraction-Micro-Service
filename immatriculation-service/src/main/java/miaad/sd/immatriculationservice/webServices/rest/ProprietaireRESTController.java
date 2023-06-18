package miaad.sd.immatriculationservice.webServices.rest;

import miaad.sd.immatriculationservice.entities.Proprietaire;
import miaad.sd.immatriculationservice.repositories.ProprietaireRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proprietaire")
public class ProprietaireRESTController {
    private final ProprietaireRepository proprietaireRepository;

    public ProprietaireRESTController(ProprietaireRepository proprietaireRepository) {
        this.proprietaireRepository = proprietaireRepository;
    }


    // Get all owners
    @GetMapping("/proprietaires")
    public List<Proprietaire> getproprietaires() {
        return proprietaireRepository.findAll();
    }

    // Get owner by id
    @GetMapping("/proprietaires/{id}")
    public Proprietaire getProprietaireById(@PathVariable Long id) {
        return proprietaireRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Proprietaire %s not found !", id)));
    }


    // Save owner
    @PostMapping("/saveproprietaire")
    public Proprietaire saveProprietaire(@RequestBody Proprietaire proprietaire) {
        return proprietaireRepository.save(proprietaire);
    }

    // Update owner
    @PutMapping("/updateproprietaires/{id}")
    public Proprietaire updateProprietaire(@PathVariable Long id, @RequestBody Proprietaire proprietaire) {
        Proprietaire o = proprietaireRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("proprietiare %s not found !", id)));

        if (proprietaire.getNom() != null) o.setNom(proprietaire.getNom());
        if (proprietaire.getEmail() != null) o.setEmail(proprietaire.getEmail());
        if (proprietaire.getDateNaissance() != null) o.setDateNaissance(proprietaire.getDateNaissance());
        if (proprietaire.getVehicles() != null) o.setVehicles(proprietaire.getVehicles());

        return proprietaireRepository.save(o);
    }

    // Delete owner
    @DeleteMapping("/deleteproprietaires/{id}")
    public void deleteProprietaire(@PathVariable Long id) {
        proprietaireRepository.deleteById(id);
    }
}
