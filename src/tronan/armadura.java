package tronan;

public class armadura {
	
	//Tipos de armadura
	public static final int ESCUDO = 1;
	public static final int CUERPO = 2;
	public static final int BOTAS = 3;
	public static final int CASCO = 4;
	public static final int BRAZALETES = 5;

	private int nivel;
	private String nombre;
	private int resistencia;
	private int tipo;
	private int color;
	
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
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "armadura [nivel=" + nivel + ", nombre=" + nombre + ", resistencia=" + resistencia + ", tipo=" + tipo
				+ ", color=" + color + "]";
	}
	
	
	
	
	
	

}
