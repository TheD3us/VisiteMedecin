package test;

import bo.Medecin;

public class TestMedecinGeneraliste {

	public static void main(String[] args) {
		
		MedecinGeneraliste med01 = new Medecin("Mazalrey", "Simon", "06.69.69.69.69", null );
		MedecinGeneraliste med02 = new Medecin("Canto", "Thomas", "06.88.88.88.88", null );
		MedecinGeneraliste med03 = new Medecin("Barbason", "Philippe", "06.66.66.66.66", null );
		med01.afficher();
		med02.afficher();
		med03.afficher();
		med03.setNumeroTelephone("3615JESAIGN");
		med01.setTarifConsultation(80);
		med01.afficher();
		med02.afficher();
		med03.afficher();
	}

}
