package EjSentenciasRepetitvas;

import java.util.Scanner;

/*
 * Escribir los números incrementando desde 1 hasta que la suma de todos esos números sea mayor a una variable entera x
 */
public class ej2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int x, suma=0;
		
		System.out.println("Introduce el valor de x: ");
		x = leer.nextInt();
		
		for(int i=1; suma<x; i++) {
			System.out.print(i+"+");
			suma = suma+i;
		}
		System.out.println(" = "+suma);
		
		leer.close();
	}

}
