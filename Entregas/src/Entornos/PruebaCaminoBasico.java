package Entornos;

import java.util.Scanner;

public class PruebaCaminoBasico {

	public static void main(String[] args) {
		int num, divisor, sumadivisores;
		divisor = 1;
		sumadivisores = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un número mayor que 0: ");
		num = leer.nextInt();
		while(divisor<=num/2) {
			if(num%divisor==0) 
				sumadivisores = sumadivisores+divisor;
			divisor++;
		}
		if(num==sumadivisores)
			System.out.println("El número "+num+" es un número perfecto");
		else
			System.out.println("El número "+num+" no es un número perfecto");
		
		leer.close();
	}

}
