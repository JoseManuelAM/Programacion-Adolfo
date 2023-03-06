package Ejercicios;
import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Opción 1 para sumar ,Opción 2 para restar,Opción 3 para multiplicar");
    int opcion=leer.nextInt();
    System.out.println("Inserta un número");
    int num1=leer.nextInt();
    System.out.println("Inserta otro número");
    int num2=leer.nextInt();
    int suma=0;
    int resta=0;
    int mult=0;
    switch(opcion){
        case 1:
         suma=num1+num2;
         System.out.println();
         System.out.println(suma);
         break;
        case 2:
         resta=num1-num2;
         System.out.println();
         System.out.println(resta);
         break;
        case 3:
         mult=num1*num2;
         System.out.println();
         System.out.println(mult);
         break;
         
    }
    	leer.close();
    }
  }