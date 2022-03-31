package tema1;

//para poder utilizar ciertas clases hay que importar los paquetes
import java.util.Scanner;

public class EjemploOperadoresFormato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = 7;
		int operacion = 0;
		int edad = 18;
		int money = 500;

		// Para leer por teclado utilizaremos un objeto Scanner
		Scanner teclado = new Scanner(System.in);

		System.out.println("Esto \" es \t una \n comilla dooble\n\n");

		System.out.println("El resto de la division es: " + numero1 % 2);

		// Por defecto se hace siempre primero la division
		// El orden de operaciones por defecto es
		operacion = 3 + 3 / 3;

		System.out.println("Primero la division:" + operacion);

		// Al ponerlo entre parentesis forzamos a que se haga primero la suma
		operacion = (3 + 3) / 3;

		System.out.println("Primero la suma:" + operacion);

		System.out.println("Es mayor de edad? " + (edad > 18));

		System.out.println("Es mayor de edad? " + (edad >= 18));

		System.out.println("Puede sacar el carnet?" + (edad >= 18 && money >= 500));

		money = 200;
		System.out.println("Puede sacar el carnet?" + (edad >= 18 && money >= 500));

	}

}
