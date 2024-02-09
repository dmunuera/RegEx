package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String regex = "^[A-Za-z][A-Za-z0-9_#$%?=+-]{2,19}";
		System.out.print("Introduce un nombre de usuario: ");
		String username = teclado.nextLine().trim();
		boolean resultado = username.matches(regex);

		System.out.println("El nombre de usuario" + (resultado ? "" : " NO") + " es VALIDO");
	}
}