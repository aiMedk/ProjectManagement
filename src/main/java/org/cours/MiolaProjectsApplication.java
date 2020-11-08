package org.cours;

import org.cours.model.Encadrant;
import org.cours.model.Etudiant;
import org.cours.model.Groupe;
import org.cours.model.Projet;
import org.cours.repos.EncadrantRepos;
import org.cours.repos.EtudiantRepos;
import org.cours.repos.GroupeRepository;
import org.cours.repos.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MiolaProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiolaProjectsApplication.class, args);
	}

	
	@Autowired
	EncadrantRepos encadrantRepo;
	
	@Autowired
	EtudiantRepos etudiantRepo;
	

	@Autowired
	private GroupeRepository groupeRepo;
	
	@Autowired
	private ProjetRepository projetRepo;
	
	@Bean
	CommandLineRunner runner() {
		
		return args -> {
			
			

			String[] TechP1 = {};
			String[] TechP2 = {"Photoshop", "Illustrator"};
			String[] TechP3 = {"Android Studio", "Firebase"};
			
			Projet p1 = new Projet("SmartZoo - Vision Board","projet consiste a élaborer une vison d'un projet.","SCRUM","15 jours","",0);
			Projet p2 = new Projet("SmartZoo - Vision Box","projet consiste a élaborer un box d'un projet.","SCRUM","20 jours","Photoshop, Illustrator",0);
			Projet p3 = new Projet("HealthCare","projet consiste a élaborer une application de gestion d'un cabinet médical","Android","2 mois","Android Studio, Firebase",0);
			
			Encadrant e1 = new Encadrant("Ahmed","Rochdi","Encadrant","GI");
			Encadrant e2 = new Encadrant("Safae","Hilali","Encadrant","BigData");
			Encadrant e3 = new Encadrant("Naoual","Berbiche","Encadrant","Security");
			
			Etudiant et1 = new Etudiant("EL-FAKIR","Mohamed","1578999364","Miola","","","");
			Etudiant et2 = new Etudiant("EL BARHOUMI","Mohamed Iliass","M137320666","Miola","","","");
			Etudiant et3 = new Etudiant("SALIH","Samah","143784903","Miola","","","");
			Etudiant et4 = new Etudiant("ABDULRAHMAN","Ali Ibrahim","G56389X83","Miola","","","");
			
			Groupe g1 = new Groupe("IotGuys");
			Groupe g2 = new Groupe("Eagles");
			
			projetRepo.save(p1);
			projetRepo.save(p2);
			projetRepo.save(p3);
			
			encadrantRepo.save(e1);
			encadrantRepo.save(e2);
			encadrantRepo.save(e3);
			
			etudiantRepo.save(et1);
			etudiantRepo.save(et2);
			etudiantRepo.save(et3);
			etudiantRepo.save(et4);
			
			groupeRepo.save(g1);
			groupeRepo.save(g2);
			
			
			
		};
	}
}
