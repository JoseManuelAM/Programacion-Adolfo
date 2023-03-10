package act1t1;

import java.util.Scanner;
/*
 * Realiza un programa que contenga los temas vistos en clase:
Comentarios
Salida por consola
Entrada de Datos
Operadores de asignación, aritméticos, relacionales y lógicos.
Conversión de tipos.
Operador Ternario.
 */
public class Actividad1 {

	public static void main(String[] args) {	
		Scanner leer = new Scanner(System.in);
		
		System.out.println("DESARROLLADO POR: José Manuel Aguilera Martín");
		System.out.println();
		
		//Definimos las variables que vamos a utilizar durante el programa.                      
		int x, y, menor;
		int edad;
		double nota1, nota2, nota3, media;
		int mayorEdad = 18;     //A esta variable le hemos asignado el valor 18 a la hora de declararla.
		boolean graduado;
		String nombre;                     
		
		System.out.print("Introduzca su nombre: "); //El comando System.out.print es la salida por consola. Todo lo que escribamos aquí se verá en la pantalla de ejecución del programa.
		nombre = leer.next();
		System.out.println("Bienvenido, "+nombre);
		
		
		System.out.println("1. Vamos a realizar un ejemplo con un operador ternario. Para ello, introduzca dos números y se le devolverá el menor de los dos números. ");
		System.out.print("Introduzca un número: ");
		x = leer.nextInt();
		System.out.print("Introduzca otro número: ");
		y = leer.nextInt();
		menor = (x<y) ? x:y;        //Realizamos la comparación de 'x' e 'y' mediante el operador ternario (?).
		System.out.println(menor);
		
		System.out.println("2. Ahora, introduzca su edad y las notas de los tres trimestres en el módulo de programación. Si es mayor de 18 años y la media de los trimestres es igual o superior a 5, puede graduarse.");
		System.out.println("En caso contrario, no. Para ello usaremos un operador booleano, que nos devolverá 'true' si puede graduarse o 'false' en caso contrario.");
		System.out.println("Introduzca su edad: ");
		edad = leer.nextInt();
		System.out.print("Introduzca la nota del primer trimestre: ");
		nota1 = leer.nextDouble();   //Con la clase scanner leemos datos que va a introducir el usuario por teclado.
		System.out.print("Introduzca la nota del segundo trimestre: ");
		nota2 = leer.nextDouble();
		System.out.print("Introduzca la nota del tercer trimestre: ");
		nota3 = leer.nextDouble();
		
		media = (nota1+nota2+nota3)/3;  //Aquí hacemos la media de las tres notas introducidas por el usuario.
		
		int mediaEntera = (int)media;   //Convertimos la media de las notas de double a int, para que la media del boletín sea un número entero.
	
		graduado = edad>=mayorEdad && media>=5; //Aquí usamos el booleano para ver si el usuario es mayor de edad y además su media es superior a cinco. Para unir ambas condiciones, usamos el operador AND (&), para que se tengan que cumplir ambas condiciones para que el usuario se pueda graduar.
		System.out.println(graduado);
		System.out.println("Su media del curso ha sido: "+media);
		System.out.println("En el boletín de notas su nota aparece como: "+mediaEntera);
		
		leer.close();
	}

}
