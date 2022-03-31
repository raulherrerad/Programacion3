package tema1;

import java.io.IOException;
import java.util.Scanner;

public class EjemploLEctura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = 0;
		char sexo;
		String nombre = "";
		float sueldo;

		// Para leer vamos a usar un objeto de tipo scanner
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce tu nombre:");
		// Leemos un String (cadena de texto)
		nombre = teclado.next();

		System.out.print("Introduce tu edad:");
		// Leemos un entero
		edad = teclado.nextInt();

		System.out.print("Introduce tu sexo(M/F):");
		// Leemos un caracter
		sexo = teclado.next().charAt(0);

		System.out.print("Introduce tu sueldo:");
		// Leemos un Float
		sueldo = teclado.nextFloat();

		System.out.println("Tu nombre es " + nombre);
		System.out.println("Tu edad es " + edad);
		System.out.println("Tu sexo es " + sexo);
		System.out.println("Tu sueldo es " + sueldo);

	}

}
