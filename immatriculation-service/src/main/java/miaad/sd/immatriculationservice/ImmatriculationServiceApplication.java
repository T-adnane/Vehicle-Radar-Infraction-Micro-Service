package miaad.sd.immatriculationservice;

import miaad.sd.immatriculationservice.entities.Proprietaire;
import miaad.sd.immatriculationservice.entities.Vehicule;
import miaad.sd.immatriculationservice.repositories.ProprietaireRepository;
import miaad.sd.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ImmatriculationServiceApplication {

	Random random = new Random();

	public static void main(String[] args) {
		SpringApplication.run(ImmatriculationServiceApplication.class, args);
	}

	// Add data to H2 database in start of application
	@Bean
	CommandLineRunner start(VehiculeRepository vehiculeRepository, ProprietaireRepository proprietaireRepository) {
		return args -> {
			Stream.of("TOUZOUZ Adnane", "MOYNE Fetah", "RACHID Amine",
					"HAMID Safae", "MONYR Kamal").forEach(o -> {

				String em = o.replaceAll(" ","");
				Proprietaire proprietaire = Proprietaire.builder()
						.nom(o)
						.email(em+ "@gmail.com")
						.dateNaissance(new Date())
						.build();
				proprietaireRepository.save(proprietaire);
			});

			proprietaireRepository.findAll().forEach(proprietaire -> {
				for (int i = 0; i < 3; i++) {
					Vehicule vehicule = Vehicule.builder()
							.numMatricule(UUID.randomUUID().toString())
							.puissanceFiscale(Double.valueOf(random.nextInt(1000)))
							.marque("brand" + random.nextInt(20))
							.modele("model" + random.nextInt(20))
							.proprietaire(proprietaire)
							.build();
					vehiculeRepository.save(vehicule);
				}
			});

		};
	}
}
