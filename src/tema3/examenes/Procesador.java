package tema3.examenes;

public class Procesador {

	
	
	//Variable miembro de la clase
	private String marca="";
	private String modelo="";
	private int stock=0;
	private double precio=0.0;
	private double frecuencia=0;
	private boolean overclock =false;
	
	
	
	public Procesador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Procesador(String marca, String modelo, int stock, double precio, double frecuencia, boolean overclock) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.stock = stock;
		this.precio = precio;
		this.frecuencia = frecuencia;
		this.overclock = overclock;
	}


	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	public boolean isOverclock() {
		return overclock;
	}
	public void setOverclock(boolean overclock) {
		this.overclock = overclock;
	}
	public String getMarca() {
		return marca;
	}
	
	

	
}
