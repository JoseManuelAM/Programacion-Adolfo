package Ejercicios;

import java.util.Scanner;

public class condicional2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);	
	    
		System.out.println("Introduzca un número: ");
		int a = leer.nextInt();
		System.out.println("Introduzca un número: ");
		int b = leer.nextInt();
		
		if(a<0 && b<0) {
			System.out.println("Los dos son negativos.");
		}else if(a>0 && b<0) {
			System.out.println(a+" es positivo, "+b+" es negativo.");
		}else if(a>0 && b>0) {
			System.out.println("Los dos son positivos.");
		}
		
		leer.close();
	}

}
