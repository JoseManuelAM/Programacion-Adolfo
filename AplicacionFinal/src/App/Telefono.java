package App;

public class Telefono extends Producto{
	//atributos
	String marca;
	String modelo;
	
	//constructor
	public Telefono(String nombre, String descripcion, double precio, int stock, String marca, String modelo) {
		super(nombre, descripcion, precio, stock);
		this.marca=marca;
		this.modelo=modelo;
	}
	
	//métodos
	public void llamar(int numero) {
		System.out.println("Marcando el número "+numero);
		System.out.println("Llamando...");
	}
	
	//getters
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
}
