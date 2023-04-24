package p3T_Actividad4;

public class Herviboro extends Animal { //hereda de Animal
	protected String hierbaFavorita;
	
	//constructor
	public Herviboro(String nombre, int edad, String especie, String habitat, String hierbaFavorita) {
		super(nombre, edad, especie, habitat); //referencia a la superclase (Animal) y cogemos sus atributos
		this.hierbaFavorita=hierbaFavorita;
	}
	
	//getters
	public String getHierbafavorita() {
		return hierbaFavorita;
	}
	//los getters de los otros atributos (los de animal) también los hereda, por lo que ya estarían declarados
}
