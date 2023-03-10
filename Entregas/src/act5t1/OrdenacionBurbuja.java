package act5t1;

import java.util.Scanner;

public class OrdenacionBurbuja {

	public static void burbuja(int[]Vector) { //Ordena un vector de menor a mayor
        int aux; //Declaramos una variable auxiliar en la que almacenaremos temporalmente los valores que cambiemos entre sí
        for (int i=0; i<Vector.length-1; i++) { 
            for (int j=0; j<Vector.length-i-1; j++) {                                                              
                if (Vector[j+1]<Vector[j]) { 
                    aux=Vector[j+1];
                    Vector[j+1]=Vector[j];
                    Vector[j]=aux;
                }
            }
        }
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int arr[];
		arr = new int[5];
		System.out.println("Introduzca los valores de un array de 5 posiciones. Se devolverá el array ordenado.");
		for(int i=0; i<arr.length; i++) { //Recorremos el array para introducir sus valores
			System.out.print("Introduzca el valor "+i+": ");
			arr[i]=leer.nextInt();
		}
		System.out.print("Array sin ordenar: ");
		for(int i=0; i<arr.length; i++) { //Recorremos el array para mostrarlo por pantalla
			System.out.print(arr[i]+" ");
		}
		burbuja(arr);
		System.out.print("\nArray ordenado: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		leer.close();
	}

}
