package tema2;

import java.util.Scanner;

public class EjemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		int numTabla = 0;
		Scanner teclado = new Scanner(System.in);

		// leemos un entero
		System.out.print("Introduce un número para mostrar la tabla de multiplicar:");
		numTabla = teclado.nextInt();

		for (int i = 1; i <= 10; i++) {

			// Mostramos la tabla de multiplicar
			System.out.println(numTabla + " x " + i + " = " + (numTabla * i));

		}

		teclado.close();

	}

}
