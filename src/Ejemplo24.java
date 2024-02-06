import java.util.regex.*;

public class Ejemplo24 {
	public static void main(String[] args) {
		String texto = "abc casoplon televisiones sfgsefgsdf";
		String regex = "[a-zA-z]{5,10}";
		// Comprueba si en la cadena hay patrones formados por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.

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