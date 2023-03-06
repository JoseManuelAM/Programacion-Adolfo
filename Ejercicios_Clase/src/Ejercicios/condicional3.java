package Ejercicios;

import java.util.Scanner;

public class condicional3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);	
	    
		System.out.println("Introduzca un número del 1 al 5: ");
		String a = leer.next();
		
		if(a.equalsIgnoreCase("uno")) {
			System.out.println("1");
		} else if(a.equalsIgnoreCase("dos")) {
			System.out.println("2");
		} else if(a.equalsIgnoreCase("tres")) {
			System.out.println("3");
		} else if(a.equalsIgnoreCase("cuatro")) {
			System.out.println("4");
		} else if(a.equalsIgnoreCase("cinco")) {
			System.out.println("5");
		} else {
			System.out.println("Número incorrecto.");
		}
		leer.close();
	}

}