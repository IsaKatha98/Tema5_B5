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
		int notaMin = 0; // nota mínima de todas las notas.
		int sumaNotas = 0; // sumatoria de notas de un alumno.
		int media=0;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Hacemos un bucle que pregunte por las notas de cada alumno.
		// Este for contará los estudiantes.
		for (int i = 0; i < tabla.length; i++) {

			// Este for cuenta las asignaturas.
			for (int j = 0; j < tabla.length + 1; j++) {

				// Preguntamos por las notas.
				System.out
						.println("Introduzca las notas del alumno " + (i + 1) + " de la asignatura " + (j + 1) + ": ");
				tabla[i][j] = sc.nextInt();

				// Guardamos los valores introducidos en una variable para que sea más fácil
				// trabajar con ellos
				nota = tabla[i][j];

				// Las vamos sumando para hacer la media a posteriori.
				sumaNotas += nota;

				// También las clasificamos según sean las nota máxima o mínima.
				if (nota > notaMax) {

					notaMax = nota;
				}

				if (nota < notaMin) {

					notaMin = nota;
				}

				// Hacemos la media.
				media = sumaNotas / 5;

			}

			System.out.println("La nota media del alumno "+(i+1)+" es: "+media);
			System.out.println("La nota máxima del alumno "+(i+1)+ " es: "+notaMax);
			System.out.println("La nota mínima del alumno "+ (i+1)+" es: "+notaMin);
		}

		// Hacemos un bucle for para poder imprimar la matriz de forma correcta
		for (int k = 0; k < tabla.length; k++) {

			System.out.println(Arrays.toString(tabla[k]));

		}

		// Presentamos los datos, repitiendo los bucles.
		// Este for contará los estudiantes.
		for (int i = 0; i < tabla.length; i++) {

			
			

		}

	}

}
