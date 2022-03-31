package tema4;

public class EjemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char cnombre[] = {'p','e','d','r','o'};
		char[] cnombre2 = {'p','e','d','r','a'};
		char cnombre3[];
		cnombre3 = new char[10];
		
		String nombre5="";
		for(int i=0;i<cnombre.length;i=i+2)
		{
			nombre5 = nombre5 + cnombre[i];
		}
		
		
		
		
		String nombre1 = "Pablo no es no y tambien no en italia, y es un nombre";
		String nombre2 = "Auanito";
		String nombre3 = "Buanjo";
		
		System.out.println("El tamaño de nombre1 es:" + nombre1.length());
		
		System.out.println("Los nombres son" + nombre1.concat(nombre2));
		
		if (nombre1.equals(nombre2)) System.out.println("Son iguales");
		
		System.out.println("El primer no esta en la posicion " + nombre1.indexOf("no"));

		
		System.out.println("El segundo no esta en la posicion " + nombre1.indexOf("no",7));

		int posicion = nombre1.indexOf("no");
		while (posicion!=-1)
		{
			System.out.println("Se ha encontrado un no en " + posicion +  " y es " + nombre1.substring(posicion,posicion+2));
			//Buscamos el siguiente no
			posicion = nombre1.indexOf("no",posicion+1);
		}
		
		double pi = Math.PI;
		//Formateo de posiciones float
		String sPi = String.format(" con precision de 4 posiciones %.4f", pi);
		
		System.out.println("El numero pi es:" + sPi);
		
		//Compareto nos dice cual va antes ordenado alfabeticamente
		if (nombre2.compareTo(nombre3)<0)
			System.out.println(nombre3 + " es posterior alfabeticamente a " + nombre2);
		else
			System.out.println(nombre2 + " es posterior alfabeticamente a " + nombre3);
			
		String nombre4 = nombre1.replace("no ", "si ");
		
		System.out.println(nombre4);
		
	}

}
