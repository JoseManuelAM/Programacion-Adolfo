package Ejercicios;
import java.util.Scanner;

public class ifDoble {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    int a = leer.nextInt();
    System.out.println("Introduzca otro número: ");
    int b = leer.nextInt();
    		
    if(a>b) {
    	System.out.println(a+" es mayor que "+b);
    }else {
    	System.out.println(b+" es mayor o igual que "+a);
    }
    	
    leer.close();
    }
  }