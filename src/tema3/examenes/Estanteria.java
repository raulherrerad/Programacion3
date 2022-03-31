package tema3.examenes;

import java.util.Arrays;

public class Estanteria {

	private String codigo;
	private int categoria;
	private String bloque;
	public Libro listaLibros[];

	public static final int MAX_LIBROS = 100;

	public Estanteria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estanteria(String codigo, int categoria, String bloque, Libro[] listaLibros) {
		super();
		this.codigo = codigo;
		this.categoria = categoria;
		this.bloque = bloque;
		this.listaLibros = listaLibros;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getBloque() {
		return bloque;
	}

	public void setBloque(String bloque) {
		this.bloque = bloque;
	}

	public Libro libroMasAntiguo() {
		// Creamos un libro en el cual guardaremos el libro con el año mas antiguo
		Libro libroAntiguo = new Libro();
		libroAntiguo.setNombre("No encontrado");

		// Buscamos el año menor, inicializamos el valor al máximo posible
		int minAnio = Integer.MAX_VALUE;

		// Recorremos el array de libros
		for (int i = 0; i < this.listaLibros.length; i++) {
			if (listaLibros[i].getAnioPub() < minAnio) {
				// Si el año del libro en la posicion i es menor que nuestro
				// minimo, ese libro es el libro más antiguo hasta ahora
				libroAntiguo = listaLibros[i];
				// Actualizao el minimo
				minAnio = listaLibros[i].getAnioPub();
			}
		}

		// Devuelvo el año de publicacion
		return libroAntiguo;
	}

	int librosCategoria(int categoria) {
		// Contador para guardar la cantidad de libros de la categorias
		// Que nos introducen, por defecto 0
		int cantLibros = 0;

		// Recorremos el array de libros
		for (int i = 0; i < this.listaLibros.length; i++) {

			if (listaLibros[i].getCategoria()==categoria)
			{
				cantLibros++;
			}
			
		}

		// Devolvemos la cantidad
		return cantLibros;

	}

	@Override
	public String toString() {
		return "Estanteria [codigo=" + codigo + ", categoria=" + categoria + ", bloque=" + bloque + ", listaLibros="
				+ Arrays.toString(listaLibros) + "]";
	}
	
	

}
