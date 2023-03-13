package repasot1;

import java.util.Arrays;
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
            	System.out.println("Vamos a generar un vector aleatorio con números del 1 al 100: ");
            	int aleatorio[];
            	aleatorio = new int[5];
            	for(int i=0; i<aleatorio.length; i++) { //Recorremos el vector
            		aleatorio[i]=(int)(Math.random()*100+1); //Generamos un número aleatorio entre el 1 y el 100 en la posición 'i' del vector
            		System.out.print(aleatorio[i]+" ");
            	}
            	System.out.println("\nImprimimos el vector al revés: ");
            	for(int i=aleatorio.length-1; i>=0; i--) { //Recorremos el vector de forma inversa
            		System.out.print(aleatorio[i]+" ");
            	}
            	int aleatorioCopia[];
            	aleatorioCopia = new int[aleatorio.length];
            	System.out.println("\nCreamos una copia del vector generado aleatoriamente:");
            	for(int i=0; i<aleatorio.length; i++) {
            		aleatorioCopia[i] = aleatorio[i]; //Copiamos el valor actual en el vector copia
            		System.out.println(aleatorio[i]+" Original");
            		System.out.println(aleatorio[i]+" Copia");
            	}
            	System.out.println("Ordenamos el vector de forma ascendente y lo imprimimos:");
            	Arrays.sort(aleatorio); //Ordenamos el vector de forma ascendente
            	System.out.print(Arrays.toString(aleatorio));//Imprimimos el vector por pantalla ('toString' convierte el vector en una cadena de caracteres)
            	break;
            	
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