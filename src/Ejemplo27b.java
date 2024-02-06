import java.util.regex.*;

public class Ejemplo27b {
	public static void main(String[] args) {
		String texto = "abc dfdgfdg asterdrabcty";
		String regex = "^([aA][bB][cC]|[xX][yY][zZ]).*([pP][aA][rR]|[tT][eE][rR]).*";
		// Que la cadena empiece por "abc" o "xyz", seguido de un caracter cualquiera 0 o mas veces, seguido de "par" o "ter", seguido de un caracter cualquiera 0 o mas veces, todo independiente de mayusculas o minusculas
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