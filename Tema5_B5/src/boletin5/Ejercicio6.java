package boletin5;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos la tabla y declaramos las variables necesarias.

		final int MAX = 1000;
		final int MIN = 0;
		final int FILAS = 6;
		final int COLUMNAS = 10;
		int valorMin=1000;
		int valorMax=0;
		String maximo="";
		String minimo="";

		int tabla[][] = new int[FILAS][COLUMNAS];
		
	//Generamos los números aleatorios y los guardamos en la matriz.
		
		for (int i=0; i<tabla.length; i++) {
			
			for (int j=0; j<tabla[i].length; j++) {	
				
				//Para generar un número entre 0 y 1000.
				tabla [i][j]=MIN+(int)(Math.random()*(MAX-MIN)+1);
				
				//Iremos almacenando los valores máximos y minímos generados.
				//Para ello, declaramos el máximo como 0 y el mínimo como 1000.
				if (tabla[i][j]>valorMax) {
					
					valorMax=tabla[i][j];
					maximo= ("["+(i+1)+"]["+(j+1)+"]");
					
				}
				if (tabla[i][j]<valorMin) {
					
					valorMin=tabla[i][j];
					minimo= ("["+(i+1)+"]["+(j+1)+"]");
				}
				
			}
			
			//Imprimimos la matriz
			System.out.println(Arrays.toString(tabla[i]));
						
		}
		
		//Impirmimos el máximo y el mínimo.
		System.out.println("Valor máximo: "+valorMax+", está en la posición "+maximo);
		System.out.println("Valor mínimo: "+valorMin+", está en la posición "+minimo);
		
	}

}
