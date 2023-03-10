package repasot1;

import java.util.Scanner;
import repasot1.Pelicula;

public class RepasoT1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int op;
        
        do {
        	System.out.println();
        	System.out.println("*********************************MENÚ************************************");
        	System.out.println("1. Mayor de dos números");
        	System.out.println("2. Convertir un valor decimal a entero");
        	System.out.println("3. Imprimir por pantalla los 100 primeros números pares");
        	System.out.println("4. Objeto");
        	System.out.println("5. Vectores unidimensionales");
	        System.out.println("0. SALIR");
	        System.out.println("*************************************************************************");
	        System.out.print("-- Introduzca una opción: ");
	        op = leer.nextInt();

	        switch(op) {
            case 1:	
            	System.out.print("Introduzca un número:");
            	int n1 = leer.nextInt();
            	System.out.print("Introduzca otro número:");
            	int n2 = leer.nextInt();
            	int mayor = (n1>n2)?n1:n2; //Realizamos la comparación de ambos números con el operador ternario (?)
            	System.out.println("El mayor es: "+mayor);
                break;
                
            case 2: 
            	System.out.print("Introduzca un valor con decimales para convertirlo a número entero: ");
            	double valorDecimal = leer.nextDouble();
            	int valorEntero = (int)valorDecimal; //Pasamos el valor decimal introducido a entero
            	System.out.println("El valor convertido a entero es: "+valorEntero);
                break;
                
            case 3:  
            	for(int i=0; i<=100; i++) {
            		if(i%2!=0) continue; // Con 'continue' saltamos los números impares
            		System.out.println(i);
            	}
                break;
                
            case 4:
            	//Creamos una película, y mediante los métodos set le establecemos los valores que queramos
            	Pelicula miPelicula = new Pelicula("Titanic");
            	miPelicula.setDirector("James Cameron");
            	miPelicula.setDuracion(195);
            	miPelicula.setEstreno(1997);
            	miPelicula.setGenero("Drama");
            	//Llamamos a los métodos creados con los métodos get
            	System.out.println("Título: "+miPelicula.getTitulo());
            	System.out.println("Director: "+miPelicula.getDirector());
            	System.out.println("Duración: "+miPelicula.getDuracion()+" minutos");
            	System.out.println("Estreno: año "+miPelicula.getEstreno());
            	System.out.println("Género: "+miPelicula.getGenero());
                break;
            
            case 5:
            	
            case 0:
            	System.out.println("[Programa finalizado]");
            	break;
                
            default:
                System.out.println("La opción no es válida.");
	        }

        }while(op!=0);
        
        leer.close();   
    }
}
