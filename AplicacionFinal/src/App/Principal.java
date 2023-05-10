package App;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	    Scanner leer = new Scanner(System.in);
	    int opcion1; //esta variable controla la opción del programa que introducirá el usuario
	    double saldoUsuario; //saldo que posee el usuario al entrar a la tienda
	    String[] productos=new String[6]; //array que almacenará los productos de la tienda
	    
	    Empleado empleado1=new Empleado("Juan", 27, 1500);//creo dos empleados para la tienda
	    Empleado empleado2=new Empleado("Alba", 22, 1100);
	    Videojuego marioBros=new Videojuego("Super Mario Bros.", "Clásico videojuego de plataformas protagonizado por el fontanero Mario", 109.99, 3, "NES");
	    Videojuego metroidPrime=new Videojuego("Metroid Prime", "Videojuego que describe las aventuras de la cazarrecompensas Samus Aran en el planeta Tallon IV", 65.99, 1, "Gamecube");
	    Telefono samsung=new Telefono("Samsung Galaxy S23", "Teléfono de alta gama de la marca Samsung", 1299.99, 10, "Samsung", "S23");
	    Telefono iphone=new Telefono("IPhone 14", "Teléfono de alta gama de la marca Apple", 1499.99, 8, "Apple", "14");
	    Producto bombilla=new Producto("Bombilla", "Bombilla estándar", 6.50, 50);
	    
    	productos[0]=marioBros.getNombre();
    	productos[1]=metroidPrime.getNombre();
    	productos[2]=samsung.getNombre();
    	productos[3]=iphone.getNombre();
    	
	    do {
	    	empleado1.saludar();
	        System.out.println("-------------------------------TIENDA DE VIDEOJUEGOS Y ELECTRÓNICA--------------------------------");
	        System.out.println();
	        System.out.println("1. Lista de productos disponibles en la tienda");
	        System.out.println("2. Comprar un producto");
	        System.out.println("3. Vender un producto");
	        System.out.println("4. Historial de transacciones");
	        System.out.println("0. SALIR");
	        
	        opcion1 = leer.nextInt();
	        
	        switch (opcion1) {
	            case 1:
	            	
	                break;
	            case 2:
	                //Comprar producto
	                break;
	            case 3:
	                //Vender producto
	                break;
	            case 4:
	                //Historial de transacciones
	                break;
	            case 0:
	                System.out.println("Gracias por utilizar nuestros servicios. ¡Vuelva cuando quiera!");
	                break;
	            default:
	                System.out.println("La opción introducida no es válida.");
	                break;
	        }
	    } while (opcion1!=0);
	}

}
