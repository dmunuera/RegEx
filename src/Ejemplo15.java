import java.util.regex.*;

public class Ejemplo15 {
	public static void main(String[] args) {
		String texto = "aa.ssdd.asddd.asd";
		String regex = "s(asd|dd)";
		// Comprueba si la cadena contiene exactamente el patrón "asd"

		coincidencias(texto, regex);
		
		boolean resultado = texto.matches(regex);
		System.out.println("\nValidado? " + resultado);
	}
	
	public static void coincidencias(String texto, String regex) {
		Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(texto);
		
		System.out.println("Coincidencias:");
		while(coincidencias.find()) {
			System.out.println("INDICE: " + coincidencias.start() + " (FRAGMENTO: " + coincidencias.group() + ")");
		}
	}
}