package bo;

import java.time.LocalTime;

public class Creneau {
	private LocalTime heureDebut;
	private int duree;
	private Medecin medecin;
	
	
	public Creneau(LocalTime heureDebut, int duree, Medecin medecin) {
		this.heureDebut = heureDebut;
		this.duree = duree;
		this.medecin = medecin;
	}
	
	public LocalTime getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(LocalTime heureDebut) {
		this.heureDebut = heureDebut;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	public void afficherCreneau() {
		System.out.println(heureDebut.getHour() + "h" + heureDebut.getMinute() + "m" + " " + (heureDebut.plusMinutes(duree)));
	}
	
	
}
