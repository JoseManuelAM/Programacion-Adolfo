package Vectores;

import java.util.Arrays;
import java.util.Scanner;

/*Crear una aplicación que lea y almacene x números en un array. A partir de ella se van a construir otros dos arrays: uno con valores pares y otro con impares. Los arrays pares e 
 * impares se deben mostrar ordenados
 */
public class EjVectores3 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int datos[]; //Datos iniciales
		int vpar[] = new int[0];
		int vimpar[] = new int[0];
		System.out.println("Cuantos valores?");
		int n=leer.nextInt();
		datos=new int[n];
		for(int i=0; i<datos.length; i++) {
			System.out.print("Introduce un número: ");
			datos[i]=leer.nextInt();			
		}
		for(int numero:datos) {
			if(numero%2==0) { //El número es par
				vpar=Arrays.copyOf(vpar, vpar.length+1);
				vpar[vpar.length-1]=numero;
			}else {
				vimpar=Arrays.copyOf(vimpar, vimpar.length+1);
				vimpar[vimpar.length-1]=numero;
			}
		}
		Arrays.sort(vpar);
		Arrays.sort(vimpar);
		System.out.println("Pares: "+Arrays.toString(vpar));
		System.out.println("Impares: "+Arrays.toString(vimpar));
		
		leer.close();
	}

}
