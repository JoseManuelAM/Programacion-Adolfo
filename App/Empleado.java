package App;

public class Empleado extends Persona {
	//atributos
	private int antiguedad; //años que lleva trabajando en la tienda
	
	//constructor
	public Empleado(String nombre, String fechaNac, int antiguedad) {
		super(nombre, fechaNac);
		this.antiguedad=antiguedad;
		this.setDescuento(5);
	}
	
	//getters
	public int getAntiguedad() {
		return antiguedad;
	}
}