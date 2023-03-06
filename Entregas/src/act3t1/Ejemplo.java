package act3t1;

import act3t1.Videojuego; //Importamos la clase Videojuego para poder usarla

public class Ejemplo {

	public static void main(String[] args) {
		
		//Creamos un videojuego cuyo título será Super Mario Bros.
		Videojuego miVideojuego = new Videojuego("Super Mario Bros.");
		
		//Le establecemos la categoría Plataformas a Super Mario Bros
		miVideojuego.setCategoria("Plataformas");
		
		//Establecemos su año de lanzamiento que es 1985
		miVideojuego.setLanzamiento(1985);
		
		//Establecemos su plataforma que es la NES
		miVideojuego.setPlataforma("NES");
		
		//Establecemos su creador que es Shigeru Miyamoto
		miVideojuego.setCreador("Shigeru Miyamoto");
		
		//Mostramos por pantalla todos los datos, mediante los métodos get
		System.out.print("El título es: " + miVideojuego.getTitulo()); 
		System.out.print(", su categoría es: " + miVideojuego.getCategoria());
		System.out.print(" y fue lanzado en " + miVideojuego.getLanzamiento());
		System.out.print( " para " + miVideojuego.getPlataforma());
		System.out.println(". Su creador fue "+ miVideojuego.getCreador());
	}
	

}
