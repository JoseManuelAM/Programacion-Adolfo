package App;

public class Telefono extends Producto{
	//atributos
	String tipo;
	
	//constructor
	public Telefono(String nombre, String descripcion, double precio, int stock, String tipo) {
		super(nombre, descripcion, precio, stock);
		this.tipo=tipo;
	}
	
	//getters
	public String getTipo() {
		return tipo;
	}
}