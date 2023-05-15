package App;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Principal {
	
	public static void mostrarCatalogo(ArrayList<Producto> productos) { //método que muestra el catálogo de productos de la tienda (nombre y precio de cada uno)
		for(int i=0; i<productos.size(); i++) { //recorrer el arraylist
			Producto producto_i=productos.get(i); //producto iésimo del array, almacenado en una variable
			System.out.println(i+" - "+producto_i.getNombre()+": "+producto_i.getPrecio()+"€");
		}
	}
	
	public static void main(String[] args) {
	    Scanner leer = new Scanner(System.in);
	    int opcion; //esta variable controla la opción del programa que introducirá el usuario
	    ArrayList<Producto> productos=new ArrayList<>(); //array que almacenará los productos de la tienda
	    
	    //Productos disponibles en la tienda
	    Videojuego mario=new Videojuego("Super Mario Bros.", "Clásico videojuego de plataformas protagonizado por el fontanero Mario", 109.99, 10, "NES");
	    Videojuego metroid=new Videojuego("Metroid Prime", "Videojuego que describe las aventuras de la cazarrecompensas Samus Aran en el planeta Tallon IV", 65.99, 7, "Gamecube");
	    Videojuego starwars=new Videojuego("Star Wars Jedi: Survivor", "Videojuego del universo Star Wars, en el que el protagonista, Cal, es uno de los últimos Jedi que quedan en la galaxia", 69.99, 25, "PC");
	    Telefono samsung=new Telefono("Samsung Galaxy S23", "Teléfono de alta gama de la marca Samsung", 1299.99, 20, "Smartphone");
	    Telefono iphone=new Telefono("IPhone 14", "Teléfono de alta gama de la marca Apple", 1499.99, 12, "Smartphone");
	    Telefono fijo=new Telefono("Panasonic KX", "Teléfono fijo inalámbrico digital", 24.99, 10, "Teléfono fijo");
	    Ordenador msi=new Ordenador("MSI GE66 Raider", "Portátil de la marca msi", 1999.99, 30, "Windows", "Intel Core i7 12900K", "Nvidia Geforce RTX 3070");
	    Ordenador macbook=new Ordenador("Macbook Air M2", "Portátil de la marca Apple con el nuevo chip M2, un diseño ultrafino, rápido y eficiente", 2499.99, 15, "MacOS", "CPU de 8 núcleos", "GPU de 10 núcleos con Neural Engine");
	    Producto bombilla=new Producto("Bombilla", "Bombilla estándar", 6.50, 50);
	    
	    //Añadir los productos al ArrayList
    	productos.add(mario);
    	productos.add(metroid);
    	productos.add(starwars);
    	productos.add(samsung);
    	productos.add(iphone);
    	productos.add(fijo);
    	productos.add(msi);
    	productos.add(macbook);
    	productos.add(bombilla);
    	
    	
    	System.out.print("Regístrese con su tipo de usuario (usuario, usuariovip o empleado): ");
    	String usuarioActual=leer.nextLine();
    	if(usuarioActual.equals("Usuario"))*/
    	
	    do {
	        System.out.println("\n-------------------------------TIENDA DE VIDEOJUEGOS Y ELECTRÓNICA--------------------------------\n");
	        System.out.println("1. Listar productos");
	        System.out.println("2. Añadir un producto a la lista de la compra");
	        System.out.println("3. Eliminar un producto a la lista de la compra");
	        System.out.println("4. Visualizar productos en la cesta");
	        System.out.println("5. Realizar compra");
	        System.out.println("0. SALIR\n");
	        System.out.print("- Introduzca una opción: ");
	        opcion=leer.nextInt();
	        
	        switch(opcion) {
	            case 1:
	            	//Listar productos
	            	mostrarCatalogo(productos);
	                break;
	            case 2:
	                //Añadir producto a la lista
	            	System.out.println("Introduzca el índice del producto que quiere añadir a la compra, y las unidades: ");
	                break;
	            case 3:
	                //Eliminar producto de la lista
	            	System.out.println("Introduzca el índice del producto que quiere eliminar, y las unidades: ");
	                break;
	            case 4:
	                //Visualizar productos en la cesta
	            	
	                break;
	            case 5:
	            	//Comprar
	            	break;
	            case 0:
	                System.out.println("Gracias por utilizar nuestros servicios. ¡Vuelva cuando quiera!");
	                break;
	            default:
	                System.out.println("La opción introducida no es válida.");
	                break;
	        }
	    } while (opcion!=0);
	}

}