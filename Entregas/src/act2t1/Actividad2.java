package act2t1;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
        int op=0, n;
        int fact=1;
        							// DO-WHILE
        do{                          //Este bucle do-while hace que se muestre el menú siempre que el número introducido sea distinto de 0, que es la salida del programa.
        	System.out.println();
            System.out.println("***********************************MENU***********************************");
            System.out.println("1.Muestra por pantalla los números pares del 0 a un número n introducido por teclado.");
            System.out.println("2.Muestra por pantalla los números impares del 1 a un número n introducido por teclado.");
            System.out.println("3.Devuelve el factorial de un número introducido por teclado.");
            System.out.println("0.SALIR");
            System.out.println();
            System.out.print("--Introduzca una opción: ");
            op=leer.nextInt();
            						// SWITCH
            switch(op) {             //Implemento el menú del programa
            case 1:
               System.out.print("Introduzca hasta el número que desea imprimir los pares: ");
               n = leer.nextInt();
               while(n<0) {      //Nos aseguramos que el usuario introduzca un número mayor o igual a cero, que es el primer par.
            	   System.out.print("Error. Introduzca un número positivo: ");
            	   n = leer.nextInt();
               }                        //FOR
               for(int i=0; i<=n; i++) { //Recorremos todos los números desde cero al número que introduzca por teclado el usuario.
       				if(i%2!=0) continue; //Con 'CONTINUE' hacemos que si el resto del número dividido por dos es distinto de cero, continúe al siguiente número.
       				System.out.println(i); //muestra i.
       			}
               break; //con 'BREAK', rompemos el caso para que no ejecute nada más.
               
            case 2:
            	System.out.print("Introduzca hasta el número que desea imprimir los impares: ");
                n = leer.nextInt();
                while(n<0) {      //Nos aseguramos que el usuario introduzca un número mayor que 1, que es el primer impar.
             	   System.out.print("Error. Introduzca un número positivo: ");
             	   n = leer.nextInt();
                }
                for(int i=0; i<=n; i++) {
        				if(i%2==0) continue; //Con 'CONTINUE' hacemos que si el resto del número dividido por dos es cero, continúe al siguiente número.
        				System.out.println(i); //muestra i.
        			}
                break;
                
            case 3:
            	System.out.print("Introduzca un número para devolver su factorial: ");
            	n = leer.nextInt(); 
            	while(n<1) {    // WHILE
            		System.out.print("No existe el factorial de los números negativos. Introduzca uno positivo: ");
            	}
            		for (int i=n;i>0;i--) { //Realizamos el factorial del número introducido iniciando el bucle en el número y restando uno cada vez hasta llegar a 1 (el factorial de 3 por ejemplo es 3*2*1)
            			fact=fact*i;
            		}
            		System.out.println("El factorial de "+n+" es "+fact);
            	break;
            	
            case 0:
                   System.out.println("[Programa finalizado]");
                break;
                
            default: //En caso de introducir un número fuera de los límites del menú, devuelve el valor por defecto 'opción inválida'.
                System.out.println("Opción inválida.");
            }
   
        }while((op!=0)); //si se introduce un 0, finaliza el programa
        
        leer.close();	
        
	}
        
}