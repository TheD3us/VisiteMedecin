package bo;

public class Adresse {
	private int numeroDeVoie;
	private String complement;
	private String typeVoie;
	private String nomDeRue;
	private String codePostal;
	private String ville;
	private	String noAppartement;
	private String etage;
	
	
	
	
	
	public Adresse(int numeroDeVoie, String typeVoie, String nomDeRue, String codePostal, String ville) {
		this.numeroDeVoie = numeroDeVoie;
		this.typeVoie = typeVoie;
		this.nomDeRue = nomDeRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	
	public Adresse(int numeroDeVoie, String complement, String typeVoie, String nomDeRue, String codePostal,
			String ville, String noAppartement, String etage) {
		this.numeroDeVoie = numeroDeVoie;
		this.complement = complement;
		this.typeVoie = typeVoie;
		this.nomDeRue = nomDeRue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.noAppartement = noAppartement;
		this.etage = etage;
	}
	public int getNumeroDeVoie() {
		return numeroDeVoie;
	}
	public void setNumeroDeVoie(int numeroDeVoie) {
		this.numeroDeVoie = numeroDeVoie;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getTypeVoie() {
		return typeVoie;
	}
	public void setTypeVoie(String typeVoie) {
		this.typeVoie = typeVoie;
	}
	public String getNomDeRue() {
		return nomDeRue;
	}
	public void setNomDeRue(String nomDeRue) {
		this.nomDeRue = nomDeRue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getNoAppartement() {
		return noAppartement;
	}
	public void setNoAppartement(String noAppartement) {
		this.noAppartement = noAppartement;
	}
	public String getEtage() {
		return etage;
	}
	public void setEtage(String etage) {
		this.etage = etage;
	}
	
	public void afficher() {
		if(this.complement == null) {this.complement = "";}
		if(this.noAppartement == null) {this.noAppartement = ""  ;}
		if(this.etage == null) {this.etage = "";}
		System.out.println( this.numeroDeVoie + " " 
		+ this.complement + " " 
		+ this.typeVoie  + " "
		+ this.nomDeRue  + " "
		+ this.codePostal  + " "
		+ this.ville + " "
		+ this.noAppartement + " "
		+ this.etage + " ");
	}

}
