package bo;

public class MedecinGeneraliste {

	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private static int tarifConsultation = 30;
	
	
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
	
	public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		
	}
	
	public void afficher() {
		System.out.println(this.nom + " " + this.prenom + " " + this.numeroDeTelephone + " " + tarifConsultation + " euros");
	}
}
