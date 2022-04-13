package bo;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MedecinGeneraliste {
	static String chemin = "C:\\Users\\ib\\eclipse-workspace\\VisiteMedecin\\src\\bo\\Medecin.txt";
	static FileWriter fw;
	static {
		try {
			fw = new FileWriter(chemin);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	


	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private Adresse adresse;
	private static int tarifConsultation = 30;
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}
	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}
	public int getTarifConsultation() {
		return tarifConsultation;
	}
	public void setTarifConsultation(int tarifConsultation) {
		MedecinGeneraliste.tarifConsultation = tarifConsultation;
	}
	
	public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.adresse = adresse;
		
	}
	
	public void afficher() {
		System.out.println(this.nom + " " + this.prenom + " " + this.numeroDeTelephone  + " " );
		this.adresse.afficher();
		System.out.println(" " + tarifConsultation + " euros");
	}
	
	public void enregistrerMedecin() throws IOException {
		

		try {
		fw.write("n - " + this.nom + "\n");
		fw.write("p - " + this.prenom + "\n");
		fw.write("no - " + this.numeroDeTelephone + "\n");
		fw.write("a - " + this.adresse + "\n");
		fw.write("---------------------------------");
		fw.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
	}
	
}
