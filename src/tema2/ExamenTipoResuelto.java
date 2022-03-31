package tema2;

import java.util.Scanner;

public class ExamenTipoResuelto {

	/*
	 * LISTAS VIDEOJUEGOS
	 * 
	 * Se leeran por teclado los siguientes datos de una serie de videojuegos;
	 * 
	 * nombre puntuación fecha de publicación (día, mes y año) categoría (acción,
	 * plataformas, aventura, deporte) precio formato plataforma (solo una, pc, ps4…
	 * etc) unidades vendidas
	 * 
	 * Una vez leidos los datos queremos tener tres listas, la lista de los mas
	 * vendidos, la lista de los mas hot, y lista por categorías
	 * 
	 * En los más vendidos saldrán los juegos con más de 1 millon de copias vendidas
	 * que hayan sido publicados este año.
	 * 
	 * En los más hot estarán los pertenecientes a ps5 o pc del último mes con
	 * puntuación mayor a 8.
	 * 
	 * Además se mostrara el precio maximo y el nombre del videojuego mas caro, el
	 * precio medio de las dos listas y el porcentaje de videojuegos de cada formato
	 * y categoria.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		//definimos las variables que el usuario introduce
		String nombre="";
		int dia=0,mes=0,anio=0;
		String categoria="";
		double precio=0;
		String plataforma="";
		int unidVend=0;
		int numVideojuegos=0;
		int puntuacion=0;

		
		//Array de nombres para cada lista
		String listaHot[];
		String listaVendidos[];
		
		//Variables para max, min y porcentajes
		int precioMax = Integer.MIN_VALUE;
		String nombreMax="";
		double precioMHot=0;
		double precioMVend=0;
		int cantHot=0;
		int cantVend=0;
		
		Scanner teclado = new Scanner(System.in);
		
		//Preguntamos cuantos videojuegos leeremos
		System.out.println("Introduce el número de videojuegos:");
		numVideojuegos = teclado.nextInt();
		
		//Inicializamos el tamaño del array 
		listaVendidos = new String[numVideojuegos];
		listaHot = new String[numVideojuegos];

		
		
		//leemos numVideojuegos veces los datos
		for(int i=0;i<numVideojuegos;i++)
		{
			
			//Leemos los datos
			System.out.println("Introduce el nombre del videojuego:");
			nombre=teclado.next();
			
			System.out.println("Introduce la puntuacion:");
			puntuacion=teclado.nextInt();
			
			System.out.println("Introduce el dia de lanzamiento:");
			dia=teclado.nextInt();
		
			System.out.println("Introduce el mes de lanzamiento:");
			mes=teclado.nextInt();
		
			System.out.println("Introduce el año de lanzamiento:");
			anio=teclado.nextInt();
		
			System.out.println("Introduce la Categoria:");
			categoria=teclado.next();
		
			System.out.println("Introduce el precio:");
			precio=teclado.nextDouble();
			
			System.out.println("Introduce el Formato (Digital/Fisico):");
			String sFormatoDigital = teclado.next();
		
			System.out.println("Introduce la plataforma:");
			plataforma = teclado.next();
			
			System.out.println("Introduce las unidades vendidas:");
			unidVend = teclado.nextInt();
			
			//Creamos las listas
			//En los más vendidos saldrán los juegos con más de 1 millon de copias vendidas
			// que hayan sido publicados este año.
			if (unidVend>1000000 && anio==2021)
			{
				//Si cumple la condicion de estar en los más vendidos
				//Añadimos el nombre a la lista de mas vendidos
				//Incrementamos la cantidad de la lista
				//Y sumamos el precio para calcular la Media
				listaVendidos[cantVend]=nombre;
				cantVend++;
				precioMVend= precioMVend + precio;
			}
			
			//En los más hot estarán los pertenecientes a ps5 o pc del último mes con
			 // puntuación mayor a 8.
			if ((plataforma.equalsIgnoreCase("PC") || plataforma.equalsIgnoreCase("Ps4")) && mes==11 && puntuacion>8 )
			{
				listaHot[cantHot]=nombre;
				cantHot++;
				precioMHot= precioMHot + precio;
			}
		}
		
		
		//Cerramos el Scanner
		teclado.close();
		

	}

}
