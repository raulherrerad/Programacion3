package tema2;

import java.io.IOException;
import java.util.Scanner;

public class EjemploWhileMenu {

	final static int OPCION_INTRODUCIR = 1;
	final static int OPCION_CALCULAR = 2;
	final static int OPCION_SALIR = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hacer un programa que lea por teclado varios usuarios
		// nombre, edad, renta, numero de suspensos
		// Y calcule si tiene derecho a beca

		// La beca se le dar� si es menor de 25 a�os y la renta es inferior a 20000
		// O es menor de 18 y ha suspendido 0 asignaturas
		// el importe sera un 10% de la renta, divido entre los supensos en el primer
		// caso
		// Y un 20% de la renta en el segundo

		// Declaraci�n de variables
		int edad = 0, numSuspensos = 0, opcionMenu = 0;
		double renta = 0.0;
		String nombre = "";
		double cuantiaBeca = 0.0;
		Scanner teclado = new Scanner(System.in);

		// Mientras el usuario no seleccione la opci�n de salir seguimos ejecutando
		while (opcionMenu != OPCION_SALIR) {

			// Tratamiento elemento actual
			if (opcionMenu == OPCION_INTRODUCIR) {

				System.out.print("Introduce la edad:");
				edad = teclado.nextInt();
				System.out.print("Introduce el n�mero de suspensos:");
				numSuspensos = teclado.nextInt();
				System.out.print("Introduce la renta:");
				renta = teclado.nextDouble();
				System.out.print("Introduce el nombre:");
				nombre = teclado.nextLine();

			}

			// La beca se le dar� si es menor de 25 a�os y la renta es inferior a 20000
			// O es menor de 18 y ha suspendido 0 asignaturas
			// el importe sera un 10% de la renta, divido entre los supensos en el primer
			// caso
			// Y un 20% de la renta en el segundo

			if (opcionMenu == OPCION_CALCULAR) {

				if (edad < 25 && renta < 20000.0)
					cuantiaBeca = renta * 10 / 100;

				if (edad < 18 && numSuspensos == 0)
					cuantiaBeca = renta * 20 / 100;
				if (cuantiaBeca > 0.0)
					System.out.println("\nTu beca ha sido concedida!!\nLa cuant�a es:" + cuantiaBeca);
				else
					System.out.println("La beca ha sido denegada. Try again.");

				teclado.next();

			}
			try {
				Runtime.getRuntime().exec("cls");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Pasar al siguiente elemento,mostrar el menu y leer la opcion
			System.out.println("\n\n\n\n\n\n\n\n\n****************************************************");
			System.out.println("                     OPCIONES                \n");
			System.out.println("                     1. INTRODUCIR DATOS                ");
			System.out.println("                     2. CALCULAR BECA                ");
			System.out.println("                     3. FINALIZAR PROGRAMAR                ");
			System.out.println("\n\n****************************************************");
			System.out.println("                        OPCION:");
			opcionMenu = teclado.nextInt();

		} // Fin del while del menu

		// Cerramos el scanner
		teclado.close();
	}

}
