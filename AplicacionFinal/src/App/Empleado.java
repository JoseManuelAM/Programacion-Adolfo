package App;

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
		if(hora>=8 && hora<=2) {
			System.out.println("Buenos días! Le atiende "+nombre+", sea bienvenido a nuestra tienda.");
		} else if(hora>=16 && hora<=19){
			System.out.println("Buenas tardes! Le atiende "+nombre+", sea bienvenido a nuestra tienda.");
		} else if (hora>=20 && hora<=22){
			System.out.println("Buenas noches! Le atiende "+nombre+", sea bienvenido a nuestra tienda.");
		} else {
			System.out.println("Este es un mensaje automático. La tienda se encuentra cerrada, pero puede realizar cualquier transacción y venir a recogerla/entregarla en horario hábil (8-2h/16-22h)");
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
