package tema1;

public class Ejemplo1EstructuraProgramaJava {

	// Variable global, definida dentro de la clase
	// Esta variable es accesible (se puede usar) desde cualquier parte
	static int numMax;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables locales al codigo de main

		// Es muy recomendable declarar las variables al principio del bloque
		// de c�digo en el que se utilizen

		// Las variables tienen que tener un nombre que deje bien claro
		// para que se utilizan

		// Se recomiendo declarar cada variable en una linea con un comentario
		// Que indique para que sirven

		// Si hay una serie de variables iguales se pueden declarar en la misma linea;

		// Ejemplo de variables similares en la misma linea
		float media1Daw, media2Daw;

		System.out.println("media1Daw");

		// Las variables deben de tener todas un valor inicial cuando se definen

		char letra;

		letra = 'j';

		// Las constantes se crean utilizando el modificador
		// final antes del tipo de dato
		final double PI = 3.1416;
		// Asignamos a la variable volumen el valor 234.23 multiplicado por 10^2
		// En los valores float hay que poner una f al final
		float volumen = 234.23e3f;

		String Texto;
		boolean casado = true;
		float flotanteSencillo;
		String nombre;

		System.out.println("la variable numMax tiene el valor: " + numMax);
		numMax = 4;

		nombre = "Pedro";
		if (nombre.equals("Pedro")) {
			// Variable Local al c�digo de dentro if
			int numero;
			System.out.println("la variable numMax tiene el valor: " + numMax);
			numMax = 5;
			System.out.println("Eres Pedro");
		}

		System.out.print("Hola tio ");

		System.out.println("Mi nombre es " + nombre + " �Qu� tal estas?");

		System.out.println("la variable numMax tiene el valor: " + numMax);

	}

}
