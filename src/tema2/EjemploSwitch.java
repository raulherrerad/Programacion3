package tema2;

import javax.swing.JOptionPane;

public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaración de variables
		int notaAlumno = 0;
		int edad = 0;
		String sEdad = "", sNota = "";
		String mensaje = "";

		// JOptionPane.showMessageDialog(null, "Ventana de Mensajes", "Este es el
		// Mensaje",
		// JOptionPane.INFORMATION_MESSAGE);

		sNota = JOptionPane.showInputDialog(null, "Introduce tu nota en número:", "Nota", JOptionPane.PLAIN_MESSAGE);

		// Convertimos el String a float
		notaAlumno = Integer.parseInt(sNota);

		sEdad = JOptionPane.showInputDialog(null, "Introduce tu edad:", "Edad", JOptionPane.INFORMATION_MESSAGE);

		// Convertimos la edad a int
		edad = Integer.parseInt(sEdad);

		// Cuando la condicion compara muchas veces una sola variable
		// utilizamos la sentencia switch en lugar de muchos if
		switch (notaAlumno) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			mensaje = "Has  Suspendido";
			break;
		case 5:
			mensaje = "Has sacado un Suficiente";
			break;
		case 6:
			mensaje = "Has sacado un Bien";
			break;
		case 7:
		case 8:
			mensaje = "Has sacado un Notable";
			break;
		case 9:
		case 10:
			mensaje = "Has sacado un Sobresaliente";
			break;

		default:
			mensaje = "Introduce un valor de 1 a 10";
			JOptionPane.showMessageDialog(null, mensaje, "Calificación", JOptionPane.ERROR_MESSAGE);
		}

		// Mostramos una ventana con el resultado
		JOptionPane.showMessageDialog(null, mensaje, "Calificación", JOptionPane.INFORMATION_MESSAGE);

	}

	/**
	 * asdf adsfasdf a
	 * 
	 * @param x
	 * @param y
	 * @return asdfasdf
	 */
	public int suma(int x, int y) {
		return x + y;
	}

}
