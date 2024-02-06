import java.util.regex.*;

public class Ejemplo01 {
	public static void main(String[] args) {
		String texto = "aa.ssdd.asddd.asd";
		String regex = "asd";
		//Comprueba si la cadena contiene exactamente el patrón "asd"
		
		Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(texto);
		
		System.out.println("Coincidencias:");
		while(coincidencias.find()) {
			System.out.println("INDICE: " + coincidencias.start() + " (FRAGMENTO: " + coincidencias.group() + ")");
		}
	}
}