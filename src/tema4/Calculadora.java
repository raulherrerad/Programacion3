package tema4;

public class Calculadora { 
	
	public int suma(int x, int y) {
		return x+y;
	}
	
	public long factorial(int x)
	{
	long factorial =1;
	
		for(int i=x;i!=1;i--)
		{
			factorial = factorial * i;
		}
		
		return factorial;
		
	}
	
	/**
	 * Genera un número aleatorio positivo o negativo
	 * @return
	 */
	public static int generarAleatorio()
	{
		
		int num=0;
		
		//Si es menor de 0,5 sera negativo en caso contrario positivo
		if  (Math.random()>0.5)
		{
			num = -( (int)Math.random()*10000);
		}
		else
		{
			num = ( (int)Math.random()*10000);

		}
		return num;
	}

}
