package miaad.sd.immatriculationservice.webServices.soap;

import miaad.sd.immatriculationservice.webServices.grpc.ProprietaireGrpcService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfig {
    @Autowired
    private Bus bus; // Autowired Bus object for CXF

    @Autowired
    private ProprietaireGrpcService proprietiareService; // Autowired OwnerSoapService object

    @Bean
    public EndpointImpl endpoint() {
        // Create a new EndpointImpl object with the provided Bus and OwnerSoapService
        EndpointImpl endpoint = new EndpointImpl(bus, proprietiareService);

        endpoint.publish("/proprietiareService"); // Publish the SOAP Web Service on the specified URL

        return endpoint; // Return the configured EndpointImpl object
    }
}
