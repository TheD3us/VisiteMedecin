package test;

import bo.Adresse;
import bo.Medecin;
import bo.MedecinSpecialiste;
import bo.MedecinGeneraliste;
public class TestMedecinSpecialiste {

	public static void main(String[] args) {
		Adresse ad01 = new Adresse(4, "Rue", "des moulins", "44000", "Nantes");
		Adresse ad02 = new Adresse(8, "bis", "Avenue", "de la foi", "79000", "Thouars", "", "");
		MedecinGeneraliste med01 = (MedecinGeneraliste) new Medecin("Leblanc", "Michel", "0605487612", ad01);
		MedecinSpecialiste med02 = new MedecinSpecialiste("Vezon", "Sylvie", "0418751295", ad02, null, 70, "Proctologue");
		
		
		med01.afficher();
		med02.afficher();
	}

}
