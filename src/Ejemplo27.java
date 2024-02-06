import java.util.regex.*;

public class Ejemplo27 {
	public static void main(String[] args) {
		String texto = "abc dfdgfdg asdrabcty";
		String regex = "(a|b)+";
		// Comprueba si la cadena contienen los caracteres a ó b.

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