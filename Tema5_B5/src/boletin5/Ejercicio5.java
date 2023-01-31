package boletin5;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos la tabla y declaramos las variables necesarias.
		
		final int MAX=999;
		final int MIN=100;
		final int FILAS=4;
		final int COLUMNAS=5;
		int sumaNum=0;
		int sumaFilas=0;
		int sumaColumnas=0;
		
		int tabla[][] = new int[FILAS][COLUMNAS];
		
		//Generamos los números aleatorios y los guardamos en la matriz.
		
		for (int i=0; i<tabla.length; i++) {
			
			//Reinicializamos la variable sumaNum.
			sumaNum=0; 
			
			for (int j=0; j<tabla[i].length; j++) {
				
				
				//Para generar un número entre 100 y 999.
				tabla [i][j]=MIN+(int)(Math.random()*(MAX-MIN)+1);
				
				//Sumamos los valores generados.
				sumaNum+=tabla[i][j];
			}
			
			//Necesitamos almacenar los valores de sumaNum para luego poder añadirlos al total.
			sumaFilas+=sumaNum;
			
			System.out.print(Arrays.toString(tabla[i]));
			
			System.out.println(sumaNum);
			
			
		}
		
		//De forma paralela, se recorren las columnas y se almacenan los valores.
		//Para recorrer las columnas de una matriz, repetimos los bucles anteriores,
		//cambiando el orden del tamaño. Es decir, lo que estamos haciendo es coger
		//y darle la vuelta a la matriz e ir sumando las filas; por lo tanto, quedará
		//como que estamos sumando las columnas.
		for (int i=0; i<COLUMNAS; i++) {
			
			//Reinicializamos la variable sumaNum.
			sumaNum=0; 
			
			for (int j=0; j<FILAS;j++) {
				
				//Vamos añadiendo los valores de las columnas.
				sumaNum+=tabla[j][i];
			}
			
			//Sumamos el valor de cada columna.
			sumaColumnas+=sumaNum;
			
			//Imprimimos sumaNum.
			System.out.print(sumaNum+",  ");
		}
		
		//Por último, imprimimos la suma de filas y columnas.
		System.out.print(sumaFilas+sumaColumnas);
		
	}

}
