package Vectores;

import java.util.Scanner;

public class Recorrido2 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int numAlum, i;
		double suma = 0, media;
		
		do {
			System.out.print("Número de alumnos de la clase: ");
			numAlum = leer.nextInt();
		} while(numAlum <= 0);
		
		double[] notas = new double[numAlum]; //se crea el array
		
		//Entrada de datos. Se asigna a cada elemento del array
		//la nota introducida por teclado
		for(i=0; i<notas.length; i++) {
			System.out.println("Alumno "+(i+1)+" Nota final: ");
			notas[i] = leer.nextDouble();
		}
		
		//Sumar todas las notas
		for(i=0; i<notas.length; i++) {
			suma = suma+notas[i];
		}
		
		//Calcular la media
		media = suma/notas.length;
		
		//Mostrar la media
		System.out.printf("Nota media del curso: %.2f %n", media);
		
		//Mostrar los valores superiores a la media
		System.out.println("Listado de notas superiores a la media: ");
		for(i=0; i<notas.length; i++) {
			if(notas[i] > media) {
				System.out.println("Alumno número "+(i+1)+"Nota final: "+notas[i]);
			}
		}
		
		//Mostrar los valores inferiores a la media
		System.out.println("Listado de notas inferiores a la media: ");
		for(i=0; i<notas.length; i++) {
			if(notas[i] < media) {
				System.out.println("Alumno número "+(i+1)+"Nota final: "+notas[i]);
			}
		}
		
		leer.close();
	}
	
}
