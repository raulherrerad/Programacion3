package tema3;

public class Alumno {

	public String nombre;
	public String apellidos;
	public int edad;
	private boolean repetidor;
	public static final int NUM_ASIGNATURAS = 6;
	
	public static final int POS_LENGUA =0;
	public static final int POS_MATEMATICAS =1;
	public static final int POS_INGLES =2;
	public static final int POS_SOCIALES =3;
	public static final int POS_EDFISICA =4;
	public static final int POS_MUSICA =5;
	

	private Asignatura lengua;
	private Asignatura matematicas;
	private Asignatura sociales;
	private Asignatura ingles;
	
	public Asignatura listaAsignaturas[];

	public Alumno(String nombre, boolean repetidor) {
		
		this.nombre = nombre;
		this.repetidor = repetidor;
		this.apellidos ="";
		this.edad=0;
		this.lengua = new Asignatura();
		this.matematicas = new Asignatura();
		this.sociales = new Asignatura();
		this.ingles = new Asignatura();
		
		//Inicializamos el tamaño del array
		
		listaAsignaturas = new Asignatura[Alumno.NUM_ASIGNATURAS];
		for (int i=0;i<listaAsignaturas.length;i++)
		{
			listaAsignaturas[i] = new Asignatura();
		}
		


	}

	public Alumno(String nombre, String apellidos, int edad, boolean repetidor, Asignatura lengua,
			Asignatura matematicas, Asignatura sociales, Asignatura ingles) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.repetidor = repetidor;
		this.lengua = lengua;
		this.matematicas = matematicas;
		this.sociales = sociales;
		this.ingles = ingles;
	}

	/*

	 * Asignatura notaMaxima() devuelve la asignatura con nota máxima de todas las asignaturas
	 * boolean aprobado() devuelve true si la nota media es superior a 5 
	 * y no ha suspendido lengua y matemáticas a la vez.
	 */
	
	public boolean aprobadoArray()
	{
		if (notaMediaArray()>5)
		{
			//if (!(listaAsignaturas[this.POS_LENGUA].getNota()<5 && listaAsignaturas[this.POS_MATEMATICAS].getNota()<5 ))
		//Sin array lengua.getNota()>=5 || matematicas.getNota>=5
			if (listaAsignaturas[this.POS_LENGUA].getNota()>=5 || listaAsignaturas[this.POS_MATEMATICAS].getNota()>=5 )
			{//Si cumple las condiciones devolvemos cierto
				return true;
			}
		}
		//Si no cumple las dos
		return false;
	}
	
	public float notaMedia()
	{
				return (float)(this.lengua.getNota()+ this.sociales.getNota()+ this.matematicas.getNota()+this.ingles.getNota())/4;
		
	}
	
	public float notaMediaArray()
	{
		float media = 0f;
		for (int i=0;i<listaAsignaturas.length;i++)
		{
			media = media + listaAsignaturas[i].getNota();
		}
		
		return media/listaAsignaturas.length;
	}
	
	public Asignatura notaMaximaArray()
	{
		float notaMaxima = Float.MIN_VALUE;
		Asignatura asigMax = new Asignatura();
		
		for (int i=0;i<listaAsignaturas.length;i++)
		{
			if (listaAsignaturas[i].getNota()>notaMaxima)
			{
				//Si la nota de la asignatura que comprobamos en el array
				//Es la mayor hasta ahora
				//Actualizamos la nota maxima y guardamos la asignatura
				notaMaxima = listaAsignaturas[i].getNota();
				asigMax = listaAsignaturas[i];
			}
		}
		
		//Devolvemos la asignatura con nota maxima
		return asigMax;
		
		
	}

}
