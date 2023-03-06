package misclases;

import misclases.Animal; //Importamos la clase Animal para poder usarla
import misclases.Videojuego;

public class Ejemplo {

	public static void main(String[] args) {
		// Creamos un animal cuyo nombre será Halcón
		Animal miAnimal = new Animal("Halcón");
		
		//Le establecemos 5 años de edad a Halcón
		miAnimal.setEdad(5);
		
		//Establecemos su raza que es Ave
		miAnimal.setRaza("ave");
		
		//Mostraremos el nombre del animal por pantalla
		System.out.print("El nombre es: " + miAnimal.getNombre());
		
		//Mostramos la edad del animal por pantalla
		System.out.print(", tiene " + miAnimal.getEdad() + " años");
		
		//Mostramos la raza del animal por pantalla
		System.out.println(" y su raza es " + miAnimal.getRaza());
		//Este código debería imprimir "El nombre es: Halcón, tiene 5 años y su raza es Ave"
		
		
		System.out.println();
		
		
		Videojuego miVideojuego = new Videojuego("Super Mario Bros.");
		
		miVideojuego.setCategoria("Plataformas");
		miVideojuego.setLanzamiento(1985);
		miVideojuego.setPlataforma("NES");
		
		System.out.print("El título es: " + miVideojuego.getTitulo());
		System.out.print(", su categoría es: " + miVideojuego.getCategoria());
		System.out.print(" y fue lanzado en " + miVideojuego.getLanzamiento());
		System.out.println( " para " + miVideojuego.getPlataforma());
	}
	

}
