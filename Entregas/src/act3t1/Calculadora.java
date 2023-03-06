package act3t1;

import java.util.Scanner;

public class Calculadora {
	
    //Declaramos las funciones a utilizar para la calculadora:
	
    public static double sumar(double a, double b) {  //Las funciones devuelven la operación cuyo nombre tiene cada una. Indicamos dos parámetros, que son los números que introducirá el usuario en el programa
        return a + b;  //Devolvemos el cálculo que queremos para cada operación utilizando las variables genéricas de la función
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double num1, num2, res = 0; //Declaramos las variables del programa. Estos nombres no tienen porqué coincidir con los nombres asignados en las funciones
        int op;
        
        do { //Con el DO-WHILE controlamos que la calculadora se siga ejecutando hasta que el usuario introduzca el número cero, que sale del programa
        	System.out.println();
        	System.out.println("*********************************MENÚ************************************");
        	System.out.println("1. Suma");
        	System.out.println("2. Resta");
        	System.out.println("3. Multiplicación");
        	System.out.println("4. División");
	        System.out.println("0. SALIR");
	        System.out.println();
	        System.out.print("Introduzca una opción: ");
	        op = leer.nextInt();

	        switch (op) { //Declaramos un caso para cada tipo de operación
            case 1:	
            	System.out.print("Introduzca un número:");
            	num1 = leer.nextDouble();
            	System.out.print("Introduzca otro número:");
            	num2 = leer.nextDouble();
            	
                res = sumar(num1, num2); //Hacemos la llamada a las funciones introduciendo su nombre, y entre paréntesis el nombre de las variables que queremos utilizar y lo guardamos en la variable 'res'
                System.out.println(num1+"+"+num2+" = "+res); //Imprimimos por pantalla la operación con el resultado correspondiente

                break;
                
            case 2: 
            	System.out.print("Introduzca un número:");
            	num1 = leer.nextDouble();
            	System.out.print("Introduzca otro número:");
            	num2 = leer.nextDouble();
            	
                res = restar(num1, num2);
                System.out.println(num1+"-"+num2+" = "+res);
                break;
                
            case 3:  
            	System.out.print("Introduzca un número:");
            	num1 = leer.nextDouble();
            	System.out.print("Introduzca otro número:");
            	num2 = leer.nextDouble();
            	
                res = multiplicar(num1, num2);
                System.out.println(num1+"*"+num2+" = "+res);
                break;
                
            case 4:
            	System.out.print("Introduzca un número:");
            	num1 = leer.nextDouble();
            	System.out.print("Introduzca otro número:");
            	num2 = leer.nextDouble();
            	
                if (num2 == 0) { //Indicamos que la división no es válida si el segundo número es cero
                    System.out.println("No se puede dividir entre cero.");
                } else {
                    res = dividir(num1, num2);
                    System.out.println(num1+"/"+num2+" = "+res);
                }
                break;
            default:
                System.out.println("La operación no es válida."); //En caso de que el usuario introduzca un número de operación incorrecto, se mostrará este mensaje.
	        }

        }while(op!=0);
        
        leer.close();   
    }
}
