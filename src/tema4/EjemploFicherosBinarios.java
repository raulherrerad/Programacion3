package tema4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFicherosBinarios {
	
	//Constantes para definir los posibles errores
	public static final int ERROR_FILENOTFOUND  = -1;
	public static final int ERROR_LECTURAESCRITURA  = -2;
	public static final int COPIA_CORRECTA  = 0;


	public static final String RUTA = "c:\\logs\\";
	//public static final String RUTA = "/home/daw/logs/";
	
	public static void main(String[] args) {
		
		int resultado = copiarFichero("img\\lavae.jpg","c:\\logs\\imagen3.jpg");
		// TODO Auto-generated method stub

		switch (resultado)
		{
		case COPIA_CORRECTA:
				System.out.println("El fichero se ha copiado correctamente");
				break;
		case ERROR_FILENOTFOUND:
			System.out.println("El fichero no se ha encontrado o no tenemos permisos");
			break;
		case ERROR_LECTURAESCRITURA:
			System.out.println("Ha habido un problema al escribir o leer del fichero");
			break;

		}
	}
	
	/**
	 * El modulo copia el fichero origen en la ruta destino de forma binaria
	 * @param rutaOrigen
	 * @param rutaDestino
	 * @return
	 */
	public static int copiarFichero(String rutaOrigen, String rutaDestino)
	{
		//Por defecto suponemos que se va a copiar bien
		int resultado = COPIA_CORRECTA;
		//Creo los ficheros de lectura y escritura
		File fichOrigen = new File(rutaOrigen);

		//Creamos un array de bytes para ir leyendo el fichero
		byte bufferLectura[] = new byte[200];
		
		try {
			FileInputStream fi = new FileInputStream(fichOrigen);
			//Para escribir no necesitamos previamente el objeto file
			//Directamente ponemos la ruta del fichero y si queremos hacer append
			FileOutputStream fo = new FileOutputStream(rutaDestino,false);
			
			//Creamos los buffered que son los que escriben y leen al final
			BufferedInputStream br = new BufferedInputStream(fi);
			BufferedOutputStream bw = new BufferedOutputStream(fo);
			
			
			//Leemos por primera vez fuera del bucle
			int bytesLeidos = br.read(bufferLectura);
			
			while(bytesLeidos == 200)
			{
				//Escribo el array de bytes en el fichero destino
				bw.write(bufferLectura);
				//Borramos el contenido previo
				bufferLectura = new byte[200];
				//leo otra vez
				bytesLeidos = br.read(bufferLectura);
			}
			
			//Escribimos el ultimo baffer que no ha llegado a 200 bytes
			//Escribo el array de bytes en el fichero destino
			//Escribimos solo so bytes leidos la ultima vez
			bw.write(bufferLectura, 0, bytesLeidos-1);
			
			
			
			//Cerramos los streams
			br.close();
			fi.close();
		
			//Primero se cierran los fileinput/output y luego los buffered
			bw.close();
			fo.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultado = ERROR_FILENOTFOUND;
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
			resultado = ERROR_LECTURAESCRITURA;
		}
		
		
		//Devolvemos el resultado
		return resultado;
	}
	
	

}
