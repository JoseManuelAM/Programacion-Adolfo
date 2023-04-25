package p3T_Actividad4;

public class Jirafa extends Herviboro { //hereda de Herviboro
	private int longitudCuello; //cm
	
	//constructor
	public Jirafa(String nombre, int edad, String especie, String habitat, String hierbaFavorita, int longitudCuello) {
		super(nombre, edad, especie, habitat, hierbaFavorita); //referencia al constructor de la superclase (Herviboro)
		this.longitudCuello=longitudCuello;
	}
	
	//métodos
	public void estirarCuello() {
		System.out.println("La jirafa ha conseguido alargar su cuello hasta "+longitudCuello+10+" centímetros.");
	}
	
	@Override
	public void hacerRuido() {
		System.out.println("Hummmm");
	}
	
	//getters
	public int getLongitudcuello() {
		return longitudCuello;
	}
}
