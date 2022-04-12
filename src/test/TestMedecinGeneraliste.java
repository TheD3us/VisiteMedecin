package test;

import bo.MedecinGeneraliste;

public class TestMedecinGeneraliste {

	public static void main(String[] args) {
		
		MedecinGeneraliste med01 = new MedecinGeneraliste("Mazalrey", "Simon", "06.69.69.69.69" );
		MedecinGeneraliste med02 = new MedecinGeneraliste("Canto", "Thomas", "06.88.88.88.88" );
		MedecinGeneraliste med03 = new MedecinGeneraliste("Barbason", "Philippe", "06.66.66.66.66" );
		med01.afficher();
		med02.afficher();
		med03.afficher();
		med03.setNumeroDeTelephone("3615JESAIGN");
		med01.setTarifConsultation(80);
		med01.afficher();
		med02.afficher();
		med03.afficher();
	}

}
