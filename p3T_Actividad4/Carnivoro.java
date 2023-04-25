package p3T_Actividad4;

public class Carnivoro extends Animal { //hereda de Animal
	protected String presaFavorita;
	
	//constructor
		public Carnivoro(String nombre, int edad, String especie, String habitat, String presaFavorita) {
			super(nombre, edad, especie, habitat);
			this.presaFavorita=presaFavorita;
		}
		
		//métodos
		public void cazarAnimal() {
			System.out.println("Cazando "+presaFavorita+"...");
			System.out.println(presaFavorita+" murió a manos de "+nombre);
		}
		
		//getters
		public String getPresafavorita() {
			return presaFavorita;
		}
}
