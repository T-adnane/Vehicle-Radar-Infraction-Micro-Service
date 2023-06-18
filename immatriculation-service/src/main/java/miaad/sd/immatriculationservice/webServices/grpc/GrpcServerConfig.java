package miaad.sd.immatriculationservice.webServices.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;

@Configuration
public class GrpcServerConfig {

    private Server grpcServer;

    private ProprietaireGrpcService proprietaireGrpcService;

    @Autowired
    public GrpcServerConfig(ProprietaireGrpcService proprietaireGrpcService) {
        this.proprietaireGrpcService = proprietaireGrpcService;
    }

    @PostConstruct
    public void startGrpcServer() throws IOException {
        grpcServer = ServerBuilder.forPort(9090)
                .addService(proprietaireGrpcService)
                .build()
                .start();
        System.out.println("gRPC server started on port 9090");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server");
            grpcServer.shutdown();
        }));
    }

    @PreDestroy
    public void stopGrpcServer() {
        if (grpcServer != null) {
            grpcServer.shutdown();
        }
    }
}
