package tronan;

public class Arma {

	//Tipos de arma
	public static final int ESPADA = 1;
	public static final int HACHA = 2;
	public static final int ARCO = 3;
	public static final int LANZA = 4;
	public static final int BRAZALETES = 5;

	
	private int nivel;
	private String nombre;
	private int ataque;
	private int tipo;
	private int veneno;
	
	
	public Arma(int nivel, String nombre, int ataque, int tipo, int veneno) {
		super();
		this.nivel = nivel;
		this.nombre = nombre;
		this.ataque = ataque;
		this.tipo = tipo;
		this.veneno = veneno;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getVeneno() {
		return veneno;
	}
	public void setVeneno(int veneno) {
		this.veneno = veneno;
	}
	@Override
	public String toString() {
		return "Arma [nivel=" + nivel + ", nombre=" + nombre + ", ataque=" + ataque + ", tipo=" + tipo + ", veneno="
				+ veneno + "]";
	}

	
}
