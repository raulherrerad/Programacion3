package tema4;

import java.util.Scanner;

public class EjemploParsearNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero entero:");
		
		//Leemos un n�mero
		String snumero = teclado.next();
		
		//Convertimos el numero de string a entero
		int numero = Integer.parseInt(snumero);
		
		
		
		teclado.close();
		
		
	}
	
	

}
