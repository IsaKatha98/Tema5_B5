package boletin5;

import java.util.Arrays;

public class Ejercicio1 {
	
	/*
	 * Crea una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma: el elemento 
	 * de la posición [n][m] debe contener el valor 10 * n + m. Después se debe mostrar su contenido.
	 */

	public static void main(String[] args) {
		
		//Creamos la tabla y declaramos las variables necesarias.
		int tabla[][]= new int [5][5];
		
		//Creamos los bucles necesarios. El primer bucle se refiere al eje X; el segundo, al eje Y.
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				tabla [i][j]=10*i+j;
			}
			
			System.out.println(Arrays.toString(tabla[i]));
		}
		
		

	}

}
