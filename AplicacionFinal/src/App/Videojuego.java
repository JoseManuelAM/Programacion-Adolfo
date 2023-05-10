package App;

public class Videojuego extends Producto {
	//atributos
	String consola;
	
	//constructor
	public Videojuego(String nombre, String descripcion, double precio, int stock, String consola) {
		super(nombre, descripcion, precio, stock); //
		this.consola=consola;
	}
	
	//métodos
	public void jugar() {
		System.out.println("Metes el juego en la consola "+consola+" y comienzas a jugar.");
	}
	//getters
	public String getConsola() {
		return consola;
	}
}
