package App;

public class Producto implements Comprador {
	//atributos
	private String nombre;
	private String descripcion;
	private double precio;
	private int stock;
	
	//constructor
	public Producto(String nombre, String descripcion, double precio, int stock) { //establecer las características de un producto
		this.nombre=nombre; //this hace referencia al atributo de la clase
		this.descripcion=descripcion;
		this.precio=precio;
		this.stock=stock;
	}
	
	//métodos
	public void comprar() {
		
	}
	
	public void descuento() {
		
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int getStock() {
		return stock;
	}
}