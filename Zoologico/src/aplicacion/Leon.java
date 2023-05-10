package aplicacion;

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
	public void hacerRuido() { //con @Override, modifico el método general de Animal para ponerle al león un sonido personalizado
		System.out.println("Grrrr");
	}
	
	//getters
	public int getVelocidad() {
		return velocidad;
	}
}
