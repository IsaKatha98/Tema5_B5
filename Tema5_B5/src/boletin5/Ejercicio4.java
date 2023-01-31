package boletin5;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la tabla y declaramos las variables necesarias.
		int tabla[][] = new int[3][6];
		
		//Asignamos los valores correspondientes.
		tabla[1][0]=75;
		tabla[0][1]=30;
		tabla[0][2]=2;
		tabla[2][2]=-2;
		tabla[2][3]=9;
		tabla[0][5]=5;
		tabla[2][5]=11;
		
		//Imprimimos la matriz.
		for (int i=0; i<tabla.length;i++) {
			
			System.out.println(Arrays.toString(tabla[i]));
		}
	
	}

}
