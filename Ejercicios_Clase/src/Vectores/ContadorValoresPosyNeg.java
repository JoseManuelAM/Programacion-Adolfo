package Vectores;

import java.util.Scanner;

public class ContadorValoresPosyNeg {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numeros;
		int contPos, contNeg;
		do {
			System.out.println("Números a introducir: ");
			numeros = leer.nextInt();
		} while(numeros<=0);
		
		int[] num = new int[numeros];
		
		for(int i=0; i<num.length; i++) {
			System.out.println("Número  "+i+": ");
			num[i] = leer.nextInt();
		}
		
		for(int i=0; i<num.length)
	}

}

