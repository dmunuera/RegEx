public class Ejemplo32 {
	public static void main(String[] args) {
		String texto = "Hola  , Esto está regular .";
		String textoCorregido = corregir(texto);
		System.out.println("Texto original\n" + texto);
		System.out.println("Texto corregido\n" + textoCorregido);
	}
	
	public static String corregir(String texto) {
		String regex = "(\\w)(\\s+)([\\.,])";
		texto = texto.replaceAll(regex, "$1$3");
		return texto;
	}
}