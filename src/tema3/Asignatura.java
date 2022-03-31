package tema3;

public class Asignatura {

	// Variables Miembro
	private String nombre;
	private float nota;

	public static final int MAX_NUMALUMNOS = 30;

	public Asignatura(String nombreRecibido) {

		// El this indica que la variable es la variable miembro de la clase
		this.nombre = nombreRecibido;
		this.nota = 0.0f;

	}
	
	public Asignatura(String nombre, float nota)
	{
		this.nombre = nombre;
		this.nota = nota;	
	}
	

	public Asignatura() {
		// TODO Auto-generated constructor stub
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}


}
