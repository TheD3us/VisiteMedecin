package bo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterHelper {
	static String chemin = "C:\\Users\\ib\\eclipse-workspace\\VisiteMedecin\\src\\bo\\Medecin.txt";
	static FileWriter fw;
	static {
		try {
			fw = new FileWriter(chemin);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void ecrire(String text) throws IOException {
		fw.write(text);
	}
	
	public static void ecrireChiffre(int nb) throws IOException {
		fw.write(nb);
	}
	
	public static void fermer() throws IOException {
	fw.close();
	}
}
