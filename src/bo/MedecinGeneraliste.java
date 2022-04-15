package bo;


import java.io.IOException;
import java.util.ArrayList;

public class MedecinGeneraliste extends Medecin {
	
	private static int tarifConsultation = 30;
	
	public int getTarifConsultation() {
		return tarifConsultation;
	}
	public void setTarifConsultation(int tarifConsultation) {
		MedecinGeneraliste.tarifConsultation = tarifConsultation;
	}
	
	
	public MedecinGeneraliste(String nom, String prenom, String numeroTelephone, Adresse adresse,
			ArrayList<Creneau> creneaux) {
		super(nom, prenom, numeroTelephone, adresse, creneaux);
	}
	
	
	public void afficher() {
		super.afficher();
		System.out.println(" " + tarifConsultation + " euros");

		}
	@Override
	public void enregistrer() throws IOException {
		super.enregistrer();
		FileWriterHelper.ecrire(tarifConsultation + "\n");
	}
	
	
	
}
