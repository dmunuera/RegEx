import java.util.regex.*;

public class Ejemplo19 {
	public static void main(String[] args) {
		String texto = "01 a2a 223";
		String regex = "\\d+";
		// Comprueba si la cadena contiene al menos un grupo de caracteres numéricos.

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