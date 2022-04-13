package bo;

import java.time.LocalDate;

public class RendezVous {
	private Creneau creneau;
	private Patient patient;
	private LocalDate date;
	
	public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
		this.creneau = creneau;
		this.patient = patient;
		this.date = date;
	}
	public Creneau getCreneau() {
		return creneau;
	}
	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public void afficherRendezVous() {
		System.out.println(this.date.getDayOfMonth() + "//" + this.date.getMonth() + "//" + this.date.getYear());
		this.creneau.afficherCreneau();
		System.out.println(creneau.getMedecinGeneraliste().getNom());
		creneau.getMedecinGeneraliste().getAdresse().afficher();
		this.patient.afficher();
		
	}
	
	
}
