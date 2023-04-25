package p3T_Actividad4;

public class Animal {
//Adolfo, yo estuve el primer día que hubo musicote
	
	static int numAnimales=0; //esto es una variable global que se incrementará cada vez que se cree algún animal nuevo en cualquier clase.
	
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String especie;
	
	//constructor
	public Animal(String nombre, int edad, String especie, String habitat) {
		this.nombre=nombre; //this hace referencia a los atributos de la clase
		this.edad=edad;
		this.habitat=habitat;
		this.especie=especie;
		numAnimales++; //incrementa al crear un animal
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
	public String getNombre(String nombre) {
		return nombre;
	}
	public String getEdad(String edad) {
		return edad;
	}
	public String getHabitat(String habitat) {
		return habitat;
	}
	public String getEspecie(String especie) {
		return especie;
	}
	//los métodos y getters de Animal serán heredados por Herviboro, Carnivoro y sus subclases
}
