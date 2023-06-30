package miaad.sd.immatriculationservice.webServices.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import miaad.sd.immatriculationservice.entities.Proprietaire;
import miaad.sd.immatriculationservice.repositories.ProprietaireRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Component
@AllArgsConstructor
public class ProprietaireSoapService {
    private ProprietaireRepository proprietaireRepository;

    @WebMethod
    public List<Proprietaire> getProprietaires(){
        return proprietaireRepository.findAll();
    }

    @WebMethod
    public Proprietaire getProprietaireById(@WebParam(name = "id") Long id){
        Proprietaire proprietaire = proprietaireRepository.findById(id).get();
        return proprietaire;
    }

    @WebMethod
    public void createProprietaire(@WebParam(name = "proprietaire") Proprietaire proprietaire) {
        proprietaireRepository.save(proprietaire);
    }
}
