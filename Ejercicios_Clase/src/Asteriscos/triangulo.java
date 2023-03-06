package Asteriscos;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int n;
		
		System.out.print("Introduzca el número de filas: ");
		n = leer.nextInt();
		
		for(int fila=1; fila<=n; fila++) {
			for(int col=fila; col<=n; col++) { //el número de * coincide con: n-filas+1
				System.out.print("* "); //no println para que no cambie de línea
			}
			System.out.println(); //tras cada fila metemos una nueva línea
		}
		
		leer.close();
	}

}
