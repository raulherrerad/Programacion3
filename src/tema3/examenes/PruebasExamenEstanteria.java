package tema3.examenes;

public class PruebasExamenEstanteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro nombreViento = new Libro();
		Libro metro2033 = new Libro("Metro 2033", "aerssedr-23123");
		Libro leyendasDragonLance = new Libro("LEyendas","Margarett", Libro.AVENTURAS, 120000, 367, true,
				23, 2021, "asdfasf-234");
		
		Libro arrayLibros[] = new Libro[100];
		
		for (int i=0;i<100;i++)
		{
			int categoria = (int)(Math.random()*4);
			int anio = 1900 + (int)(Math.random()*120);
			arrayLibros[i] = new Libro("Libro"+(i+1),"Margarett",categoria, 120000, 367, true,
					23, anio, "asdfasf-234");
		}
		
		Estanteria estan1 = new Estanteria("a", Libro.DEPORTES, "J1", arrayLibros);
		
		System.out.println(estan1);
		
		System.out.println("El libro mas antiguo es:" + estan1.libroMasAntiguo().getNombre());
		
	}

}
