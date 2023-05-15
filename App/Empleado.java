package App;

import java.util.Date;

public class Empleado extends Persona {
	//atributos
	private int antiguedad;
	
	//constructor
	public Empleado(String nombre, Date fechaNac, int antiguedad) {
		super(nombre, fechaNac);
		this.antiguedad=antiguedad;
	}
	
	//getters
	public int getAntiguedad() {
		return antiguedad;
	}
}