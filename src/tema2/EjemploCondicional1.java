package tema2;

import java.util.Scanner;

import tronan.Personaje;

public class EjemploCondicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personaje ivan = new Personaje();
		//Desde aqui no podemos acceder a los protected
		
		int edad = 0;
		float sueldo = 0.0F;
		String nombre = "", password = "", estadoCivil = "";

		Scanner teclado = new Scanner(System.in);

		// Leemos los datos de teclado
		System.out.println("introduce tu nombre:");
		// Nextline recibe tambien los espacios en blanco
		nombre = teclado.nextLine();

		System.out.println("introduce tu contraseña:");
		// Nextline recibe tambien los espacios en blanco
		password = teclado.nextLine();

		System.out.println("introduce tu estado civil(Soltero, Casado, Divorciado, Zombie):");
		// Nextline recibe tambien los espacios en blanco
		estadoCivil = teclado.nextLine();

		System.out.println("introduce tu edad:");
		edad = teclado.nextInt();

		System.out.println("introduce tu sueldo:");
		sueldo = teclado.nextFloat();

		// Si la edad es mayor o igual de 70 pasa por la puerta C
		if (edad >= 70) {
			// Entra en este código si la condición es cierta
			System.out.println("Pase por la puerta C, por favor.");
		}

		// Si la edad es par lo mandamos por la puerta roja
		// La comparacion son dos ==, la asignacion de valores solo 1 =
		// Para saber si es par obtenemos el resto % de la divison entre 2,
		// Si es 0 es que es par

		if (edad % 2 == 0) {
			System.out.println("Pase por la puerta roja, muahahahaha");
		}

		// El nombre no puede tener más de 8 caracteres
		if (nombre.length() > 8) {
			System.out.println("El nombre no puede tener más de 8 carácteres");

			if (nombre.isEmpty()) {
				System.out.println("No puede estar vacio");
			}
		} else
		// Este código se ejecuta cuando la condicion del if es falsa
		{
			// Guardamos la primera letra del nombre en una variable de tipo char
			char cInicial = nombre.charAt(0);

			// Comprobamos que ese caracter no es un numero
			// if (Character.isDigit(cInicial)) es lo mismo que lo de abajo

			if (cInicial == '0' || cInicial == '1' || cInicial == '2' || cInicial == '3' || cInicial == '4'
					|| cInicial == '5' || cInicial == '6' || cInicial == '7' || cInicial == '8' || cInicial == '9') {
				System.out.println("El primer carácter del nombre no puede ser un número");
			}
		}

		// El password tiene que cumplir mas de 10 caracteres, y que empiece por un 1
		if (password.length() > 10 && password.charAt(0) == '1')
			System.out.println("El password cumple las condiciones");

		// De extra el empleado cobra 100 euros de base
		// si es soltero y menor de 40 años cobra ademas 200 euros
		// Los mayores de 40 cobraran 400 euros
		// Para los menores:
		// Los divorciados mayores de 30 años o que tengan sueldo inferior a 1000 euros
		// cobraran
		// 500
		// A los zombies les quitamos 2000 euros para que se vayan a la competencia
		int extra = 100;

		// Comprobamos si es menor de 40 años y si es soltero, pasamos a minusculas para
		// que
		// no haya problemas de mayusculas y minusculas

		if (edad > 40) {
			// Incrementamos la extra en 400
			// Es igual que poner extra=extra+400;
			extra += 400;
		} else {
			// La edad es menor de 40
			if (estadoCivil.toLowerCase().equals("soltero")) {
				// Se le suma 200 euros a lo que tenía la extra
				extra = extra + 200;
			}

			if (estadoCivil.toUpperCase().equals("DIVORCIADO") && (edad > 30 || sueldo < 1000))
			// ejemplo sueldo 1010 edad 22 estado soltero cierto si se hace primero el &&
			// Si se hace primero el || seria falso
			{
				extra = extra + 500;
			}

			if (estadoCivil.toUpperCase().equals("ZOMBIE")) {
				extra = extra - 2000;
				// extra-=2000;
			}
		}

	}// Cerramos el main
}
