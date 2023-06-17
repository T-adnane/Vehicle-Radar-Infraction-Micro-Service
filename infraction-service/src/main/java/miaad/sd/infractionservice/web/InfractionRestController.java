package miaad.sd.infractionservice.web;

import miaad.sd.infractionservice.entites.Infraction;
import miaad.sd.infractionservice.feign.RadarRestClient;
import miaad.sd.infractionservice.feign.VehiculeRestClient;
import miaad.sd.infractionservice.models.NewData;
import miaad.sd.infractionservice.models.Radar;
import miaad.sd.infractionservice.models.Vehicule;
import miaad.sd.infractionservice.repositories.InfractionRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RestResource
@RequestMapping("/api/infraction")
public class InfractionRestController {
    private VehiculeRestClient vehiculeRestClient;
    private RadarRestClient radarRestClient;
    private InfractionRepository infractionRepository;

    public InfractionRestController(VehiculeRestClient vehiculeRestClient, RadarRestClient radarRestClient, InfractionRepository infractionRepository) {
        this.vehiculeRestClient = vehiculeRestClient;
        this.radarRestClient = radarRestClient;
        this.infractionRepository = infractionRepository;
    }


    // - Save Infraction
   @PostMapping("/saveInfraction")
    public Infraction saveInfraction(@RequestBody NewData newData){
        Vehicule v = vehiculeRestClient.getByNumMatricule(newData.getRn());
        Radar r = radarRestClient.getByRadarById(newData.getRadarId());
        r.setId(newData.getRadarId());

        Infraction infraction = Infraction.builder()
                .vehicule(v)
                .radar(r)
                .vehicleSpeed(newData.getVehicleSpeed())
                .vehicleMatricule(newData.getRn())
                .radarId(newData.getRadarId())
                .infractionAmount(new Random().nextInt(1000))
                .date(new Date())
                .radarMaxSpeed(r.getMaxSpeed())
                .build();

        infractionRepository.save(infraction);
        return infraction;
    }

    @GetMapping(path = "/fullInfractions")
    public List<Infraction> getFullInfractions(){
        List<Infraction> infractions = infractionRepository.findAll();
        infractions.forEach(infraction -> {
            Vehicule vehicule = vehiculeRestClient.getByNumMatricule(infraction.getVehicleMatricule());
            infraction.setVehicule(vehicule);

            Radar radar = radarRestClient.getByRadarById(infraction.getRadarId());
            radar.setId(infraction.getRadarId());
            infraction.setRadar(radar);

        });
        return infractions;
    }

    @GetMapping("/count")
    public Long getInfractionsCount() {
        return infractionRepository.count();
    }


    @GetMapping(path = "/fullInfractionsPages")
    public Page<Infraction> getFullInfractions(
            @RequestParam(value = "page") int page,
            @RequestParam(value = "size") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Infraction> infractionsPage = infractionRepository.findAll(pageable);
        List<Infraction> infractions = infractionsPage.getContent();
        infractions.forEach(infraction -> {
            Vehicule vehicule = vehiculeRestClient.getByNumMatricule(infraction.getVehicleMatricule());
            infraction.setVehicule(vehicule);

            Radar radar = radarRestClient.getByRadarById(infraction.getRadarId());
            radar.setId(infraction.getRadarId());
            infraction.setRadar(radar);
        });
        long totalElements = infractionsPage.getTotalElements();

        return new PageImpl<>(infractions, pageable,totalElements);
    }

    @GetMapping(path = "/PageInfraction")
    public List<Infraction> getFullInPageInfractions( @RequestParam(value = "page", defaultValue = "0") int page,
                                                    @RequestParam(value = "size", defaultValue = "5") int size){
        List<Infraction> infractions = infractionRepository.findAll();
        infractions.forEach(infraction -> {
            Vehicule vehicule = vehiculeRestClient.getByNumMatricule(infraction.getVehicleMatricule());
            infraction.setVehicule(vehicule);

            Radar radar = radarRestClient.getByRadarById(infraction.getRadarId());
            radar.setId(infraction.getRadarId());
            infraction.setRadar(radar);

        });

        Pageable pageable = PageRequest.of(page, size);
        return infractions;
    }



    @GetMapping(path = "/save/{id}")
    public Infraction getInfraction(@PathVariable(name = "id") Long id){
        Infraction infraction = infractionRepository.findById(id).get();
        Vehicule v = vehiculeRestClient.getByNumMatricule(infraction.getVehicleMatricule());
        Radar r = radarRestClient.getByRadarById(infraction.getRadarId());

        r.setId(infraction.getRadarId());
        infraction.setRadar(r);
        infraction.setVehicule(v);


        return infraction;
    }


}
