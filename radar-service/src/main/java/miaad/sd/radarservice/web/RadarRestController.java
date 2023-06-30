package miaad.sd.radarservice.web;

import miaad.sd.radarservice.entites.Radar;
import miaad.sd.radarservice.feign.InfractionRestClient;

import miaad.sd.radarservice.models.NewData;
import miaad.sd.radarservice.repositories.RadarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RestResource
@RequestMapping("/api/radar")
@Component
public class RadarRestController {
    private RadarRepository radarRepository;
    private InfractionRestClient infractionRestClient;

    public RadarRestController(RadarRepository radarRepository,
                               InfractionRestClient infractionRestClient) {
        this.radarRepository = radarRepository;
        this.infractionRestClient = infractionRestClient;
    }

    // Operations in Radars

    // - Get all radars


    @GetMapping("/pageRadar")
    public Page<Radar> getPageRadar(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);
        return radarRepository.findAll(pageable);
    }

    @GetMapping("/pageRadarName/{keyword}")
    public Page<Radar> getRadarsByName(@PathVariable String keyword,
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);

        if (keyword.equals(null)) return radarRepository.findAll(pageable);
        return radarRepository.findByNameContains(keyword, pageable);
    }
    @GetMapping("/radars")
    public List<Radar> getRadars(){
        return radarRepository.findAll();
    }

    @GetMapping("/count")
    public Long getRadarsCount() {
        return radarRepository.count();
    }

    @GetMapping("/radars/{id}")
    public Radar getRadarById(@PathVariable Long id){
        return radarRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Radar %s not found !", id)));
    }
    @PostMapping("/newInfraction")
    public void newInfraction(@RequestBody NewData newData){
        infractionRestClient.saveInfraction(newData);
    }

    @PostMapping("/addRadar")
    public Radar addRadar(@RequestBody Radar radar) {
        return radarRepository.save(radar);
    }

    @DeleteMapping("/deleteRadar/{id}")
    public void deleteRadar(@PathVariable Long id) {
        radarRepository.deleteById(id);
    }

    @PutMapping("/updateRadar/{id}")
    public Radar updateRadar(@PathVariable Long id, @RequestBody Radar updatedRadar) {
        Radar existingRadar = radarRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Radar %s not found!", id)));

        existingRadar.setName(updatedRadar.getName());
        existingRadar.setMaxSpeed(updatedRadar.getMaxSpeed());
        existingRadar.setLongitude(updatedRadar.getLongitude());
        existingRadar.setLatitude(updatedRadar.getLatitude());
        existingRadar.setId(updatedRadar.getId());

        return radarRepository.save(existingRadar);
    }


}
