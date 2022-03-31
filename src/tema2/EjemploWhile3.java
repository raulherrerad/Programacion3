package tema2;

import java.util.Scanner;

public class EjemploWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hacer un programa que lea la edad de 10 personas
		// y calcule la edad maxima minima y la media

		int i = 0;
		Scanner teclado = new Scanner(System.in);
		int edadMaxima = Integer.MIN_VALUE;
		int edadMinima = Integer.MAX_VALUE;
		int edadMedia = 0;
		int edad = 0;

		while (i <= 9) {
			// Tratamiento de datos
			System.out.println("Introduce la edad del alumno " + (i + 1) + ":");
			edad = teclado.nextInt();

			// Calculamos la edad máxima
			// Si la edad que hemos leido es mayor que la edadMaxima hasta este momento
			//
			if (edad > edadMaxima)
				edadMaxima = edad;

			if (edad < edadMinima)
				edadMinima = edad;

			// Sumamos en edadMedia los valores de las edades de los 10 alumnos
			edadMedia = edadMedia + edad;

			// Pasar al siguiente
			i++;
		}
		// Una vez fuera del bucle, tenemos en edadMedia la suma de todas las edades
		// Para sacar la media lo dividimos entre ele numero de elementos
		edadMedia = edadMedia / 10;

		System.out.println("La edad máxima es: " + edadMaxima);
		System.out.println("La edad mínima es: " + edadMinima);
		System.out.println("La edad media es: " + edadMedia);

	}

}
