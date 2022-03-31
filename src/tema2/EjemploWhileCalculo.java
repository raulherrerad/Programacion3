package tema2;

import java.util.Scanner;

public class EjemploWhileCalculo {

	// El programa le pondrá al usuario
	// sumas de dos números entre 1 y 60
	// Le seguira poniedo sumas hasta que falle o tarde mas de 6 segundos en
	// contestar
	// Mientras acierte seguiremos poniendo operaciones
	// Al final se le mostrarán los aciertos
	public static void main(String args[]) {

		// variables
		int numAciertos = -1;
		int num1 = 0, num2 = 0;
		long time;
		int resultado = 0;
		Scanner teclado = new Scanner(System.in);

		do {

			numAciertos++;
			// Generamos los números aleatorios
			num1 = (int) (Math.random() * 60);
			num2 = (int) (Math.random() * 60);

			System.out.println(num1 + " + " + num2 + " = ?:");

			// Inicializamos el tiempo
			time = System.currentTimeMillis();

			resultado = teclado.nextInt();

			// en time guardamos el tiempo en milisegundos que ha tardado en contestar
			time = System.currentTimeMillis() - time;

		} while (resultado == (num1 + num2) && (time <= 5000));

		// Si el tiempo se acabo mostramos el mensaje
		if (time > 5000)
			System.out.println("Se te ha acabado el tiempo");

		if (resultado != (num1 + num2))
			System.out.println("Has fallado!!");

		System.out.println("Has acertado " + numAciertos + " veces. Bien hecho!!");

		teclado.close();
	}
}
