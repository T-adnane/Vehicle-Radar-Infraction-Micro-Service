package miaad.sd.radarroad;

import lombok.extern.slf4j.Slf4j;
import miaad.sd.radarroad.models.NewData;
import miaad.sd.radarroad.models.Radar;
import miaad.sd.radarroad.models.Vehicule;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@Slf4j
@EnableScheduling
public class RadarDetectionService {
    private final RestTemplate restTemplate;
    private List<Radar> radarList = new ArrayList<>();
    private List<Vehicule> vehiculeList = new ArrayList<>();
    private final Random random = new Random();

    public RadarDetectionService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void loadRadars() {
        ResponseEntity<Radar[]> exchange = restTemplate.exchange("http://localhost:8083/api/radar/radars", HttpMethod.GET, null, Radar[].class);
        ResponseEntity<Vehicule[]> exchangeVehicle = restTemplate.exchange("http://localhost:8081/api/vehicule/vehicules", HttpMethod.GET, null, Vehicule[].class);
        this.radarList = Arrays.asList(exchange.getBody());
        this.vehiculeList = Arrays.asList(exchangeVehicle.getBody());
    }

    @Scheduled(fixedRate = 4000)
    public void submitOverSpeedDetection() {
        loadRadars();
        int indexR = random.nextInt(radarList.size());
        Radar radar = radarList.get(indexR);

        System.out.println("Radar Name : " + radar.getName());
        int indexV = random.nextInt(vehiculeList.size());
        Vehicule vehicule = vehiculeList.get(indexV);
        System.out.println("Vehicule RN : " + vehicule.getNumMatricule());

        NewData newData = new NewData();
        newData.setRadarId(radar.getId());
        newData.setRn(vehicule.getNumMatricule());
        newData.setVehicleSpeed(radar.getMaxSpeed() + new Random().nextInt(100));

        System.out.println("Vehicule Speed : " +newData.getVehicleSpeed());

        this.restTemplate.exchange(
                "http://localhost:8083/api/radar/newInfraction",
                HttpMethod.POST,
                new HttpEntity<>(newData),
                String.class
        );

        System.out.println("----------------------");

    }

}