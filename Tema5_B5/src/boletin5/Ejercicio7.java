package boletin5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos la tabla y declaramos las variables necesarias.

		final int MAX = 20;
		final int MIN = 0;
		final int TAM;
		int aux;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos por el tamaño del array.

		System.out.println("Introduzca el tamaño de la matriz: ");
		TAM = sc.nextInt();

		// Creamos la matriz.
		int tabla[][] = new int[TAM][TAM];
		
		System.out.println("Esta es la matriz A: ");
		// Rellenamos de forma aleatoria la matriz indicada.
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {

				// Para generar un número entre 0 y 20.
				tabla[i][j] = MIN + (int) (Math.random() * (MAX - MIN) + 1);

			}
			
			//Imprimimos la matriz.
			
			System.out.println(Arrays.toString(tabla[i]));
		}
		
		System.out.println("Esta es la matriz B: ");
		//Ahora, hacemos la trasposición de la matriz.
		
		for (int i=0; i<TAM; i++) {
			
			for (int j=0; j<TAM; j++) {
				
				aux= tabla[i][j];
				tabla[i][j]=tabla[j][i];
				tabla[j][i]=aux;
				
			}
			
			
		}
		
		//imprimimos la matriz
		for (int j=0; j<TAM; j++) {
			System.out.println(Arrays.toString(tabla[j]));
		}
	}

}
