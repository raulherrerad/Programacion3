package tema2;

import java.util.Scanner;

public class EjemploFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El programa lee un n�mero y devuelve su factorial
		// El factorial de un n�mero consiste en multiplicar desde 1 hasta dicho numero
		// todos los numeros, por ejemplo el factorial de 4 es 4!= 4x3x2x1=24

		// Leemos un n�mero entre 1 y 100
		int numLeido = 0;
		long factorial = 1;
		long tiempo = 0;

		Scanner teclado = new Scanner(System.in);

		// leemos el numero
		do {
			System.out.println("Introduce un n�mero:");
			numLeido = teclado.nextInt();
		} while (numLeido < 1 || numLeido > 100);

		// Guardamos el instante actual
		tiempo = System.currentTimeMillis();

		// El bucle va a ir desde 1 hasta el numLeido, tiene que multiplicar factorial
		// por todos
		// Los n�meros en ese intervalo
		for (int i = numLeido; i >= 1; i--) {

			System.out.print(i + "x");

			// Vamos multiplicando factorial por el n�mero que se va incrementando y
			// a�adiendo
			// La multiplicaci�n en factorial
			factorial = factorial * i;

		}

		System.out.println("=" + factorial);

		// El tiempo que ha pasado es el tiempo actual menos el tiempo que guardamos
		// al inicio
		tiempo = System.currentTimeMillis() - tiempo;

		System.out.println("Ha tardado:" + (float) (tiempo));

	}

}
