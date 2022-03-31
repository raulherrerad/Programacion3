package tema1;

public class EjemploEnumerados {

	// Los tipos de datos enumerados guardan un conjunto de valores al
	// Ser definidos
	public enum meses {
		Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, diciembre
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Los valores se pueden asignar y utilizar utilizando el . despues de
		meses mesActual = meses.Septiembre;

		System.out.println("El mes actual es: " + mesActual);

	}

}
