package p3T_Actividad4;

public class Herviboro extends Animal { //hereda de Animal
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
	
	@Override
	public void comer() { //añado al método comer de Animal lo que está comiendo el hervíboro
		super.comer(); //SUPER sirve llamar al método de la superclase (Animal)
		System.out.println("Está comiendo "+hierbaFavorita);
	}
	
	//getters
	public String getHierbafavorita() {
		return hierbaFavorita;
	}
}
