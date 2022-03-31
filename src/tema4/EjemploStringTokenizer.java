package tema4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import tema3.examenes.Libro;

public class EjemploStringTokenizer {

	public static final String RUTA = "c:\\logs\\Libros2.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Linea con los campos separados por ,
		// Que vamos a leer del fichero
		String linea = "";

		Libro listaLibros[] = new Libro[4];
		// Creo un libro que es donde voy a guardar los datos
		Libro libroLeido = new Libro();

		// Primer paso para leer fichero: definir un objeto File con la ruta del fichero
		File ficheroLibros = new File(RUTA);

		try {
			FileReader fr = new FileReader(ficheroLibros);
			BufferedReader br = new BufferedReader(fr);

			// La i nos servira para ir guardando los libros en el array
			int i = 0;
			// Leemos linea a linea el fichero
			linea = br.readLine();
			// Mientras la linea leida no sea la ultima seguimos leyendo
			while (linea != null) {
				// Con la linea leida utilizo el stringtokenizer para crear un objeto de tipo
				// libro

				StringTokenizer st = new StringTokenizer(linea, ",");

				//Creamos un libro para cada lectura, sino comparten los
				//datos
				libroLeido = new Libro();
				
				// Como me se el orden en el que estan los campos del libroç
				// En cada linea, los voy leyendo y se los voy asignando a
				// Los atributos del libro
				libroLeido.setNombre(st.nextToken());
				libroLeido.setAutor(st.nextToken());
				libroLeido.setCategoria(Integer.valueOf(st.nextToken()));
				libroLeido.setAnioPub(Integer.valueOf(st.nextToken()));
				libroLeido.setNumPaginas(Integer.valueOf(st.nextToken()));
				libroLeido.setPrestado(Boolean.valueOf(st.nextToken()));
				libroLeido.setDiaPrestado(Integer.valueOf(st.nextToken()));
				libroLeido.setEjemplaresVendidos(Integer.valueOf(st.nextToken()));
				libroLeido.setIsbn(st.nextToken());

				// Guardamos el libro que hemos leido del fichero en el array
				listaLibros[i] = libroLeido;
				// Incrementamos la i para que pase a la siguiente posicion
				i++;

				linea = br.readLine();
			}

			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		// En el caso del ejercicio de coches habria que leer todas las lineas
		// Previamente tendriamos que llamar a contarLineas para saber cuantas lineas
		// Tiene el fichero, hacemos un bucle y para cada linea utilizamos
		// El stringtokenizer para sacar un objeto y meterlo en el array de Coches

		for (int i = 0; i < listaLibros.length; i++)
		{
			System.out.println(listaLibros[i].toString());
		}

		/*
		 * //Mientras haya mas elementos separados por , en el string los sacamos //Por
		 * pantalla int i=1; while (st.hasMoreElements()) {
		 * System.out.println("Elemento numero" + i + ":" +st.nextToken()); i++; }
		 */

	}

}
