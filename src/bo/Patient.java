package bo;

import java.time.LocalDate;

public class Patient extends Personne{

	private char sexe;
	private long numeroSecuriteSociale;
	private LocalDate dateNaissance;
	private String commentaire;

	
	

	
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
			LocalDate dateNaissance, String commentaire, Adresse adresse) throws Exception {
		super(nom, prenom, numeroTelephone, adresse);
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
	@Override
	public void afficher() {
		System.out.println(this.nom + " " + this.prenom + " " + this.numeroTelephone + " " + this.sexe + " "  );
		this.adresse.afficher();
		System.out.println(" "+ this.numeroSecuriteSociale + " " + this.dateNaissance + " " + this.commentaire);
	}
	

}
 