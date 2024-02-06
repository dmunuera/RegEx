import java.util.regex.*;

public class Ejemplo30 {
	public static void main(String[] args) {
		String texto = "Prueba9x$";
		String regex = "([a-zA-Z0-9_ñÑ$*-+&!?]){5,}";
		// Comprueba si una contraseña tiene una longitud mínima de 5 caracteres alfanuméricos, incluida la ñ, y los caracteres especiales: $*-+&!?

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