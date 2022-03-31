package tronan;

import java.util.Arrays;

/**
 * Clase Personaje
 * 
 * @author pablo personaje del juego tronan
 */
public class Personaje {

	// Constantes Globales de la clase
	public static final int HOMBRE = 1;
	public static final int MUJER = 2;
	
	// Variables Miembro
	//Si la definimos publica es visible desde cualquier lugar
	private int vida;
	private int nivel;
	private int fuerza;
	//Si la definimos privada es sólo visible desde el código de nuestra clase
	private int destreza;
	private int resistencia;
	private String nombre;
	private int maxArmas;
	private int maxArmaduras;
	//Si la definimos protected es visible desde el paquete donde este la clase
	//Y las clases que hereden
	private int edad;
	public static String region;
	// Pongo la variable miembro estado privada
	// solo es accesible desde dentro de su misma clase
	private int estado;
	private int sexo;
	
	//Conjunto de Armaduras que tiene 
	private armadura armaduras[];
	
	//Conjunto de Armas que posee
	public Arma armas[];
	
	
	public Personaje(int vida, int nivel, int fuerza, int destreza, int resistencia, String nombre, int edad,
			int estado, int sexo, int maxArmas) {
		super();
		this.vida = vida;
		this.nivel = nivel;
		this.fuerza = fuerza;
		this.destreza = destreza;
		this.resistencia = resistencia;
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.sexo = sexo;
		this.maxArmas = maxArmas;
		this.armas = new Arma[maxArmas];
		
	}

	/**
	 * Constructor de la clase Personaje
	 * Se ejecuta cuando creamos el objeto con new
	 */
	public Personaje ()
	{
		//Inicializamos las variables
		vida=0;
		nivel=0;
		fuerza=0;
		destreza=0;
		resistencia=0;
		nombre="";
		edad=0;
		estado=0;
		sexo=0;
	}
	

	
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static String getRegion() {
		return region;
	}

	public static void setRegion(String region) {
		Personaje.region = region;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public armadura[] getArmaduras() {
		return armaduras;
	}

	public void setArmaduras(armadura[] armaduras) {
		this.armaduras = armaduras;
	}

	public Arma[] getArmas() {
		return armas;
	}

	public void setArmas(Arma[] armas) {
		this.armas = armas;
	}

	
	
	/**
	 * Metodo que sube de nivel al personaje
	 */
	public void subirNivel() {
		// Subimos el nivel
		nivel++;

		fuerza =fuerza + RPGUtils.tirarDados() / 8 + 1;
		destreza =destreza + RPGUtils.tirarDados() / 8 + 1;
		resistencia =resistencia + RPGUtils.tirarDados() / 8 + 1;

	}

	@Override
	public String toString() {
		return "Personaje [vida=" + vida + ", nivel=" + nivel + ", fuerza=" + fuerza + ", destreza=" + destreza
				+ ", resistencia=" + resistencia + ", nombre=" + nombre + ", edad=" + edad + ", estado=" + estado
				+ ", sexo=" + sexo + ", armaduras=" + Arrays.toString(armaduras) + ", armas=" + Arrays.toString(armas)
				+ "]";
	}
	
	
	
}
