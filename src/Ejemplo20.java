import java.util.regex.*;

public class Ejemplo20 {
	public static void main(String[] args) {
		String texto = "abcd ggg";
		String regex = "abc.*";
		// Comprueba si la cadena contiene el patrón “abc”, opcionalmente seguido de ninguno o varios caracteres. 

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