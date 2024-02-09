package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dni = "[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke]$";
		String nie = "^[XYZxyz][0-9]{7}[TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke]$";
		System.out.print("Introduce un nombre de usuario: ");
		String texto = teclado.nextLine().trim();
		boolean resultado1 = texto.matches(dni);
		boolean resultado2 = texto.matches(nie);
		System.out.println("El DNI/NIE" + (resultado1 || resultado2 ? "" : " NO") + " es VALIDO");
	}
}