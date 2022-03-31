package tema2;

import java.util.Scanner;

public class EjemploDoWhileAciertaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Generar un número aleatorio y pedir al usuario que lo acierte
		// Si el número es mayor o menor se le indicará al usuario
		int numAleatorio = (int) (Math.random() * 100 + 1);
		int numLeido = -1;
		int numIntentos = 5;
		Scanner teclado = new Scanner(System.in);

		// El bucle se seguira ejecutando hasta que el numero leido see el generado
		// o el numero de intentos sea 0, es decir (numIntentos==0 ||
		// numAleatorio==numLeido)
		// En el while hay que poner la condicion contraria para que siga ejecutandose
		do {
			// Leemos el número por teclado
			System.out.println("MUahahaha jamás acertarás el número secreto. Intentalo:");
			numLeido = teclado.nextInt();
			// Decrementamos el número de intentos
			numIntentos--;

			// Si el número es mayor le damos una pista
			if (numLeido > numAleatorio)
				System.out.println("Alaaaa, te has pasao");
			if (numLeido < numAleatorio)
				System.out.println("Te has quedado corto");

			// Le avisamos en el último intento
			if (numIntentos == 1)
				System.out.println("Ultimo intento MUAHAHAHAHAHHA");

		} while (numIntentos != 0 && numLeido != numAleatorio);

		// Le mostramos el mensaje final
		if (numLeido == numAleatorio) {
			System.out.println("ARGHHHH ME SIEULVOOOOOOOOOOOOOO");

			if (numIntentos == 1)
				System.out.println("EN EL ULTIMO INTENTO, QUE POTRAAAAA");
		} else {
			System.out.println("HAS PERDIDO, ME LLEVO TODOS TUS BITCOINSSSSSS MUAHHHHHAAAA");
			System.out.println("El numero secreto era:" + numAleatorio);
		}

		teclado.close();

	}

}
