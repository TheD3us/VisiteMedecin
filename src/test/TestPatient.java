package test;

import java.time.LocalDate;

import bo.Patient;

public class TestPatient {

	public static void main(String[] args) throws Exception {
		LocalDate datePat01 = LocalDate.of(1978, 12, 4);
		Patient pat01 = new Patient("Bezos", "Jeff", "06.06.06.06.06", 'M', 1785816847777l , datePat01,"gros ***");
		LocalDate datePat02 = LocalDate.of(1960, 1, 4);
		Patient pat02 = new Patient("Gates", "Bill", "06.06.06.06.07", 'M', 1601851518841l , datePat02,"Saint Gate, vérifier la vue");
		LocalDate datePat03 = LocalDate.of(1966, 12, 4);
		Patient pat03 = new Patient("Macron", "Emmanuel", "06.66.06.66.06", 'M', 178189151841l , datePat03,"Vérifiez vos poches quand il s'en va !!!");
		pat01.afficher();
		pat02.afficher();
		pat03.afficher();

	}

}
