package tema3;

import java.util.Scanner;

public class FuncionesRecursivas {

	public static long factorialRecursivo(int num) {
		/*
		 * !5=5*!4 !4=4*3*2*1 !3=3*2*1
		 *
		 * !n=n*!(n-1)
		 *
		 * !1 = 1 caso base
		 */

		if (num == 1)
			return 1;
		else
			return num * factorialRecursivo(num - 1);

	}

	/**
	 * Busca el numero num en listaNum de forma recursiva Mira si es el ultimo y
	 * sino llama a la funcion con el array quitando esa ultima posicion
	 * 
	 * @param num      numero a buscar
	 * @param listaNum lista de numeros
	 * @return falso si no esta el numero en la lista, true en caso contrario
	 */
	public static boolean contiene(int num, int listaNum[]) {

		// Caso basico el numero es el último
		if (num == listaNum[listaNum.length - 1])
			return true;
		else
		// Si no es el último y solo teniamos ese elemnto implica que
		// No estaba en la lista, ya los comprobamos todos
		if (listaNum.length == 1)
			return false;
		else
			//Si no es el ultimo y hay mas de un elemento, seguimos
			//buscando llamando a la misma funcion (recursividad)
			//Pero con la lista mas corta eliminando el ultimo que hemos comparado
			return contiene(num, dividirArray(listaNum, 0, listaNum.length - 2));

	}

	/**
	 * Funcion factorial que devuelve la multiplicacion desde 1 hasta el numero recibido
	 * @param num numero del cual buscamos el factorial
	 * @return un entero con la multiplicación
	 */
	long factorialIterativa(int num) {

		long resultado = 1;

		for (int i = 2; i <= num; i++) {
			resultado = resultado * i;
		}

		return resultado;

	}

	public static void menuOperaciones() {

		int op1, op2, opcion;
		Scanner teclado = new Scanner(System.in);

		// Mostramos el menu y leemos la opcion elegida
		System.out.println("MENU\n 1. suma\n 2. Resta\n Opción Elegida:");
		opcion = teclado.nextInt();

		// Leemos los operandos
		System.out.println("Operando 1:");
		op1 = teclado.nextInt();
		System.out.println("Operando 2:");
		op2 = teclado.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("El resultado es: " + (op1 + op2));
			break;
		case 2:
			System.out.println("El resultado es: " + (op1 - op2));
			break;
		default:
			System.out.println("Opcion incorrecta");

		}

		menuOperaciones();

		teclado.close();
	}

	static int[] dividirArray(int listaNumeros[], int inicio, int fin) {

		if (listaNumeros == null)
			return null;
		else if (fin >= listaNumeros.length || inicio > fin)
			return null;

		// Defino un array para guardar el resultado
		// El tamaño sera el indice final menos el inicial
		int listaTemp[] = new int[fin - inicio + 1];

		// definimos j para ir rellenando las posiciones del array a devolver
		int j = 0;
		for (int i = inicio; i <= fin; i++) {
			listaTemp[j] = listaNumeros[i];
			// Pasamos a la siguiente posicion del array a devolver
			j++;
		}

		return listaTemp;

	}

}
