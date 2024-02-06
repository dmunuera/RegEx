import java.util.regex.*;

public class Ejemplo31 {
	public static void main(String[] args) {
		String texto = "Prueba9x#";
		String regex = "(?=.*[A-ZÑ])(?=.*[a-zñ])(?=.*\\d)(?=.+[$*-+&¡!¿?%#]).{8,}";
		// Comprueba si una contraseña es robusta con una longitud minima de 8 caracteres incluyendo, al menos,una mayuscula, una minuscula, un numero y un caracter especial

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