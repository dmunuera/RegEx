import java.util.regex.*;

public class Ejemplo23 {
	public static void main(String[] args) {
		String texto = "abC dfdgfdg asdrabcty";
		String regex = "^[aA][Bb][cC].*";
		// Comprueba si la cadena empieza por “abc” ó “Abc”, opcionalmente seguido de ninguno o varios caracteres.

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