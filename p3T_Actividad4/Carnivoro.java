package p3T_Actividad4;

public class Carnivoro extends Animal { //hereda de Animal
	protected String presaFavorita;
	
	//constructor
		public Carnivoro(String nombre, int edad, String especie, String habitat, String presaFavorita) {
			super(nombre, edad, especie, habitat);
			this.presaFavorita=presaFavorita;
		}
		
		//getters
		public String getPresafavorita() {
			return presaFavorita;
		}
		//los getters de los otros atributos (los de animal) también los hereda, por lo que ya estarían declarados
}
