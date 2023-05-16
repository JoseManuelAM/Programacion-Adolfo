package App;

public class Videojuego extends Producto {
	//atributos
	String plataforma;
	
	//constructor
	public Videojuego(String nombre, String descripcion, double precio, int stock, String plataforma) {
		super(nombre, descripcion, precio, stock); //
		this.plataforma=plataforma;
	}
	
	//getters
	public String getPlataforma() {
		return plataforma;
	}
}