package tema4;

import java.io.File;
import java.util.Date;

public class EjemploFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File fichero = new File("c:\\logs\salida.txt");
		
		//Date con la fecha de ultima modificacion
		Date fechaFichero = new Date(fichero.lastModified());
		
		//Fecha actual
		Date hoy = new Date(System.currentTimeMillis());
		
		//Milisegundos en 5 dias
		long cincoDias = 5*24*60*60*1000;
		
		Date hace5dias = new Date(System.currentTimeMillis()-cincoDias);
		
		//Compareto da positivo si la fecha hace5dias es mayor que la del fichero
		//Mayor en fechas se refiere a mas actual
		if (hace5dias.compareTo(fechaFichero)>0)
		{
			System.out.println("Han pasado mas de 5 dias desde que se modifico el fichero");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
