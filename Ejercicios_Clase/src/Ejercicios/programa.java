package Ejercicios;

import java.util.Scanner;

// Pedir número y nombre y decirlo
public class programa {

	public static void main(String[] args) {
		
	Scanner leer = new Scanner(System.in); //Creamos un nuevo escaner
	
	int num; //Creamos una variable de tipo entero, que será el número que introduzca el usuario
	String nombre; //Creamos una variable de tipo string que contendrá el nombre del usuario
	System.out.print("Introduzca su edad: ");
	num = leer.nextInt(); //leemos variable por teclado
	System.out.print("Introduzca su nombre por favor: ");
	nombre = leer.next();
	
	System.out.println("Hola "+nombre+", el número que ha introducido es el "+num);
	num++;
	System.out.println("El próximo año tendrás "+num+" años.");
	
	leer.close();
	}

}