package tema4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EjemploListas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listaNumeros = new ArrayList<Integer>();
		ArrayList<String> listaNombres = new ArrayList<String>();
		
		
		//Añadir elementos con add
		for (int i=0;i<10;i++)
			listaNumeros.add((int)(Math.random()*100));
		
		//Accedemos a un elemento con get
		System.out.println("Elemento de la posicion 5:" + listaNumeros.get(4));
		
		//Contains nos dice si el elemento esta en la lista
		if (listaNumeros.contains(4))
			System.out.println("Contiene el numero 4");
		
		System.out.println(listaNumeros.toString());
		
		listaNumeros.add(100);
	
		System.out.println(listaNumeros.toString());

		//Introducir en una posicion especifica
		listaNumeros.add(6, 69);

		System.out.println(listaNumeros.toString());
	
		System.out.println("Tiene " + listaNumeros.size() + " elementos");
		
		//Ejemplo de ordenar
		Collections.sort(listaNumeros);

		System.out.println(listaNumeros.toString());
		
		//Busqueda de posicion
		System.out.println("Posicion 69b " +listaNumeros.indexOf(69));
	
		//Recorrer un arraylist con iterator
		Iterator<Integer> itr = listaNumeros.iterator();
		
		//Numero para guardar los valores de la lista
		int numero=0;
		//Mientras hasnext nos devuelve true, implica que quedan elementos por
		//leer, cuando nos da false, implica que hemos recorrido
		//todos los numeros y ya nos salimos del bucle, al ser la
		//Condicion del while falsa
		while (itr.hasNext())
		{
			//Next nos devuelve el elemento actual de la lista
			//y pasa al siguiente
			numero = itr.next();
			System.out.println(numero + "-");
		}
		
		

	}

}
