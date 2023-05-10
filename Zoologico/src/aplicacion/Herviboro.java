package aplicacion;

public class Herviboro extends Animal { //HEREDA de Animal
	protected String hierbaFavorita;
	
	//constructor
	public Herviboro(String nombre, int edad, String especie, String habitat, String hierbaFavorita) {
		super(nombre, edad, especie, habitat); //SUPER() referencia al constructor de la superclase (Animal)
		this.hierbaFavorita=hierbaFavorita;
	}
	
	//métodos
	public void buscarHierba() {
		System.out.println("Buscando "+hierbaFavorita+" en los alrededores.");
	}
	
	@Override //sobreescribe el método comer para Hervíboro
	public void comer() { //añado al método comer de Animal lo que está comiendo el hervíboro
		super.comer(); //SUPER llama al método de la superclase (Animal)
		System.out.println("Está comiendo "+hierbaFavorita);
	}
	
	//getters
	public String getHierbafavorita() {
		return hierbaFavorita;
	}
}
