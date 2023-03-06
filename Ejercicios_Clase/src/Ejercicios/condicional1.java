package Ejercicios;

import java.util.Scanner;

public class condicional1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);	
	    
		System.out.println("Introduzca un número: ");
		int n1 = leer.nextInt();
		System.out.println("Introduzca un número: ");
		int n2 = leer.nextInt();
		
		if(n1 == n2) {
			System.out.println("Los números introducidos son iguales.");
		}
		
		leer.close();
	}

}
