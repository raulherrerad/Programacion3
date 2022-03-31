package tema3.examenes;

public class DiscoDuro {

	//Variable miembro de la clase
	private String marca="";
	private String modelo="";
	private int stock=0;
	private double precio=0.0;
	private int almacenamiento=0;
	private int velocidadTransferencia =0;
	
		
	
	public DiscoDuro(String marca, String modelo, int stock, double precio, int almacenamiento,
			int velocidadTransferencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.stock = stock;
		this.precio = precio;
		this.almacenamiento = almacenamiento;
		this.velocidadTransferencia = velocidadTransferencia;
	}
	public DiscoDuro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getMarca() {
		return marca;
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
	public int getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public int getVelocidadTransferencia() {
		return velocidadTransferencia;
	}
	public void setVelocidadTransferencia(int velocidadTransferencia) {
		this.velocidadTransferencia = velocidadTransferencia;
	}
	
	

	
}
