package p3T_Actividad4;

public class Animal {
//Adolfo, yo estuve el primer día que hubo musicote
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String especie;
	
	//constructor
	public Animal(String nombre, int edad, String especie, String habitat) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.especie=especie;
	}
	
	//métodos
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
}
