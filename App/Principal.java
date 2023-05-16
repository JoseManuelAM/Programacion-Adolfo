package App;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Principal {
	
	public static void mostrarCatalogo(ArrayList<Producto> productos) { //método que muestra el catálogo de productos de la tienda (nombre y precio de cada uno)
		for(int i=0; i<productos.size(); i++) { //recorrer el arraylist
			Producto producto_i=productos.get(i); //producto iésimo del array, almacenado en una variable
			System.out.println(i+" - "+producto_i.getNombre()+": "+producto_i.getPrecio()+"€"); //imprime el nombre y el precio de cada producto
		}
	}
	
	public static void catalogoDetallado(ArrayList<Videojuego> productos) { //método que muestra el catálogo de productos de la tienda (nombre y precio de cada uno)
		for(int i=0; i<productos.size(); i++) { //recorrer el arraylist
			Producto producto_i=productos.get(i); //producto iésimo del array, almacenado en una variable
			System.out.println(i+" - "+producto_i.getNombre());
			System.out.println();//imprime el nombre y el precio de cada producto
		}
	}
	
	public static int pedirTipoUsuario(Scanner leer) { //Método para pedir el tipo de usuario al iniciar la aplicación (dependiendo del usuario, se le aplicará un descuento
		int usuario;
		do { //DO WHILE que repite que se introduzca un usuario mientras que no se introduzca un número válido
			System.out.println("Introduzca un tipo de usuario válido (1,2,3):");
	    	System.out.println("1. Usuario estándar");
	    	System.out.println("2. Usuario VIP");
	    	System.out.println("3. Empleado");
	    	usuario=leer.nextInt();
		} while(usuario<1 || usuario>3);
    	return usuario;
	}
	
	public static void main(String[] args) {
	    Scanner leer = new Scanner(System.in);
	    int opcion; //esta variable controla la opción del programa que introducirá el usuario, mediante un switch
	    ArrayList<Producto> productos=new ArrayList<>(); //ArrayList que almacenará los productos de la tienda
	    Listacompra compraActual=new Listacompra(); //objeto de la clase Listacompra para almacenar
	    
	    //Productos disponibles en la tienda
	    Videojuego mario=new Videojuego("Super Mario Bros", "Clásico videojuego de plataformas protagonizado por el fontanero Mario", 109.99, 10, "NES");
	    Videojuego metroid=new Videojuego("Metroid Prime", "Videojuego que describe las aventuras de la cazarrecompensas Samus Aran en el planeta Tallon IV", 65.99, 7, "Gamecube");
	    Videojuego starwars=new Videojuego("Star Wars Jedi-Survivor", "Videojuego del universo Star Wars, en el que el protagonista, Cal, es uno de los últimos Jedi que quedan en la galaxia", 69.99, 25, "PC");
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
    	
    	int usuarioActual=pedirTipoUsuario(leer); //almacenar la variable introducida por teclado del tipo de usuario
    	Persona cliente; //definir el cliente
    	if(usuarioActual==1) { //IF anidados que crean un objeto de Usuario, UsuarioVIP o Empleado dependiendo del valor que haya introducido el usuario
    		cliente=new Usuario("Juan", "1/1/1990"); //si el usuario es 1 defino el cliente como usuario normal
    	} else if(usuarioActual==2) {
    		cliente=new UsuarioVIP("Juan", "1/1/1990"); //si es 2 defino el cliente como usuario VIP
    	} else {
    		cliente=new Empleado("Juan", "1/1/1990", 5); //si es 3 defino el cliente como empleado
    	}
    	
	    do { //DO-WHILE que gestiona el menú, y al introducir 0 finaliza el programa
	        System.out.println("\n-------------------------------TIENDA DE VIDEOJUEGOS Y ELECTRÓNICA--------------------------------\n");
	        System.out.println("1. Listar productos");
	        System.out.println("2. Añadir un producto a la lista de la compra");
	        System.out.println("3. Eliminar un producto a la lista de la compra");
	        System.out.println("4. Visualizar productos en la lista de la compra");
	        System.out.println("5. Realizar compra");
	        System.out.println("0. SALIR\n");
	        System.out.print("- Introduzca una opción: ");
	        opcion=leer.nextInt();
	        
	        switch(opcion) { //SWITCH que controla los diferentes casos de la aplicación
	            case 1:
	            	//Listar productos
	            	mostrarCatalogo(productos); //mediante el método 'mostrarCatalogo' recorre el ArrayList creado y muestra la información
	            	compraActual.getLista();
	                break;
	            case 2:
	                //Añadir producto a la lista
	            		System.out.print("Indique el número de producto que quiere añadir: ");
	            		int prodAnadir=leer.nextInt(); 
		            	System.out.print("Indique el número de unidades que desea de ese producto: ");
		            	int unidadesAnadir=leer.nextInt();
		            	if(unidadesAnadir<=0) {
		            		System.out.println("No se ha actualizado la lista, no puede añadir 0 o menos unidades de un producto.");
		            		break;
		            	}
		            	// Añade un bloque try-catch aquí para manejar la excepción IndexOutOfBoundsException
		                try {
		                    compraActual.anadirProducto(prodAnadir, unidadesAnadir); //mediante el método anadirProducto
		                } catch (IndexOutOfBoundsException e) {
		                    System.out.println("El número de producto que ha introducido no existe. Por favor, introduzca un número válido.");
		                }
		                break;
	            case 3:
	                //Eliminar producto de la lista
	            	System.out.print("Indique el número de producto que quiere eliminar:");
	            	int prodEliminar=leer.nextInt();
	            	System.out.print("Indique el número de unidades que desea eliminar de ese producto: ");
	            	int unidadesEliminar=leer.nextInt();
	            	compraActual.eliminarProducto(prodEliminar, unidadesEliminar);
	                break;
	            case 4:
	                //Visualizar productos en la cesta
	            	compraActual.listar(); //recorre el ArrayList de enteros que contiene los identificadores de los productos añadidos
	                break;
	            case 5:
	            	//Comprar
	            	cliente.comprar(compraActual, productos);
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