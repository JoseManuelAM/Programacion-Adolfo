package aplicacion;

import java.time.LocalDateTime;

public class Empleado {
	//atributos
	private String nombre;
	private int edad;
	private int sueldo;
	
	LocalDateTime localDate=LocalDateTime.now(); //saca la hora del equipo
	int hora=localDate.getHour(); //guardo la hora en una variable
	
	//constructor
	public Empleado(String nombre, int edad, int sueldo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sueldo=sueldo;
	}
	
	//métodos
	public void saludar() { //dependiendo de la hora del ordenador al ejecutar el programa, se mostrará un mensaje
		if(hora>=8 && hora<=12) {
			System.out.println("Buenos días! Soy "+nombre+" y le doy la bienvenida al zoológico.");
		} else if(hora>=13 && hora<=19){
			System.out.println("Buenas tardes! Soy "+nombre+" y le doy la bienvenida al zoológico.");
		} else if (hora>=20 && hora<=23){
			System.out.println("Buenas noches! Soy "+nombre+" y le doy la bienvenida al zoológico.");
		} else {
			System.out.println("El zoológico está cerrado, el horario de acceso es de 8 a 23h.");
		}
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public int getSueldo() {
		return sueldo;
	}
}
