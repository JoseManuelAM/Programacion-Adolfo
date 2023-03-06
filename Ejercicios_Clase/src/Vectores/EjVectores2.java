package Vectores;

import java.util.Scanner;

/*
 * Aplicación que solicite al usuario los valores que desea introducir. Después introducimos por teclado esa cantidad de valores enteros y los mostramos en el orden inverso a como se han introducido.
 */
public class EjVectores2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int vector[], n;
			
		System.out.print("Introduzca el número de valores que desea introducir: ");
		n = leer.nextInt();
		vector = new int[n];
		
		for(int i=0; i<vector.length; i++) { //Recorremos el vector para ir introduciendo los valores
			System.out.print("Introduzca el valor "+i+": ");
			vector[i] = leer.nextInt();
		}
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		
		System.out.println();
		System.out.print("Imprimimos los valores en orden inverso: ");
		for(int i=vector.length-1; i>=0; i--) {
			System.out.print(vector[i]+" ");
		}
		leer.close();
	}

}
