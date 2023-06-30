package miaad.sd.immatriculationservice.webServices.soap;

import miaad.sd.immatriculationservice.repositories.ProprietaireRepository;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfig {
    @Autowired
    private Bus bus;

    @Autowired
    private ProprietaireSoapService proprietiareService;


    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, proprietiareService);
        endpoint.publish("/proprietiareSoapServices");
        return endpoint;
    }
}
