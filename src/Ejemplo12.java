import java.util.regex.*;

public class Ejemplo12 {
	public static void main(String[] args) {
		String texto = " 0123 aadd_   d6?f";
		String regex = "\\b";
		// Comprueba si la cadena tiene separadores de palabras "\b"

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