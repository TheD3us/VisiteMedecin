package bo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Medecin extends Personne {
	
	protected ArrayList<Creneau> creneaux = new ArrayList<Creneau> ();
	
	
	
	public Medecin(String nom, String prenom, String numeroTelephone, Adresse adresse, ArrayList<Creneau> creneaux) {
		super(nom, prenom, numeroTelephone, adresse);
		this.creneaux = creneaux;
	}



	public Medecin(String nom, String prenom, String numeroTelephone, Adresse adresse) {
		super(nom, prenom, numeroTelephone, adresse);
	}



	public ArrayList<Creneau> getCreneaux() {
		return creneaux;
	}

	public void setCreneaux(ArrayList<Creneau> creneaux) {
		this.creneaux = creneaux;
	}
	
	public void afficher() {
		System.out.println(this.nom + " " + this.prenom + " " + this.numeroTelephone  + " " );
		this.adresse.afficher();
		if(creneaux!= null) {
		for(Creneau current : creneaux) {
			if(current != null) {
			current.afficherCreneau();
			}
		}
		}
	}
	
	public void enregistrer() throws IOException {
		

		try {
		adresse.enregistrerAdresse();
		FileWriterHelper.ecrire(this.nom);
		FileWriterHelper.ecrire(this.prenom);
		FileWriterHelper.ecrire(this.numeroTelephone);

		

		
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
	}
	
	public void ajouterCreneau(Creneau creneau) {
		this.creneaux.add(creneau);
		creneau.setMedecin(this);
	}
	
}
