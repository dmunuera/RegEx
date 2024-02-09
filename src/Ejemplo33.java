public class Ejemplo33 {
	public static void main(String[] args) {
		String texto = "Esto es un texto de ejemplo <titulo>EJEMPLO_TEST</titulo> y vamos a <titulo>quitar</titulo> las etiquetas";
		String textoCorregido = corregir(texto);
		System.out.println("Texto original\n" + texto);
		System.out.println("Texto corregido\n" + textoCorregido);
	}
	
	public static String corregir(String texto) {
		String regex = "(<titulo>)(.+?)(</titulo>)";
		texto = texto.replaceAll(regex, "$2");
		return texto;
	}
}