package miaad.sd.immatriculationservice.webServices.grpc;

import com.google.protobuf.Timestamp;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import miaad.sd.immatriculationservice.entities.Proprietaire;
import miaad.sd.immatriculationservice.repositories.ProprietaireRepository;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class ProprietaireGrpcService extends ProprietaireGrpcServiceGrpc.ProprietaireGrpcServiceImplBase {
    private ProprietaireRepository proprietaireRepository;

    @Autowired
    public ProprietaireGrpcService(ProprietaireRepository proprietaireRepository) {
        this.proprietaireRepository = proprietaireRepository;
    }

    @Override
    public void getProprietaire(ProprietaireOuterClass.GetProprietaireRequest request, StreamObserver<ProprietaireOuterClass.GetProprietaireResponse> responseObserver) {
        long id = request.getId();
        Proprietaire proprietaire = proprietaireRepository.findById(id).orElse(null);

        if (proprietaire != null) {
            ProprietaireOuterClass.GetProprietaireResponse response = ProprietaireOuterClass.GetProprietaireResponse.newBuilder()
                    .setProprietaire(convertToProprietaireProto(proprietaire))
                    .build();
            responseObserver.onNext(response);
        } else {
            responseObserver.onError(Status.NOT_FOUND.withDescription("Proprietaire not found").asRuntimeException());
        }

        responseObserver.onCompleted();
    }

    @Override
    public void listProprietaires(ProprietaireOuterClass.GetAllProprietairesRequest request, StreamObserver<ProprietaireOuterClass.GetAllProprietairesResponse> responseObserver) {
        List<Proprietaire> proprietaires = proprietaireRepository.findAll();

        List<ProprietaireOuterClass.Proprietaire> proprietaireProtos = proprietaires.stream()
                .map(this::convertToProprietaireProto)
                .collect(Collectors.toList());

        ProprietaireOuterClass.GetAllProprietairesResponse response = ProprietaireOuterClass.GetAllProprietairesResponse.newBuilder()
                .addAllProprietaires(proprietaireProtos)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void saveProprietaire(ProprietaireOuterClass.SaveProprietaireRequest request, StreamObserver<ProprietaireOuterClass.SaveProprietaireResponse> responseObserver) {
        ProprietaireOuterClass.Proprietaire proprietaireProto = request.getProprietaire();
        Proprietaire proprietaire = convertToProprietaire(proprietaireProto);

        Proprietaire savedProprietaire = proprietaireRepository.save(proprietaire);

        ProprietaireOuterClass.SaveProprietaireResponse response = ProprietaireOuterClass.SaveProprietaireResponse.newBuilder()
                .setProprietaire(convertToProprietaireProto(savedProprietaire))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private ProprietaireOuterClass.Proprietaire convertToProprietaireProto(Proprietaire proprietaire) {
        return ProprietaireOuterClass.Proprietaire.newBuilder()
                .setId(proprietaire.getId())
                .setNom(proprietaire.getNom())
                .setDateNaissance(convertToTimestamp(proprietaire.getDateNaissance()))
                .setEmail(proprietaire.getEmail())
                .build();
    }

    private Proprietaire convertToProprietaire(ProprietaireOuterClass.Proprietaire proprietaireProto) {
        return new Proprietaire(
                proprietaireProto.getId(),
                proprietaireProto.getNom(),
                convertToJavaDate(proprietaireProto.getDateNaissance()),
                proprietaireProto.getEmail()
        );
    }

    private Timestamp convertToTimestamp(java.util.Date date) {
        return Timestamp.newBuilder()
                .setSeconds(date.getTime() / 1000)
                .build();
    }

    private java.util.Date convertToJavaDate(Timestamp timestamp) {
        return new java.util.Date(timestamp.getSeconds() * 1000);
    }

}
