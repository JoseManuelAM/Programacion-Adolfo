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
	public void hacerRuido() { //con @Override, modifico el método general de Animal para ponerle al águila un sonido personalizado
		System.out.println("Kyaaaa");
	}
	
	//getters
	public double getLongitudalas() {
		return longitudAlas;
	}
}
