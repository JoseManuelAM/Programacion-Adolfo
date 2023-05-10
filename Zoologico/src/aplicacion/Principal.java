package aplicacion;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	    Scanner leer = new Scanner(System.in);
	    int opcion; //esta variable controla la opción del programa que introducirá el usuario
	    String[] animales=new String[7]; //array que almacenará los animales que hay en el zoológico
	    animales[0]="Elefante";
	    animales[1]="Tigre";
	    animales[2]="Vaca";
	    animales[3]="Jirafa";
	    animales[4]="León";
	    animales[5]="Águila";
	    animales[6]="Mono";

	    Empleado empleado1=new Empleado("Juan", 27, 1500);//creo dos empleados para la tienda
	    Empleado empleado2=new Empleado("Alba", 22, 1100);
	    do {
	    	empleado1.saludar();
	        System.out.println("-------------------------------ZOOLÓGICO --------------------------------");
	        System.out.println();
	        System.out.println("1. Ver el tipo de animales que hay en el zoológico");
	        System.out.println("2. Visita guiada por el zoológico.");
	        System.out.println("3. Sugerir animales que deberíamos traer a nuestras instalaciones");
	        System.out.println("0. SALIR");
	        System.out.println();
	        System.out.println("--Introduzca una opción:");
	        
	        opcion=leer.nextInt();
	        
	        switch (opcion) {
	            case 1:
	            	animales.toString();
	                break;
	            case 2:
	                
	                break;
	            case 3:
	                
	                break;
	            case 4:
	                
	                break;
	            case 0:
	                System.out.println("Gracias por visitar nuestro . ¡Vuelva cuando quiera!");
	                break;
	            default:
	                System.out.println("La opción introducida no es válida.");
	                break;
	        }
	    } while (opcion!=0);
	}

}