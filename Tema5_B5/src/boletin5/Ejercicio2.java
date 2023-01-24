package boletin5;

import java.util.Arrays;

public class Ejercicio2 {
	/*
	 * Crea un programa que cree una matriz de 10x10 e introduzca 
	 * los valores de las tablas de multiplicar del 1 al 10 (cada 
	 * tabla de multiplicar en una fila). Luego mostrará la matriz 
	 * por pantalla.
	 */

	public static void main(String[] args) {
		

		//Creamos la tabla y declaramos las variables necesarias.
		int tabla[][]= new int [11][11];
		
		//Creamos los bucles necesarios. El primer bucle se refiere al eje X; el segundo, al eje Y.
		for (int i=1; i<tabla.length; i++) {
			for (int j=1; j<tabla.length; j++) {
				
				tabla [i][j]=i*j;
				
			}
			
			System.out.println(Arrays.toString(tabla[i]));
		}
		
	}

}
