package Ejercicios;

import java.util.Scanner;

public class programa2 {

	public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); /* creamos el Scanner para que podamos poner datos por teclado */
       
        System.out.print("Introduce un numero: "); /* Mensaje que indica que introduja un numero entero */
        int n = entrada.nextInt(); /* creamos la variable entero n que le asociamos el numero que introducimos por pantalla*/
       
        boolean par = (n % 2) == 0;
        System.out.println("Es par: " + par);
        
        entrada.close();
    }
}
