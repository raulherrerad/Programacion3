package tema2;

import java.util.Scanner;

public class EjemploDoWhileAciertaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Generar un n�mero aleatorio y pedir al usuario que lo acierte
		// Si el n�mero es mayor o menor se le indicar� al usuario
		int numAleatorio = (int) (Math.random() * 100 + 1);
		int numLeido = -1;
		int numIntentos = 5;
		Scanner teclado = new Scanner(System.in);

		// El bucle se seguira ejecutando hasta que el numero leido see el generado
		// o el numero de intentos sea 0, es decir (numIntentos==0 ||
		// numAleatorio==numLeido)
		// En el while hay que poner la condicion contraria para que siga ejecutandose
		do {
			// Leemos el n�mero por teclado
			System.out.println("MUahahaha jam�s acertar�s el n�mero secreto. Intentalo:");
			numLeido = teclado.nextInt();
			// Decrementamos el n�mero de intentos
			numIntentos--;

			// Si el n�mero es mayor le damos una pista
			if (numLeido > numAleatorio)
				System.out.println("Alaaaa, te has pasao");
			if (numLeido < numAleatorio)
				System.out.println("Te has quedado corto");

			// Le avisamos en el �ltimo intento
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
