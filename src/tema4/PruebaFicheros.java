package tema4;

public class PruebaFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestionFicheros gesFich = new GestionFicheros();
		
		//Borramos un fichero
		int resultado = gesFich.eliminarFichero("C:\\logs\\tests.log");
	
		if (resultado==GestionFicheros.OK)
			System.out.println("El fichero se borro correctamente");
		else
			System.out.println("El fichero no se borro correctamente");
		
		//Mostramos el contenido del directorio raiz c
		resultado = GestionFicheros.mostrarContenidoDirectorio("c:\\");
		
		//Creaccion de ficheros
		resultado = GestionFicheros.crearFichero("c:\\logs\\nuevo.txt");
		
		resultado = GestionFicheros.crearDirectorio("C:\\logs", "CarpetaCreada");
	
		
		System.out.println("Resultado: "+gesFich.directorioVacio("c:\\logs\\vacia"));
		
	}

}
