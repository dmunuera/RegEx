import java.util.regex.*;

public class Ejemplo26 {
	public static void main(String[] args) {
		String texto = "abc de la clase";
		String regex = "^[^\\d].*[^\\d]$";
		// Comprueba si la cadena no acaba con un dígito, opcionalmente precedido de ninguno o varios caracteres.

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