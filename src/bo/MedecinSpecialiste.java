package bo;

import java.io.IOException;
import java.util.ArrayList;

public class MedecinSpecialiste extends Medecin {
	private String specialite;
	private int tarifConsultation;
	
	
	
	
	public int getTarifConsultation() {
		return tarifConsultation;
	}

	public void setTarifConsultation(int tarifConsultation) {
		this.tarifConsultation = tarifConsultation;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public MedecinSpecialiste(String nom, String prenom, String numeroTelephone, Adresse adresse,
			ArrayList<Creneau> creneaux, int tarifConsultation, String specialite) {
		super(nom, prenom, numeroTelephone, adresse, creneaux);
		this.specialite = specialite;
		this.tarifConsultation = tarifConsultation;
	}
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println(" " + tarifConsultation + " euros");
		System.out.println(this.specialite);
	
			
		}
	
	@Override
	public void enregistrer() throws IOException {
		super.enregistrer();
		FileWriterHelper.ecrireChiffre(tarifConsultation);
		FileWriterHelper.ecrire(this.specialite);
		FileWriterHelper.ecrire("---------------------------------");
	}
	
	
	
}
