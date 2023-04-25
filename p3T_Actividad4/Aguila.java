package p3T_Actividad4;

public class Aguila extends Carnivoro { //hereda de Carnivoro
	private double longitudAlas; //metros
	
	//constructor
	public Aguila(String nombre, int edad, String especie, String habitat, String hierbaFavorita, double longitudAlas) {
		super(nombre, edad, especie, habitat, hierbaFavorita); //referencia al constructor de la superclase (Carnivoro)
		this.longitudAlas=longitudAlas;
	}
	
	//métodos
	public void aleteo() {
		System.out.println("El águila bate sus alas.");
	}
	
	@Override
	public void hacerRuido() {
		System.out.println("Kyaaaa");
	}
	
	//getters
	public double longitudAlas() {
		return longitudAlas;
	}
}
