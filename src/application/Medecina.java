package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bo.MedecinGeneraliste;

public class Medecina {
	static Scanner sc;

	public static void main(String[] args) {
		int choix = -1;
		List<MedecinGeneraliste> listeMedecin = new ArrayList<MedecinGeneraliste>();
		
		sc = new Scanner(System.in);
		while(choix != 0) {
		System.out.println("--------------------------Medecina--------------------------");
		System.out.println("Bienvenue dans Medecina, veuillez choisir votre action :");
		System.out.println("1 - Consulter la liste des m�decins");
		System.out.println("2 - Ajouter un m�decin � la liste");
		System.out.println("3 - Modifier un m�decin de la liste");
		System.out.println("Quitter - rentrez 0 puis Entr�e");
		
		choix = sc.nextInt();
		
		switch(choix) {
		case 1 :{
			System.out.println("--------------------------Liste M�decin--------------------------");
			
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
	}
}

	}
	
	public static void ajoutMedecin(List<MedecinGeneraliste> listeMedecin) {
		System.out.println("--------------------------Ajout M�decin--------------------------");
		
		System.out.println("Veuiller rentrer le nom du m�decin :");
		sc.nextLine();
		String nom = sc.nextLine();
		System.out.println("Veuiller rentrer le prenom du m�decin :");
		String prenom = sc.nextLine();
		System.out.println("Veuiller rentrer le num�ro de t�l�phone du m�decin :");
		String numeroDeTelephone = sc.nextLine();
		MedecinGeneraliste nomVariable = new MedecinGeneraliste(nom, prenom, numeroDeTelephone);
		listeMedecin.add(nomVariable);

	}
	
	public static void modifierMedecin(List<MedecinGeneraliste> listeMedecin) {
		System.out.println("--------------------------Modifier M�decin--------------------------");
		int compteur = 1;
		int choix = 0;
		String saisie;
		System.out.println("Veuillez choisir le m�decin � modifier : ");
		for(MedecinGeneraliste current : listeMedecin) {
			System.out.print(compteur + " - ");
			current.afficher();
		}
		
		choix = sc.nextInt();
		MedecinGeneraliste medecinChoisit = listeMedecin.get(choix);
		System.out.println("Que voulez vous modifier ?");
		System.out.println("1 - nom ");
		System.out.println("2 - pr�nom ");
		System.out.println("3 - num�ro de t�l�phone");
		choix = sc.nextInt();
		sc.nextLine();
		switch(choix){
			case 1 :{
				System.out.println("Veuillez modifier le nom :");
				saisie = sc.nextLine();
				medecinChoisit.setNom(saisie);
				System.out.println("Nom modifi�");
				break;
			}
			case 2:{
				System.out.println("Veuillez modifier le Pr�nom :");
				saisie = sc.nextLine();
				medecinChoisit.setPrenom(saisie);
				System.out.println("Pr�nom modifi�");
				break;
			}
			case 3:{
				System.out.println("Veuillez modifier le num�ro de t�l�phone :");
				saisie = sc.nextLine();
				medecinChoisit.setNumeroDeTelephone(saisie);
				System.out.println("Num�ro de t�l�phone modifi�");
				break;
			}
			default:{
				System.out.println("Erreur saisie");
			}
		}
			
	}
}