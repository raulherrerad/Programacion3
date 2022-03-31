package tema3.examenes;

public class Libro {
 
	//Variables Miembro de la clase
	private String nombre;
	private String autor;
	private int categoria;
	private int ejemplaresVendidos;
	private int numPaginas;
	private boolean prestado;
	private int diaPrestado;
	private int anioPub;
	private String isbn;
	
	//Constantes Globales
	public static final int AVENTURAS = 0;
	public static final int THRILLER = 1;
	public static final int EDUCATIVOS = 2;
	public static final int AUTOAYUDA = 3;
	public static final int DEPORTES = 4;
	
	//Constructores
	public Libro()
	{
		this.nombre="";
		this.autor="";
		this.categoria=Libro.AUTOAYUDA;
		this.ejemplaresVendidos=0;
		this.numPaginas=0;
		this.prestado=false;
		this.diaPrestado=0;
		this.anioPub=0;
		this.isbn="";
	}
	
	public Libro(String nombreRecib, String isbnRecib)
	{
		this.nombre=nombreRecib;
		this.autor="";
		this.categoria=Libro.AUTOAYUDA;
		this.ejemplaresVendidos=0;
		this.numPaginas=0;
		this.prestado=false;
		this.diaPrestado=0;
		this.anioPub=0;
		this.isbn=isbnRecib;
	}
	
		
	public Libro(String nombre, String autor, int categoria, int ejemplaresVendidos, int numPaginas, boolean prestado,
			int diaPrestado, int anioPub, String isbn) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.categoria = categoria;
		this.ejemplaresVendidos = ejemplaresVendidos;
		this.numPaginas = numPaginas;
		this.prestado = prestado;
		this.diaPrestado = diaPrestado;
		this.anioPub = anioPub;
		this.isbn = isbn;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getEjemplaresVendidos() {
		return ejemplaresVendidos;
	}
	public void setEjemplaresVendidos(int ejemplaresVendidos) {
		this.ejemplaresVendidos = ejemplaresVendidos;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public int getDiaPrestado() {
		return diaPrestado;
	}
	public void setDiaPrestado(int diaPrestado) {
		this.diaPrestado = diaPrestado;
	}
	public int getAnioPub() {
		return anioPub;
	}
	public void setAnioPub(int anioPub) {
		this.anioPub = anioPub;
	}
	public String getIsbn() {
		return isbn;
	}
	
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	/**
	 * Intenta realizar un prestamo de este libro
	 * @param dia dia que se presto
	 * @return cierto si se ha podido prestar y falso si ya esta en prestamo
	 */
	public boolean prestar(int dia)
	{
		
		//Comprobamos si ya esta prestado
		if (this.prestado)
		{
			//Si ya esta prestado no podemos prestarlo
			return false;
		}
		else
		{
			//Si no esta prestado lo prestamos y ponemos el dia
			this.diaPrestado=dia;
			this.prestado=true;
			return true;
		}
		
	}
	
	/**
	 * Devuelve el libro
	 * @return cierto si se pudo devolver falso en caso contrario
	 */
	boolean devolver()
	{
		//Si prestado es false ya se ha devuelto y no se puede devolver
		if (!this.prestado)
		{
			return false;
		}
		else
		{
			this.prestado = false;
			this.diaPrestado=0;
			return true;
		}
		
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", categoria=" + categoria + ", ejemplaresVendidos="
				+ ejemplaresVendidos + ", numPaginas=" + numPaginas + ", prestado=" + prestado + ", diaPrestado="
				+ diaPrestado + ", anioPub=" + anioPub + ", isbn=" + isbn + "]";
	}

	
	
	
}
