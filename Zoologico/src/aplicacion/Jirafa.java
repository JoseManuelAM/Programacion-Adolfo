package aplicacion;

public class Jirafa extends Herviboro { //hereda de Herviboro
	private double longitudCuello; //m //variable de tipo double (con decimales)
	
	//constructor
	public Jirafa(String nombre, int edad, String especie, String habitat, String hierbaFavorita, double longitudCuello) {
		super(nombre, edad, especie, habitat, hierbaFavorita); //referencia al constructor de la superclase (Herviboro)
		this.longitudCuello=longitudCuello;
	}
	
	//métodos
	public void estirarCuello() {
		double cuelloEstirado=longitudCuello+1; //variable para almacenar el cuello estirado
		System.out.println("La jirafa ha conseguido alargar su cuello hasta "+cuelloEstirado+" metros.");
	}
	
	@Override
	public void hacerRuido() { //con @Override, modifico el método general de Animal para ponerle a la jirafa un sonido personalizado
		System.out.println("Hummmm");
	}
	
	//getters
	public double getLongitudcuello() {
		return longitudCuello;
	}
}
