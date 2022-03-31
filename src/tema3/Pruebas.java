package tema3;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero =8;
		System.out.println(FuncionesRecursivas.factorialRecursivo(numero));
		
		int listaNum[] = {3,5,7,2,3,8,56,23,45,3,2,1,99,87,67,54};
		
		if ( FuncionesRecursivas.contiene(numero, listaNum))
		{
			System.out.println("El número  " + numero + " esta en la lista");
		}
		else
		{
			System.out.println("El número  " + numero + " no esta en la lista");
			
		}
		
		
	}

}
