package Ejercicios;

import java.util.Scanner;

public class programa4 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int x;
		int y;
		int mayor;
		
		System.out.print("Introduzca un número: ");
		x = leer.nextInt();
		System.out.print("Introduzca otro número: ");
		y = leer.nextInt();
		
		mayor = (x>y) ? x:y;
		
		System.out.println("El mayor de los números introducidos es "+mayor);
		
		
		leer.close();

	}

}
