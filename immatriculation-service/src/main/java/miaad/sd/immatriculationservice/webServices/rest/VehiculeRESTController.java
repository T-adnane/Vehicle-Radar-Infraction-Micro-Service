package miaad.sd.immatriculationservice.webServices.rest;

import miaad.sd.immatriculationservice.entities.Vehicule;
import miaad.sd.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicule")
public class VehiculeRESTController {
    private VehiculeRepository vehiculeRepository;

    // Dependencies Injection
    public VehiculeRESTController(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    // Operations in Vehicles

    // Get all vehicles
    @GetMapping("/vehicules")
    public List<Vehicule> getVehicules(){
        return vehiculeRepository.findAll();
    }

    // Get vehicle by id
    @GetMapping("/vehicules/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id){
        return vehiculeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Vehicule %s not found !", id)));
    }

    // Get all vehicles
    @PostMapping("/savevehicule")
    public Vehicule saveVehicle(@RequestBody Vehicule vehicule){
        return vehiculeRepository.save(vehicule);
    }

    // Update vehicle
    @PutMapping ("/updatevehicule/{id}")
    public Vehicule updateVehicule(@PathVariable Long id, @RequestBody Vehicule vehicule){
        Vehicule v = vehiculeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Vehicule %s not found !", id)));

        if(vehicule.getModele() != null) v.setModele(vehicule.getModele());
        if(vehicule.getMarque() != null) v.setMarque(vehicule.getMarque());
        if(vehicule.getPuissanceFiscale() != null) v.setPuissanceFiscale(vehicule.getPuissanceFiscale());
        if(vehicule.getNumMatricule() != null) v.setNumMatricule(vehicule.getNumMatricule());
        if(vehicule.getProprietaire() != null) v.setProprietaire(vehicule.getProprietaire());

        return vehiculeRepository.save(v);
    }

    // Delete vehicle
    @DeleteMapping("/deletevehicule/{id}")
    public void deleteVehicule(@PathVariable Long id){
        vehiculeRepository.deleteById(id);
    }

    // Get all vehicle pages
    @GetMapping("/pageVehicule")
    public Page<Vehicule> getPageVehicule(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);
        return vehiculeRepository.findAll(pageable);
    }

    // Search vehicles pages by regestration number containing
    @GetMapping("/pageVehiculeName/{keyword}")
    public Page<Vehicule> getVehiculesByName(@PathVariable String keyword,
                                           @RequestParam(value = "page", defaultValue = "0") int page,
                                           @RequestParam(value = "size", defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);

        if (keyword.equals(null)) return vehiculeRepository.findAll(pageable);
        return vehiculeRepository.findBynumMatriculeContaining(keyword, pageable);
    }

    // Get number of all vehicles
    @GetMapping("/count")
    public Long getVehiculesCount() {
        return vehiculeRepository.count();
    }

    // Get vehicle by regestration number
    @GetMapping("/vehiculeByNumMatricule/{rn}")
    public Vehicule getByNumMatricule(@PathVariable String rn){
        return vehiculeRepository.findVehiculeBynumMatricule(rn);
    }
}
