package miaad.sd.immatriculationservice.webServices.soap;

import miaad.sd.immatriculationservice.entities.Proprietaire;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/soap/proprietaire")
public class ProprietaireController {
    private ProprietaireService proprietaireService;

    public ProprietaireController(ProprietaireService proprietaireService) {
        this.proprietaireService = proprietaireService;
    }

    // Get all owners using soap
    @GetMapping("/proprietaires")
    public List<Proprietaire> getProprietaires() {
        return proprietaireService.getProprietaires();
    }

    // Get owner by id using soap
    @GetMapping("/proprietaires/{id}")
    public Proprietaire getProprietaireById(@PathVariable("id") Long id) {
        return proprietaireService.getProprietaireById(id);
    }
}
