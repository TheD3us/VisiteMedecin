package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bo.Adresse;
import bo.MedecinGeneraliste;

public class Medecina {
	static Scanner sc;
	
	public static void main(String[] args) throws IOException{
		int choix = -1;
		ArrayList<MedecinGeneraliste> listeMedecin = new ArrayList<MedecinGeneraliste>();
		sc = new Scanner(System.in);
		lireFichier(listeMedecin);
		while(choix != 0) {
		System.out.println("--------------------------Medecina--------------------------");
		System.out.println("Bienvenue dans Medecina, veuillez choisir votre action :");
		System.out.println("1 - Consulter la liste des médecins");
		System.out.println("2 - Ajouter un médecin à la liste");
		System.out.println("3 - Modifier un médecin de la liste");
		System.out.println("Quitter - rentrez 0 puis Entrée");
		
		choix = sc.nextInt();
		
		switch(choix) {
		case 1 :{
			System.out.println("--------------------------Liste Médecin--------------------------");
				
				for(MedecinGeneraliste current : listeMedecin) {
					current.afficher();
				}
			break;
		}
		case 2 :{
				ajoutMedecin(listeMedecin);
			break;
		}
		case 3 :{
				modifierMedecin(listeMedecin);
		}
		default :{
			for(MedecinGeneraliste current : listeMedecin) {
				current.enregistrerMedecin();
			}
		}
	}
}

	}
	
	public static void ajoutMedecin(List<MedecinGeneraliste> listeMedecin) throws IOException {
		System.out.println("--------------------------Ajout Médecin--------------------------");

		System.out.println("Veuillez rentrer l'adresse du médecin");
		System.out.println("numéro de voie");
		int noVoie = sc.nextInt();
		System.out.println("complément");
		sc.nextLine();
		String complement = sc.nextLine();
		System.out.println("Type de voie");
		String typeDeVoie = sc.nextLine();
		System.out.println("Nom de Rue");
		String nomDeRue = sc.nextLine();
		System.out.println("Code Postal");
		String cpo = sc.nextLine();
		System.out.println("Ville");
		String ville = sc.nextLine();
		System.out.println("N° Appartement");
		String noAp = sc.nextLine();
		System.out.println("Etage");
		String etage = sc.nextLine();
		Adresse adresse = new Adresse(noVoie,complement,typeDeVoie,nomDeRue, cpo, ville, noAp, etage);
		System.out.println("Veuiller rentrer le nom du médecin :");
		String nom = sc.nextLine();
		System.out.println("Veuiller rentrer le prenom du médecin :");
		String prenom = sc.nextLine();
		System.out.println("Veuiller rentrer le numéro de téléphone du médecin :");
		String numeroDeTelephone = sc.nextLine();
		MedecinGeneraliste nomVariable = new MedecinGeneraliste(nom, prenom, numeroDeTelephone, adresse);
		listeMedecin.add(nomVariable);

	}
	
	public static void modifierMedecin(List<MedecinGeneraliste> listeMedecin) {
		System.out.println("--------------------------Modifier Médecin--------------------------");
		int compteur = 1;
		int choix = 0;
		String saisie;
		System.out.println("Veuillez choisir le médecin à modifier : ");
		for(MedecinGeneraliste current : listeMedecin) {
			System.out.print(compteur + " - ");
			current.afficher();
		}
		
		choix = sc.nextInt();
		MedecinGeneraliste medecinChoisit = listeMedecin.get(choix);
		System.out.println("Que voulez vous modifier ?");
		System.out.println("1 - nom ");
		System.out.println("2 - prénom ");
		System.out.println("3 - numéro de téléphone");
		choix = sc.nextInt();
		sc.nextLine();
		switch(choix){
			case 1 :{
				System.out.println("Veuillez modifier le nom :");
				saisie = sc.nextLine();
				medecinChoisit.setNom(saisie);
				System.out.println("Nom modifié");
				break;
			}
			case 2:{
				System.out.println("Veuillez modifier le Prénom :");
				saisie = sc.nextLine();
				medecinChoisit.setPrenom(saisie);
				System.out.println("Prénom modifié");
				break;
			}
			case 3:{
				System.out.println("Veuillez modifier le numéro de téléphone :");
				saisie = sc.nextLine();
				medecinChoisit.setNumeroTelephone(saisie);
				System.out.println("Numéro de téléphone modifié");
				break;
			}
			default:{
				System.out.println("Erreur saisie");
			}
		}
			
	}
	
	public static void lireFichier(ArrayList<MedecinGeneraliste> medecinGeneraliste) throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ib\\eclipse-workspace\\VisiteMedecin\\src\\bo\\Medecin.txt");
		Scanner fichier = new Scanner(fis);
		while(fichier.hasNextLine()) {
			Adresse adresse = new Adresse(fichier.nextInt(),fichier.nextLine(),fichier.nextLine(),fichier.nextLine(),fichier.nextLine(),
					fichier.nextLine(), fichier.nextLine(), fichier.nextLine());
			fichier.nextLine();
			if(adresse.getComplement().equalsIgnoreCase("SO")) {adresse.setComplement("");}
			if(adresse.getEtage().equalsIgnoreCase("SO")) {adresse.setEtage("");}
			if(adresse.getNoAppartement().equalsIgnoreCase("SO")) {adresse.setNoAppartement("");}
			MedecinGeneraliste nomVariable = new MedecinGeneraliste(fichier.nextLine(), fichier.nextLine(), fichier.nextLine(), adresse);
			medecinGeneraliste.add(nomVariable);
		}
		fichier.close();
	}
}
