import java.util.regex.*;

public class Ejemplo14 {
	public static void main(String[] args) {
		String texto = "JavaWorld";
		String regex = "(a[Ww])";
		// Comprueba si la cadena contiene el grupo "a" seguida de una "w" o "W"

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