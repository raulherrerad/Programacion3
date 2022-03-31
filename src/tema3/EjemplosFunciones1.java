package tema3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class EjemplosFunciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;

		String strEdad="29";
		// Leemos la edad como cadena de texto
		// Que es lo normal en un formulario

		if (esNumerico(strEdad)) {
			edad = Integer.valueOf(strEdad);
			System.out.println("Edad:" + edad);
		} else
			System.out.println("Solo números, pretty please");

		int numeros[] = { 3, 23, 8, 2, 3 };
		int num1 = 7, num2 = 8;
		Date fecha = new Date();
		
		String listaNombres[] = new String[10];
		
		

		System.out.println("La suma de 4 y 5 es:" + suma(num1, num2));

		System.out.println("La suma de los numeros es:" + suma(num1, num2));

		System.out.println("El máximo del array es " + max(numeros));

		System.out.println(fecha.getDate());

		// Genero dos listas de numeros
		int lista1[] = genListaNumeros(50);
		int lista2[] = genListaNumeros(150);
		int lista3[] = concatenarListasNumeros(lista1, lista2);

		mostrarContenido(lista1);
		mostrarContenido(lista2);
		mostrarContenido(lista3);

		// Pruebas de dni correcto
		System.out.println(" El dni 11973309s es " + comprobacionDni("11973309s"));

		System.out.println(" El dni 455890634 es " + comprobacionDni("458944440444S"));

		
		System.out.println("El binario de 16 es" + calcularBinario(16));
		
	}

	/**
	 * La funcion suma dos numeros
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la suma
	 */
	public static int suma(int num1, int num2) {
		int resultado = 0;
		resultado = num1 + num2;

		return resultado;
	}

	// Hacer Resta, multiplicacion y division, la division
	// La division devuelve double y comprueba que no divida por 0
	// Realizar tambien las funciones min y media que reciben un array de numeros

	public static int longitudCad(String cadena) {
		return cadena.length();
	}

	/**
	 * Devuelve el valor maximo de un array de numeros
	 * 
	 * @param listaNumeros array de numeros
	 * @return
	 */
	public static int max(int listaNumeros[]) {
		int max = Integer.MIN_VALUE;
		// Recorremos el array buscando el máximo
		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] > max)
				max = listaNumeros[i];
		}

		// Devolvemos el máximo
		return max;
	}

	/**
	 * Nos comprueba si la letra que recibe es una vocal
	 * 
	 * @param letra
	 * @return
	 */
	static boolean esVocal(char letra) {
		if (Character.toLowerCase(letra) == 'a' || Character.toLowerCase(letra) == 'e'
				|| Character.toLowerCase(letra) == 'i' || Character.toLowerCase(letra) == 'o'
				|| Character.toLowerCase(letra) == 'u') {
//Si lo cumple devolvemos ciert
			return true;
		} else
			return false;

	}

	/**
	 * Recibe dos parametros
	 * 
	 * @param listaNum1
	 * @param listaNum2
	 * @return
	 */
	static int[] concatenarListasNumeros(int listaNum1[], int listaNum2[]) {

		// El tamaño del array final sera la suma de los tamaños de los dos arrays
		// Que recibimos como parametros en la funcion
		int tamTotal = listaNum1.length + listaNum2.length;
		int arrayResultado[] = new int[tamTotal];

		// Copiamos el primer array
		for (int i = 0; i < listaNum1.length; i++) {
			arrayResultado[i] = listaNum1[i];
		}

		// Copiamos el segundo array a partir de la primera posición vacia
		// En el arrayResultado, que es la longitud del primer array
		for (int i = 0; i < listaNum2.length; i++) {
			arrayResultado[i + listaNum1.length] = listaNum2[i];
		}

		// Devolvemos el array
		return arrayResultado;

	}

	/**
	 * Muestra por pantalla los numeros de un array
	 * 
	 * @param listaNum
	 */
	static void mostrarContenido(int listaNum[]) {
		// Mostramos todos los elementos
		int i = 0;
		while (i < listaNum.length) {
			System.out.println("Posición " + (i + 1) + ": " + listaNum[i]);
			i++;
		}

	}

	/**
	 * Nos genera un array de numeros aleatorios
	 * 
	 * @param longitud
	 * @return
	 */
	static int[] genListaNumeros(int longitud) {
		// Creamos un array de numeros con la longitud que nos
		// Pasan como parametro
		int listaGenerada[] = new int[longitud];

		for (int i = 0; i < listaGenerada.length; i++) {
			listaGenerada[i] = (int) (Math.random() * 100 + 1);
		}

		// Devolvemos la lista
		return listaGenerada;
	}

	/**
	 * Comprueba el formato de un dni
	 * 
	 * @param dni
	 * @return Cierto si el formato es correcto
	 */
	public static boolean comprobacionDni(String dni) {
		// Variable para almacenar caracteres temporalmente
		char caracter = ' ';

		// Array de letras del dni asociadas a la posicion correspondiente
		// Al resto de dividir la parte númerica entre 23
		char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		// Si el dni no tiene la longitud adecuada

		if (dni.length() > 9 || dni.length() < 8)
			return false;

		// Si el ultimo caracter no es una letra
		// Devuelvo falso
		/*
		 * Para pasar de string a numero utilizamos la funcion valueOf Que tienen todas
		 * las clases numericas asociadas tipos primitivos como Double Float y Integer
		 * 
		 * Para hacer la operacion contraria, pasar de numero a String Estas mismas
		 * clases tienen la funcion parse, que convierte el número en string
		 */

		// Guardamos el último char del dni en una variable
		caracter = dni.charAt(dni.length() - 1);

		// Guardamos en numeroDni la parte numerica de nuestro dni
		int numeroDni = Integer.valueOf(dni.substring(0, dni.length() - 1));

		if (!Character.isAlphabetic(caracter) || Character.toUpperCase(caracter) != letras[numeroDni % 23])
			return false;

		// Comprobamos que el resto de posiciones son numericas
		for (int i = 0; i < dni.length() - 2; i++) {
			// Comprueba para cada posicion si es un número
			// En caso de no ser un número devuelvo falso
			caracter = dni.charAt(i);
			if (!Character.isDigit(caracter))
				return false;
		}

		return true;

	}

	/**
	 * La funcion comprueba si la cadena de texto contiene un número
	 * 
	 * @param strNumero
	 * @return true si es numerica
	 */
	public static boolean esNumerico(String strNumero) {

		boolean esNumerico = true;
		try {
			// Si no da error la conversion a int
			// Implica que la cadena strNumero es toda númerica
			Integer.valueOf(strNumero);

		} catch (NumberFormatException nfe) {
			// Si entra aqui es que ha saltado un error en la conversion
			// La cadena tiene elementos no númericos
			esNumerico = false;
		}

		return esNumerico;
	}
	
	/**
	 * se calculan los divisores del numero
	 * @param num
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static ArrayList arrayDivisores(int num) {
		ArrayList divisores;
		divisores= new ArrayList();
		int i =1;
		while(i<num) {
			if((num%i)==0) {
				divisores.add(i);
			}
			i++;
		}
		return divisores;
	}
	
	public static String calcularBinario (int numero) {
		
		int digito = 0;
		String binario = "";
		
		while (numero > 0) {
			digito = (numero % 2);
			binario = digito + binario;
			numero = numero / 2;
		}

		return binario;
	}


}
