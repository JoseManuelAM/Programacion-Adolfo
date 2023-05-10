package aplicacion;

public class Animal {
//Adolfo, yo estuve el primer día que hubo musicote
	
	static int numAnimales=0; //VARIABLE GLOBAL que se incrementará cada vez que se cree algún animal nuevo en cualquier clase.
	
	//Atributos protegidos que solo se pueden acceder en el mismo paquete.
	//Al tener los atributos protegidos, están encapsulados, evitando que se accedan a ellos directamente, excepto para las clases vecinas. Para acceder a ellos creamos el constructor (introducir los datos) y los getters (devuelven el valor de un atributo)
	protected String nombre; //variable de tipo cadena de caracteres
	protected int edad; //variable de tipo entero
	protected String habitat;
	protected String especie;
	
	//constructor
	public Animal(String nombre, int edad, String especie, String habitat) {
		this.nombre=nombre; //THIS hace referencia al atributo de la clase
		this.edad=edad;
		this.especie=especie;
		this.habitat=habitat;
		numAnimales++; //incrementa en 1 al crear un nuevo animal
	}
	
	//métodos
	public void comer() {
		System.out.println("El animal come.");
	}
	public void dormir() {
		System.out.println("El animal se ha acamodado para descansar.");
	}
	
	public void hacerRuido() {
		System.out.println("El animal hace ruidos.");
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getEspecie() {
		return especie;
	}
	public int getAnimales() { //devuelve el número de animales que han sido creados
		return numAnimales;
	}
	//los métodos y getters de Animal serán heredados por Herviboro, Carnivoro y sus subclases
}