package tema2;

import java.util.Scanner;

public class EjemplosBuclesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = 24;
		int i = 1;
		int numero = 0;
		Scanner teclado = new Scanner(System.in);

		// Mientras la condicion sea cierta seguira ejecutando las instrucciones
		// De dentro del bucle
		/*
		 * while (edad % 2 == 0) {
		 * 
		 * System.out.println("Tu edad es par"); edad = teclado.nextInt();
		 * 
		 * }
		 */

		// Ejemplo que muestre los primeros 100 numeros
		i = 1;

		while (i <= 100) {

			// Mostramos i
			System.out.println(i);

			// Incrementamos i en 1
			// Esto se suele denominar pasar al siguiente elemento
			i = i + 1;
		}

		// Ejemplo que muestre los primeros 100 numeros pares
		i = 1;

		System.out.println("Numeros Pares");
		while (i <= 100) {

			// Mostramos i
			if (i % 2 == 0)
				System.out.println(i);

			// Incrementamos i en 1
			// Esto se suele denominar pasar al siguiente elemento
			i = i + 1;
		}

		// Ejemplo que muestre los primeros 100 numeros pares de otra forma
		i = 2;

		while (i <= 100) {

			// Mostramos i
			System.out.println(i);

			// Incrementamos i en 1
			// Esto se suele denominar pasar al siguiente elemento
			i = i + 2;
		}

		// Programa que lea un numero y muestre su tabla de multiplicar
		System.out.println("Introduce un número para mostrar su tabla de multiplicar:");
		numero = teclado.nextInt();

		i = 1;
		// El bucle se repetira para i=1 hasta i=10, al poner la condicion i<=10
		// El valor 10 todavía sera válido y entrará en el bucle
		while (i <= 10) {
			// Tratamiento del elemento actual
			// Mostramos la multiplicacion
			System.out.println(numero + " x " + i + " = " + numero * i);

			// Pasar al siguiente elemento
			i++;

		}

		teclado.close();

	}

}
