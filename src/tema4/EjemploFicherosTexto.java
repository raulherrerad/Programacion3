package tema4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import tema3.examenes.Libro;

public class EjemploFicherosTexto {
	
	public static final String RUTA = "c:\\logs\\";
	//public static final String RUTA = "/home/daw/logs/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*****************************************************
		 * LECTURA DE FICHEROS TIPO TEXTO
		 *****************************************************/
		
		//Definimos el fichero a leer
		File fich = new File(RUTA + "salidaFichero.log");
		
		try {
			FileReader fr = new FileReader(fich);
			BufferedReader br = new BufferedReader(fr);
			
			//Leemos una linea
			String linea = br.readLine();
			int i=1;
			while (linea != null) {
				
				// Mostramos por pantalla la linea leida del fichero
				System.out.println("Linea " + i + ": " + linea);
				// Leemos la linea siguiente
				linea = br.readLine();
				i++;
		
			}
			
			//Cerramos los streams de lectura
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe ) {
			ioe.printStackTrace();
		}
		
		/*****************************************************
		 * ESCRITURA DE FICHEROS TIPO TEXTO
		 *****************************************************/
		
		Libro arrayLibros[] = new Libro[100];
		//Creamos un array de 100 libros aleatorios
		for (int i=0;i<100;i++)
		{
			int categoria = (int)(Math.random()*4);
			int anio = 1900 + (int)(Math.random()*120);
			arrayLibros[i] = new Libro("Libro"+(i+1),"Margarett",categoria, 120000, 367, true,
					23, anio, "asdfasf-234");
		}
		
		try {
			//Creamos el fichero con FileWriter y utilizamos PrintWriter
			//Para escribir en el
			FileWriter fw = new FileWriter(RUTA + "libros.txt",false);
			PrintWriter pw = new PrintWriter(fw);
			
			//Recorremos el array y escribimos el libro en el fichero
			for(int i=0;i<arrayLibros.length;i++)
			{
				String linea = "Titulo " + arrayLibros[i].getNombre() + ", Autor:" + arrayLibros[i].getAutor() + ", ventas:" + arrayLibros[i].getEjemplaresVendidos();
				pw.println(linea);
			}
			
			//Cerramos los manejadores de ficheros
			fw.close();
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
