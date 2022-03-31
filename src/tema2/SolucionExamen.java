package tema2;

import java.util.Scanner;

public class SolucionExamen {

	/**
	 * Escribir un programa en java que lea x empleados, de cada empleado tenemos la
	 * siguiente información:
	 * 
	 * -nombre -edad -sueldo -estado civil (S- Soltero, C-Casado, D-Divorciado)
	 * -diasBaja
	 * 
	 * 
	 * Calcular los siguiente. El empleado de mayor edad y la media de edad El
	 * nombre empleado que más cobra y el que menos
	 * 
	 * Queremos sacar una lista de nombres con los empleados que tienen derecho a
	 * jubilación anticipada, tienen que cumplir edad mayor que 55, sueldo mayor de
	 * 35000 o más 100 días de baja
	 * 
	 * Luego también se desea una saber el porcentaje de solteros, casados y
	 * divorciados
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables para leer los datos
		String nombre = "";
		int edad = 0;
		double sueldo = 0;
		String estadoCivil = "";
		int diasBaja = 0;
		int numEmpleados = 0;
		String listaPrejubilados[];

		// Variables para los calculos
		int edadMax = Integer.MIN_VALUE;
		Double maxSueldo = Double.MIN_VALUE;
		Double minSueldo = Double.MAX_VALUE;
		double mediaEdad = 0;
		String nombreMayorSueldo = "", nombreMenorSueldo = "", nombreMayorEdad = "";
		int numSolteros = 0, numCasados = 0, numDivorciados = 0;
		int indicePrejubilados=0;
		String listaJubilados="Lista de jubilados:\n---------------\n\n";

		Scanner teclado = new Scanner(System.in);

		// Leemos el número de empleados
		System.out.println("Cuantos empleados hay?:");
		numEmpleados = teclado.nextInt();
		
		//Inicializamos la lista de jubilados
		listaPrejubilados = new String[numEmpleados];

		// Tratamos a cada empleado en un bucle
		for (int i = 0; i < numEmpleados; i++) {
			
			// Leemos los datos
			System.out.println("Escribe tu nombre:");
			nombre = teclado.next();
			System.out.println("Escribe tu edad:");
			edad = teclado.nextInt();
			System.out.println("Escribe tu sueldo:");
			sueldo = teclado.nextDouble();
			System.out.println("Escribe tu estado civil(S,C,D):");
			estadoCivil = teclado.next();
			System.out.println("Escribe tu dias de baja:");
			diasBaja = teclado.nextInt();

			// Guardamos el numero de empleados de cada estado civil
			// Para calcular las estadisticas
			switch (estadoCivil.toUpperCase()) {
			case "S":
				numSolteros++;
				break;
			case "C":
				numCasados++;
				break;
			case "D":
				numDivorciados++;
				break;
			}

			// Vamos sumando las edades de todos los empleados
			mediaEdad = mediaEdad + edad;

			// Calculamos el máximo sueldo
			if (sueldo > maxSueldo) {
				maxSueldo = sueldo;
				nombreMayorSueldo = nombre;
			}

			// Calculamos el minimo sueldo
			if (sueldo < minSueldo) {
				minSueldo = sueldo;
				nombreMenorSueldo = nombre;
			}

			// Calculamos la edad maxima
			if (edad > edadMax) {
				edadMax = edad;
				nombreMayorEdad = nombre;
			}

			// Sacamos la lista de empleados que cumplan la siguiente condicion
			// edad mayor que 55, sueldo mayor de 35000 o más 100 días de baja
			if (edad>55 && (sueldo>35000 || diasBaja>100))
			{
				listaJubilados.concat("nombre\n");
				System.out.println(nombre);
				listaPrejubilados[indicePrejubilados]=nombre;
				indicePrejubilados++;
			}
			
			
		}//Fin del for de empleados

		System.out.println("El empleado mayor es: " + nombreMayorEdad);
		System.out.println("El empleado que cobra mas es: " + nombreMayorSueldo);
		System.out.println("El empleado que cobra menos es: " + nombreMenorSueldo);
		System.out.println("La edad media es : " + (float)(mediaEdad/numEmpleados));
		System.out.println("El porcentaje de solteros es: " + (float)(numSolteros/numEmpleados)*100);
		System.out.println("El porcentaje de casados es: " + (float)(numCasados/numEmpleados)*100);
		System.out.println("El porcentaje de divorciados es: " + (float)(numDivorciados/numEmpleados)*100);

		
		System.out.println("Lista de Prejubilados");
		for (int i=0;i<listaPrejubilados.length;i++)
		{
			System.out.println("Nombre:" + listaPrejubilados[i]);
		}
		
		System.out.println(listaJubilados);
		
	}

}
