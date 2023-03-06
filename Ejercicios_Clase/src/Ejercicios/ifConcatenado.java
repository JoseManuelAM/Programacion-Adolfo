package Ejercicios;
import java.util.Scanner;

public class ifConcatenado {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    int a = leer.nextInt();
    System.out.println("Introduzca otro número: ");
    int b = leer.nextInt();
    		
    if(a>b) {
    	System.out.println(a+" es mayor que "+b);
    }else if (b>a) {
    	System.out.println(b+" es mayor que "+a);
    }else {
    	System.out.println(a+" y "+b+" son iguales.");
    }
    	
    leer.close();
    }
  }