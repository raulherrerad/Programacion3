package tema4;

import java.io.File;
import java.io.IOException;

public class GestionFicheros {
	
	public static final int OK =0;
	public static final int FICHERO_NO_ENCONTRADO =-1;
	public static final int ERROR_LECTURA =-2;
	public static final int ERROR_BORRADO =-3;
	public static final int TIPO_ERROR =-4;
	public static final int FICHERO_EXISTE =-5;
	public static final int ERROR_ESCRITURA =-6;

	public int eliminarFichero(String rutaFichero)
	{
		//Definimos la variables que guarda el resultado
		int resultado = OK;
		
		File fichero = new File(rutaFichero);
		
		if (!fichero.delete())
			resultado = ERROR_BORRADO;
		
		//Devolvemos el resultado de la operacion
		return resultado;
	}
	
	/**
	 * Devuelve null si el directorio esta vacio y Ok si no
	 * La salida logica seria true o false, pero es para testear con junit
	 * @param rutaDirectorio
	 * @return
	 */
	public static String directorioVacio(String rutaDirectorio)
	{
		//Definimos la variables que guarda el resultado
		String resultado = null;
		
		File directorio = new File(rutaDirectorio);
		if (!directorio.isDirectory())
		{
			resultado = null;
			System.out.println("No es un directorio");
		}
		else
		{
			
			//Con esta funcion nos devuelve un array de file
			//Y podemos modificarlos y hacer lo que queramos
			//
			//File listaficheros[] = fichero.listFiles()
		
			String listaFicheros[] = directorio.list();
			
			System.out.println("El directorio contiene " + listaFicheros.length);
			
			if (listaFicheros.length==0)
				resultado = "OK";
			else
				resultado = null;
			
			
			
		}
		
		//Devolvemos el resultado de la operacion
		return resultado;
	}	
	
	public static int mostrarContenidoDirectorio(String rutaDirectorio)
	{
		//Definimos la variables que guarda el resultado
		int resultado = OK;
		
		File fichero = new File(rutaDirectorio);
		if (!fichero.isDirectory())
			resultado = TIPO_ERROR;
		else
		{
			
			//Con esta funcion nos devuelve un array de file
			//Y podemos modificarlos y hacer lo que queramos
			//
			//File listaficheros[] = fichero.listFiles()
		
			String listaFicheros[] = fichero.list();
			//Mostramos por pantalla todos los nombres
			for(int i=0;i<listaFicheros.length;i++)
			{
				System.out.println(listaFicheros[i]);
			}
			
		}
		
		//Devolvemos el resultado de la operacion
		return resultado;
	}
	
	public static int crearFichero(String rutaFichero)
	{
		//Definimos la variables que guarda el resultado
		int resultado = OK;
		
		File fichero = new File(rutaFichero);
		
		if (fichero.exists())
			resultado = FICHERO_EXISTE;
		else
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//Devolvemos el resultado de la operacion
		return resultado;
	}	
	
	public static int crearDirectorio(String rutaDirectorio, String nombre)
	{
		//Definimos la variables que guarda el resultado
		int resultado = OK;
		
		File directorioRaiz = new File(rutaDirectorio);
		File directorio = new File(rutaDirectorio + "\\" + nombre);
		
		//Compruebo si es un directorio
		if (!directorioRaiz.isDirectory())
			resultado = TIPO_ERROR;
		else
			if (!directorioRaiz.canWrite())
				resultado = ERROR_ESCRITURA;
			else 
				directorio.mkdir();
		
		//Devolvemos el resultado de la operacion
		return resultado;
	}	

	

	

}
