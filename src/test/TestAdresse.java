package test;

import bo.Adresse;

public class TestAdresse {

	public static void main(String[] args) {
		
		Adresse ad01 = new Adresse(10, "ter", "rue", "De la Coursive", "79800", "Sainte Verge", "3", "2");
		Adresse ad02 = new Adresse(7, "rue", "Augustin Truveau", "85000", "Paillasson les Bains");
		Adresse ad03 = new Adresse(6, "avenue", "Guillaume Tell", "83200", "Bonlieu");
		ad01.afficher();
		ad02.afficher();
		ad03.afficher();
	}

}
