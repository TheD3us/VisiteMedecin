package bo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class MedecinGeneraliste extends Personne {
	
	private static int tarifConsultation = 30;
	protected ArrayList<Creneau> creneaux = new ArrayList<Creneau> ();
	
	
	public ArrayList<Creneau> getCreneaux() {
		return creneaux;
	}
	public void setCreneaux(ArrayList<Creneau> creneaux) {
		this.creneaux = creneaux;
	}
	
	public int getTarifConsultation() {
		return tarifConsultation;
	}
	public void setTarifConsultation(int tarifConsultation) {
		MedecinGeneraliste.tarifConsultation = tarifConsultation;
	}
	
	public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
		super(nom, prenom,numeroDeTelephone, adresse);
		
		
	}
	
	
	public MedecinGeneraliste(String nom, String prenom, String numeroTelephone, Adresse adresse,
			ArrayList<Creneau> creneaux) {
		super(nom, prenom, numeroTelephone, adresse);
		this.creneaux = creneaux;
	}
	
	public void afficher() {
		System.out.println(this.nom + " " + this.prenom + " " + this.numeroTelephone  + " " );
		this.adresse.afficher();
		System.out.println(" " + tarifConsultation + " euros");
		if(creneaux != null) {
		for(Creneau current : creneaux) {
			if(current != null) {
			current.afficherCreneau();
			}
		}
		}
	}
	
	public void enregistrerMedecin() throws IOException {
		

		try {
		adresse.enregistrerAdresse();
		FileWriterHelper.ecrire(this.nom + "\n");
		FileWriterHelper.ecrire(this.prenom + "\n");
		FileWriterHelper.ecrire(this.numeroTelephone + "\n");
		
		FileWriterHelper.ecrire("---------------------------------");

		
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
	}
	
	public void ajouterCreneau(Creneau creneau) {
		this.creneaux.add(creneau);
		creneau.setMedecinGeneraliste(this);
	}
	
}
