package App;

import java.util.Date;

public class Persona {
	//atributos
	private String nombre;
	private Date fechaNac;
	
	//constructor
	public Persona(String nombre, Date fechaNac) {
		this.nombre=nombre;
		this.fechaNac=fechaNac;
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	
	public Date getFechanac() {
		return fechaNac;
	}
}
