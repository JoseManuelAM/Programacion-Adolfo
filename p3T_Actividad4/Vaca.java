package p3T_Actividad4;

public class Vaca extends Herviboro { //hereda de Herviboro
	private int cantidadLeche; //litros
	
	//constructor
	public Vaca(String nombre, int edad, String especie, String habitat, String hierbaFavorita, int cantidadLeche) {
		super(nombre, edad, especie, habitat, hierbaFavorita); //referencia al constructor de la superclase (Herviboro)
		this.cantidadLeche=cantidadLeche;
		}
	
	//métodos
	public void sacarLeche(int n) {
		cantidadLeche=cantidadLeche-1;
		if(cantidadLeche>=n) {
			cantidadLeche=cantidadLeche-n;
			System.out.println("Se han ordeñado "+n+" litros de leche.");
			
		}else {
			System.out.println("La vaca no tiene suficiente leche.");
		}
	}
	
	@Override
	public void hacerRuido() { //modifico el método hacer ruido para que la vaca tenga su propio ruido. Voy a hacer lo mismo para Jirafa, Leon y Aguila, para que tengan su propio sonido personalizado.
		System.out.println("Muuuuuu");
	}
	
	//getters
	public int getCantidadleche() {
		return cantidadLeche;
	}
}
