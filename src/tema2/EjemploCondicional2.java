package tema2;

import javax.swing.JOptionPane;

public class EjemploCondicional2 {

	public static final int PORCENTAJE_BECA6000 = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El programa leera por teclado la nota de un alumno que sera un float, su
		// nombre, edad y curso
		// Mostrara SUSPENSO, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE dependiendo de la
		// nota

		// Si es de tercero y tiene sobresaliente o es mayor de edad se mostrará el
		// mensaje
		// "APROBADO CON EXCELENCIA"

		// A todos los que tengan sobresaliente mayores de 14 años tendrán beca

		// se pide que el código este bien comentado y las variables con los nombres
		// adecuados
		// en el formato adecuado, por ejemplo notaAlumno

		// Declaración de variables
		float notaAlumno = 0;
		String nombre = "";
		int edad = 0;
		String curso = "";
		String sEdad = "", sNota = "";
		// Mensaje resultado del programa
		String mensaje = "";

		// JOptionPane.showMessageDialog(null, "Ventana de Mensajes", "Este es el
		// Mensaje",
		// JOptionPane.INFORMATION_MESSAGE);

		nombre = JOptionPane.showInputDialog(null, "Nombre", "Introduce tu nombre", JOptionPane.QUESTION_MESSAGE);

		sNota = JOptionPane.showInputDialog(null, "Introduce tu nota en número:", "Nota", JOptionPane.PLAIN_MESSAGE);

		// Convertimos el String a float
		notaAlumno = Float.parseFloat(sNota);

		sEdad = JOptionPane.showInputDialog(null, "Introduce tu edad:", "Edad", JOptionPane.INFORMATION_MESSAGE);

		// Convertimos la edad a int
		edad = Integer.parseInt(sEdad);

		curso = JOptionPane.showInputDialog(null, "Introduce el Curso en el que estas matriculado:", "Curso",
				JOptionPane.INFORMATION_MESSAGE);

		// System.out.println(nombre + "-" + notaAlumno + "-" + edad + "-" + curso);

		// Si es de tercero y tiene sobresaliente, o es mayor de edad se mostrará el
		// mensaje
		// "APROBADO CON EXCELENCIA"

		if ((curso.toLowerCase().equals("tercero") && notaAlumno >= 9) || edad >= 18) {
			JOptionPane.showMessageDialog(null, "Aprobado con Excelencia", "Felicidades",
					JOptionPane.INFORMATION_MESSAGE);
		}

		// Si la nota es menor de 5 ha suspendido
		if (notaAlumno < 5) {
			mensaje = "Has Suspendido\n";
		} else {
			// Dentro de este else la nota sabemos que es 5 o más
			if (notaAlumno < 6) {
				mensaje = "Has sacado un Suficiente\n";
			} else {
				// LA nota es 6 o mayor de 6 si entra aqui
				if (notaAlumno < 7) {
					mensaje = "Has sacado un Bien\n";
				} else {
					// Si entramos aqui la nota es 7 o más
					if (notaAlumno < 9) {

						mensaje = "Has sacado un Notable\n";
					} else {
						// Si la nota es 9 o superior

						// A todos los que tengan sobresaliente mayores de 14 años tendrán beca

						if (edad >= 14) {
							JOptionPane.showMessageDialog(null,
									"Has conseguido la Beca!\n(Ya te puedes comprar el super ordenador gamer!!)",
									"Felicidades", JOptionPane.INFORMATION_MESSAGE);
						}
						mensaje = "Has sacado un Sobresaliente\n";

					}
				}

			}
		}

		System.out.println(mensaje);

	}

}
