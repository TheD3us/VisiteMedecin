package bo;

import java.time.LocalDate;

public class Patient {

	private String nom;
	private String prenom;
	private String numeroTelephone;
	private char sexe;
	private long numeroSecuriteSociale;
	private LocalDate dateNaissance;
	private String commentaire;

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
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) throws Exception {
		verifSexe(sexe);
		this.sexe = sexe;
	}
	public long getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}
	public void setNumeroSecuriteSociale(long numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Patient(String nom, String prenom, String numeroTelephone, char sexe, long numeroSecuriteSociale,
			LocalDate dateNaissance, String commentaire) throws Exception {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroTelephone = numeroTelephone;
		verifSexe(sexe);
		this.sexe = sexe;
		this.numeroSecuriteSociale = numeroSecuriteSociale;
		this.dateNaissance = dateNaissance;
		this.commentaire = commentaire;
	}
	
	private static void verifSexe(char sexe)throws Exception {
		if(sexe != 'F' && sexe!= 'M') {
			throw new Exception("Un homme ou une femme, le reste est imaginaire");
		}
	}
	
	public void afficher() {
		System.out.println(this.nom + " " + this.prenom + " " + this.numeroTelephone + " " + this.sexe + " " + this.numeroSecuriteSociale + " " + this.dateNaissance + " " + this.commentaire );
	}
	

}
 