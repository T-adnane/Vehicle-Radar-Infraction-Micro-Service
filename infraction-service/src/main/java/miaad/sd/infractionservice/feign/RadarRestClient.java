package miaad.sd.infractionservice.feign;

import miaad.sd.infractionservice.models.Radar;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "radar-service")
public interface RadarRestClient {
    @GetMapping("/api/radar/radars/{id}")
    Radar getByRadarById(@PathVariable Long id);
}
