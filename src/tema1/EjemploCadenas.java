package tema1;

import java.util.Scanner;

public class EjemploCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos las variables
		String texto, palabra;
		int inicio, fin;

		Scanner teclado = new Scanner(System.in);

		// Leemos los datos por teclado
		System.out.print("Introduce la primera cadena (string):");
		texto = teclado.nextLine();

		System.out.print("Introduce la segunda cadena (string):");
		palabra = teclado.next();

		System.out.print("Introduce el inicio:");
		inicio = teclado.nextInt();

		System.out.print("Introduce el fin:");
		fin = teclado.nextInt();

		// Probamos algunas funciones de cadenas
		System.out.println("La longitud de la primera cadena es: " + texto.length());

		// Concatenacion
		System.out.println(texto.concat(" es la primera cadena"));

		System.out.println("El caracter en la posicion  4 es " + texto.charAt(3));

		System.out.println("El caracter en la posicion " + inicio + " es " + texto.charAt(inicio - 1));

		// Substring nos corta la cadena por las posiciones que le indicamos

		String subCadena = texto.substring(inicio, fin);

		String textoPrueba = "Pedro y Juan";

		System.out.println("El primer nombre es: " + textoPrueba.substring(0, 5));

		System.out.println("La subcadena es: " + subCadena);

		System.out.println("El primer String es igual al segundo? " + texto.equals(palabra));

		System.out.println("Posicion de la 2 cadena en la 1: " + texto.indexOf(palabra));

		float media = 0f;

		int num1 = 2, num2 = 3;

		media = (float) (num1 + num2) / 2;

		System.out.println(media);

		// Para leer cadenas con espacios en blanco utilizaremos nextLine
		String cadena = teclado.nextLine();

		teclado.close();

	}

}
