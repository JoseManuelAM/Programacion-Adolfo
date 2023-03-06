package Ejercicios;

import java.util.Scanner;

/*
 * Programa que solicite las notas del primer, segundo y tercer trimestre de programación (tipo entero). El programa debe mostrar la nota media del curso como se hace en el boletín de calificaciones (solo parte entera).
 * Debe tener otra salida para el expediente académico, esta vez con decimales.
 */
public class programa3 {
	
	public static int mediaEntera(double nota1, double nota2, double nota3) //Devuelve la media entera
	{
		double media;
		media = (nota1+nota2+nota3)/3;
		int mediaEnt = (int)media; //Conversión de tipo double a tipo int
		return mediaEnt;
	}
	
	public static double media(double nota1, double nota2, double nota3) //Devuelve la media con decimales
	{
		double media;
		media = (nota1+nota2+nota3)/3;
		return media;
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double tri1, tri2, tri3;
		
		System.out.print("Introduzca la nota del primer trimestre: ");
		tri1 = leer.nextDouble();
		System.out.print("Introduzca la nota del segundo trimestre: ");
		tri2 = leer.nextDouble();
		System.out.print("Introduzca la nota del tercer trimestre: ");
		tri3 = leer.nextDouble();
		
		System.out.println("La nota media del boletín de calificaciones es: "+mediaEntera(tri1,tri2,tri3));
		System.out.println("La media del expediente académico es: "+media(tri1,tri2,tri3));
		
		leer.close();

	}

}