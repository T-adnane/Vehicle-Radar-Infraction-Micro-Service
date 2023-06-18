package miaad.sd.immatriculationservice.webServices.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import miaad.sd.immatriculationservice.entities.Proprietaire;
import miaad.sd.immatriculationservice.repositories.ProprietaireRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@WebService(serviceName = "services")
@AllArgsConstructor
public class ProprietaireService {
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
}
