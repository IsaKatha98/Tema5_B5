package boletin5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
	 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
	 * notas por teclado y luego el programa mostrará la tabla con las notas. A
	 * continuación, mostrará la nota mínima, máxima y media de cada alumno.
	 */

	public static void main(String[] args) {

		// Creamos la tabla y declaramos las variables necesarias.
		int tabla[][] = new int[4][5];
		int nota; // Variable que introduce el usuario.
		int notaMax = 0; // nota máxima de las notas.
		int notaMin = 10; // nota mínima de todas las notas.
		int sumaNotas = 0; // sumatoria de notas de un alumno.
		double media;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Hacemos un bucle que pregunte por las notas de cada alumno.
		// Este for contará los estudiantes.
		for (int i = 0; i < tabla.length; i++) {

			// Este for cuenta las asignaturas.
			for (int j = 0; j < tabla[i].length; j++) {

				System.out
						.println("Introduzca las notas del alumno " + (i + 1) + " de la asignatura " + (j + 1) + ": ");
				nota = sc.nextInt();

				while (nota < 1 || nota > 10) {

					// Preguntamos por las notas, tiene que estar entre 1 y 10.
					System.out.println(
							"Error.Introduzca las notas del alumno " + (i + 1) + " de la asignatura " + (j + 1) + ": ");
					nota = sc.nextInt();

				}

				tabla[i][j] = nota;
			}

		}

		// Hacemos un bucle for para poder imprimar la matriz de forma correcta
		for (int k = 0; k < tabla.length; k++) {

			System.out.println(Arrays.toString(tabla[k]));

		}

		// Presentamos los datos, repitiendo los bucles.
		// Este for contará los estudiantes.
		for (int i1 = 0; i1 < tabla.length; i1++) {
			
			//Reinicializamos los valores.
			notaMax=0;
			notaMin=10;
			sumaNotas=0;
			

			for (int j = 0; j < tabla[i1].length; j++) {

				

				// También las clasificamos según sean las nota máxima o mínima.
				if (tabla[i1][j] > notaMax) {

					notaMax = tabla[i1][j];
				}

				if (tabla[i1][j] < notaMin) {

					notaMin = tabla[i1][j];
				}

				// Las vamos sumando para hacer la media a posteriori.
				sumaNotas += tabla[i1][j];
			}

			// Hacemos la media.
			media = sumaNotas / 5;

			System.out.println("La nota media del alumno " + (i1 + 1) + " es: " + media);
			System.out.println("La nota máxima del alumno " + (i1 + 1) + " es: " + notaMax);
			System.out.println("La nota mínima del alumno " + (i1 + 1) + " es: " + notaMin);
			System.out.println();

		}

	}

}
