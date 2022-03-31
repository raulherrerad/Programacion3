package tema2;

import java.util.Scanner;

public class EjemploPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Tu edad:");

		edad = teclado.nextInt();

		if (edad % 2 == 0)
		{
			System.out.println("Tu edad es par");
		}
		else
			System.out.println("Tu edad es impar");

	}

}
