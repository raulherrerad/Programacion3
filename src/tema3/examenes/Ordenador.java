package tema3.examenes;

public class Ordenador {

	// Variable miembro de la clase
	private String marca = "";
	private String modelo = "";
	private String tipoTorre = "";

	private Procesador procesador;
	public DiscoDuro listaDiscos[];
	public Memoria listaMemoria[];

	public Ordenador(String marca, String modelo, String tipoTorre, Procesador procMontado,
			DiscoDuro[] listaDiscosMontados, Memoria[] listMemMontadas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipoTorre = tipoTorre;
		/*
		 * 
		 * deberá de comprobarse que hay stock de los componentes que recibe. En caso de
		 * que no haya stock mostrará un mensaje por pantalla y pondrá a null los
		 * componentes cuyo stock sea 0. Si todos los componentes no tienen stock a 0,
		 * reduce el stock de dichos componentes en una unidad y asigna los parámetros a
		 * las variables miembro normalmente.
		 */
		if (procMontado.getStock() <= 0)
			procMontado = null;
		else {
	
			procMontado.setStock(procMontado.getStock() - 1);
		}
		this.procesador = procMontado;

		//Recorremos todos los discos duros para ver si hay stock
		for(int i=0;i<listaDiscosMontados.length;i++)
		{
			if (listaDiscosMontados[i].getStock()==0)
				listaDiscosMontados[i]=null;
			else
			{
				listaDiscosMontados[i].setStock(listaDiscosMontados[i].getStock()-1);
			}
		}
		//Una vez actualizado el stock o eliminado montamos los discos
		this.listaDiscos = listaDiscosMontados;

		//Recorremos todos las memorias para ver si hay stock
		for(int i=0;i<listMemMontadas.length;i++)
		{
			if (listMemMontadas[i].getStock()==0)
				listMemMontadas[i]=null;
			else
			{
				listMemMontadas[i].setStock(listMemMontadas[i].getStock()-1);
			}
		}
		//Una vez actualizado el stock o eliminado montamos las memorias
		this.listaMemoria = listMemMontadas;
		
	}

	public Ordenador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * El ordenador tendrá la función precio que devolverá el 
	 * precio de todos los elementos del ordenador.
	 */
	public double precioOrdenador()
	{
		//Definimos una variable para sumar todos los precios de los componentes
		double precioTotal = 0;
		
		//Antes de asignar el precio del ordenador comprobamos que no sea nulo
		if (procesador!=null) precioTotal=procesador.getPrecio();
		
		//Recorremos todos los discosduros
		for (int i=0;i<this.listaDiscos.length;i++)
		{
			if (this.listaDiscos[i]!=null) precioTotal =precioTotal + listaDiscos[i].getPrecio();
		}

		
		//Recorremos todas las memorias
		for (int i=0;i<this.listaMemoria.length;i++)
		{
			if (this.listaMemoria[i]!=null) precioTotal =precioTotal + listaMemoria[i].getPrecio();
		}
		
		return precioTotal;
		
	}

	int memoriaTotal()
	{
		int totalMemoria=0;
		
		//Recorremos todas las memorias
		for (int i=0;i<this.listaMemoria.length;i++)
		{
			if (this.listaMemoria[i]!=null) totalMemoria =totalMemoria + listaMemoria[i].getCapacidad();
		}
		
		return totalMemoria;
		
	}
	
	int almacenamientoTotal()
	{
		int totalGB=0;
		
		//Recorremos todos los discosduros
		for (int i=0;i<this.listaDiscos.length;i++)
		{
			if (this.listaDiscos[i]!=null) totalGB =totalGB + listaDiscos[i].getAlmacenamiento();
		}
		
		return totalGB;

	}
	
	public void ponerOferta(String marca, int porcentaje)
	{
			
		//Antes de asignar el precio del ordenador comprobamos que no sea nulo
		if (procesador!=null) 
			if (marca.equals(procesador.getMarca()))
				procesador.setPrecio(procesador.getPrecio()*porcentaje/100);
		
		
		//Recorremos todos los discosduros
		for (int i=0;i<this.listaDiscos.length;i++)
		{
			if (this.listaDiscos[i]!=null) 
				if(marca.equals(listaDiscos[i].getMarca()))
						listaDiscos[i].setPrecio(listaDiscos[i].getPrecio()*porcentaje/100);
		}
		
		//Recorremos todas las memorias
		for (int i=0;i<this.listaMemoria.length;i++)
		{
			if (this.listaMemoria[i]!=null) 
				if(marca.equals(listaMemoria[i].getMarca()))
					listaMemoria[i].setPrecio(listaMemoria[i].getPrecio()*porcentaje/100);
		}
		
	}
	
	public int discoMasRapido()
	{
		int velocidadMax = Integer.MIN_VALUE;
		//Recorremos todos los discosduros
		for (int i=0;i<this.listaDiscos.length;i++)
		{
			if (this.listaDiscos[i]!=null) 
				if(listaDiscos[i].getVelocidadTransferencia()>velocidadMax)
					velocidadMax = listaDiscos[i].getVelocidadTransferencia();
		}
		
		return velocidadMax;
		
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoTorre() {
		return tipoTorre;
	}

	public void setTipoTorre(String tipoTorre) {
		this.tipoTorre = tipoTorre;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public String getMarca() {
		return marca;
	}

}
