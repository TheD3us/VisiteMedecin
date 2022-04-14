package bo;

public class Personne {
	protected String nom;
	protected String prenom;
	protected String numeroTelephone;
	protected Adresse adresse;
	
	
	
	
	
	public Personne(String nom, String prenom, String numeroTelephone, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroTelephone = numeroTelephone;
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
	public String getNumeroTelephone() {
		return numeroTelephone;
	}
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
}
