package test;

import bo.Medecin;
import bo.MedecinGeneraliste;

public class TestMedecinGeneraliste {

	public static void main(String[] args) {
		
		MedecinGeneraliste med01 = new MedecinGeneraliste("Mazalrey", "Simon", "06.69.69.69.69", null, null );
		MedecinGeneraliste med02 = new MedecinGeneraliste("Canto", "Thomas", "06.88.88.88.88", null, null );
		MedecinGeneraliste med03 = new MedecinGeneraliste("Barbason", "Philippe", "06.66.66.66.66", null, null );
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
