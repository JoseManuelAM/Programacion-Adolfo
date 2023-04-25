package p3T_Actividad4;

public class Leon extends Carnivoro { //hereda de Carnivoro
	private int velocidad; //km*h
	
	//constructor
	public Leon(String nombre, int edad, String especie, String habitat, String hierbaFavorita, int velocidad) {
		super(nombre, edad, especie, habitat, hierbaFavorita); //referencia al constructor de la superclase (Carnivoro)
		this.velocidad=velocidad;
	}
	
	//métodos
	public void zarpazo() {
		System.out.println("El león golpea con sus zarpas.");
	}
	
	@Override
	public void hacerRuido() {
		System.out.println("Grrrr");
	}
	
	//getters
	public int getVelocidad() {
		return velocidad;
	}
}
