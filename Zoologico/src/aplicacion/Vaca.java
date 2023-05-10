package aplicacion;

public class Vaca extends Herviboro { //hereda de Herviboro
	//Al tener los atributos privados, están encapsulados, evitando que se accedan a ellos directamente. Para acceder a ellos creamos el constructor (introducir los datos) y los getters (devuelven el valor de un atributo)
	private int cantidadLeche; //litros
	
	//constructor
	public Vaca(String nombre, int edad, String especie, String habitat, String hierbaFavorita, int cantidadLeche) {
		super(nombre, edad, especie, habitat, hierbaFavorita); //referencia al constructor de la superclase (Herviboro)
		this.cantidadLeche=cantidadLeche;
		}
	
	//métodos
	public void sacarLeche(int n) {
		if(cantidadLeche>=n) { //controlar que la vaca tiene suficientes litros para sacar.
			cantidadLeche=cantidadLeche-n;
			System.out.println("Se han ordeñado "+n+" litros de leche. Quedan "+cantidadLeche);
			
		}else { //si no tiene tantos como se han pasado por parámetro, mostrar el siguiente mensaje.
			System.out.println("La vaca no tiene suficiente leche.");
		}
	}
	
	@Override
	public void hacerRuido() { //con @Override, modifico el método general de Animal para ponerle a la vaca un sonido personalizado
		System.out.println("Muuuu");
	}
	
	//getters
	public int getCantidadleche() {
		return cantidadLeche;
	}
}
