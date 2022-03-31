package tema3;

public class PruebasExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno sergio = new Alumno("Sergio", false);
		Asignatura matematicas = new Asignatura("Matematicas", 3.8f);
		Asignatura lengua = new Asignatura("Lengua", 4.8f); 
		Asignatura ingles = new Asignatura("Ingles", 2.8f);
		Asignatura sociales = new Asignatura("Sociales", 9.8f);
		Asignatura edFisica = new Asignatura("Educación Físisca", 4.8f);
		Asignatura musica = new Asignatura("Musica", 6.8f);
	
		
		sergio.listaAsignaturas[Alumno.POS_LENGUA] = lengua;
		sergio.listaAsignaturas[Alumno.POS_MATEMATICAS] = matematicas;
		sergio.listaAsignaturas[Alumno.POS_EDFISICA] = edFisica;
		sergio.listaAsignaturas[Alumno.POS_SOCIALES] = sociales;
		sergio.listaAsignaturas[Alumno.POS_INGLES] = ingles;
		sergio.listaAsignaturas[Alumno.POS_MUSICA] = musica;
		
		try {
		sergio.listaAsignaturas[7] = ingles;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("fallo al acceder al array");
		}
		
		System.out.println("La nota maxima de " +  sergio.nombre + " es: "+ sergio.notaMaximaArray().getNota() + "en la asignatura" +  sergio.notaMaximaArray().getNombre());
		System.out.println("La nota media de " +  sergio.nombre + " es: "+ sergio.notaMediaArray());
		
		//Si devuelve true muestra el mensaje
		if (sergio.aprobadoArray())
			System.out.println("Felicidades has aprobado, " + sergio.nombre);
		
		

		
		
		
	}

}
