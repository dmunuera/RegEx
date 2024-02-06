import java.util.regex.*;

public class Ejemplo11 {
	public static void main(String[] args) {
		String texto = " 0123 Aadd_   d6?f";
		String regex = "\\w";
		// Comprueba si la cadena tiene caracteres SI alfanumericos "\w". Incluye todos los caracteres especiales.
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