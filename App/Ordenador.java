package App;

public class Ordenador extends Producto {
	//atributos
	String SO; //Sistema Operativo
	String procesador;
	String grafica;
	
	//constructor
	public Ordenador(String nombre, String descripcion, double precio, int stock, String SO, String procesador, String grafica) {
		super(nombre, descripcion, precio, stock);
		this.SO=SO;
		this.procesador=procesador;
		this.grafica=grafica;
	}
	
	//getters
	public String getSO() {
		return SO;
	}
	
	public String getProcesador() {
		return procesador;
	}
	
	public String getGrafica() {
		return grafica;
	}
}
