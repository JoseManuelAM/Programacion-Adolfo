package act4t1;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int op;
        
        do {
        	System.out.println();
        	System.out.println("*********************************MENÚ************************************");
        	System.out.println("1. Creación de un array");
        	System.out.println("2. Valores random en Array");
        	System.out.println("3. Imprimir el Array al revés");
        	System.out.println("4. Copia de Array");
        	System.out.println("5. Buscar un dato de forma secuencial");
	        System.out.println("0. SALIR");
	        System.out.println("*************************************************************************");
	        System.out.print("-- Introduzca una opción: ");
	        op = leer.nextInt();

	        switch (op) {
            case 1:	
            	int []arr; //CREACIÓN DE ARRAY
        		arr = new int[5]; //Establecemos la longitud del array
        		//Le damos valores a cada registro del array
        		arr[0]=2; 
        		arr[1]=5; 
        		arr[2]=3; 
        		arr[3]=7; 
        		arr[4]=6;
        		System.out.print("El array creado es el siguiente: ");
        		for(int i=0; i<arr.length; i++) {
        			System.out.print(arr[i]+ " ");
        		}
        		System.out.println();
                break;
                
            case 2: 
            	int []aleatorio; //Vamos a crear un array aleatorio cuya longitud sea determinada por el usuario
        		int n;
        		System.out.println("Vamos a crear un array que se inicialice con valores aleatorios.");
        		System.out.println("Introduce el número de posiciones del array: ");
        		n = leer.nextInt();
        		aleatorio = new int[n]; //Asignamos el número de posiciones al array
        		for(int i=0; i<aleatorio.length; i++) { //Recorremos el vector para introducir los valores uno a uno
        			aleatorio[i] = (int)(Math.random()*10+1); //Insertamos los VALORES RANDOM para cada posición usando "Math.random". En este caso, se introducirán números aleatorios comprendidos entre el 1 y el 10.
        			System.out.print(aleatorio[i]+" ");
        		}
        		System.out.println("\nEste ha sido el vector generado aleatoriamente.");
                break;
                
            case 3:  
            	int[]arr2 = {2,5,8,6,3};
            	System.out.print("Vamos a imprimir el siguiente array al revés: ");
            	for(int i=0; i<arr2.length; i++) {
        			System.out.print(arr2[i]+ " ");
        		}
            	System.out.println("\nAl revés el array sería: ");
            	for(int i=arr2.length-1; i>=0; i--) { //IMPRIMIR EL ARRAY DEL REVÉS
        			System.out.print(arr2[i]+" ");
            	}
            	System.out.println();
                break;
                
            case 4:
            	int []arr3 = {4,7,9,1,2};
            	int[]arrCopia; //Creamos el array copia
            	arrCopia = new int[arr3.length]; //Este array lo usaremos para hacer una copia del anterior
            	System.out.print("Vamos a hacer una copia del siguiente array: ");
            	for(int i=0; i<arr3.length; i++) {
        			System.out.print(arr3[i]+ " ");
        		}
            	System.out.println();
            	for(int i=0; i<arr3.length; i++) {
        			arrCopia[i] = arr3[i]; //COPIAMOS EL VALOR DEL ARRAY "arr" a la copia
        			//Imprimimos los valores del original y de la copia
        			System.out.println(arr3[i]+" Original");
        			System.out.println(arrCopia[i]+" Copia\n");
        		}
                break;
                
            case 5:
            	int[]arrSecuencial = {3,5,7,9,6};
        		int clave;
        		System.out.print("Vamos a buscar un dato de forma secuencial en el siguiente array: ");
        		for(int i=0; i<arrSecuencial.length; i++) {
        			System.out.print(arrSecuencial[i]+ " ");
        		}
        		System.out.print("\nIntroduzca el valor a buscar en el array, y en caso de estar en el array dirá la posición en la que se encuentra: ");
        		clave = leer.nextInt();
        		for (int i=0; i<arrSecuencial.length; i++) { //Recorremos el array en busca de la clave DE FORMA SECUENCIAL
        			if(arrSecuencial[i]==clave) {
        				System.out.println("El valor está en la posición "+i+" del array.");
        			}
        		}
        		System.out.println();
        		break;
                
            default:
                System.out.println("La opción no es válida.");
	        }

        }while(op!=0);
        
        leer.close();   
    }
}