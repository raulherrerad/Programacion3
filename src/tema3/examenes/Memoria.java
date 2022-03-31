package tema3.examenes;

public class Memoria {
	
	//Variable miembro de la clase
	private String marca="";
	private String modelo="";
	private int stock=0;
	private double precio=0.0;
	private int capacidad=0;
	

	public Memoria(String marca, String modelo, int stock, double precio, int capacidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.stock = stock;
		this.precio = precio;
		this.capacidad = capacidad;
	}
	public Memoria() {
		super();
		this.marca = "";
		this.modelo = "";
		this.stock = 0;
		this.precio = 0;
		this.capacidad = 0;

		
		// TODO Auto-generated constructor stub
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
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getMarca() {
		return marca;
	}
	
	



}
