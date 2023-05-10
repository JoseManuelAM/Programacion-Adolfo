package App;

public class Producto implements Compraventa {
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
	public void comprar(String nombre, int cantidad) {
		if(cantidad>stock) {
			System.out.println("Quedan "+stock+" unidades de "+nombre) //restamos una unidad del stock disponible
			=stock-cantidad;
		} else {
			stock=stock-cantidad;
		}
		
	}
	
	public void vender(String nombre, int cantidad) {
		stock=stock+cantidad;
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
