package p3T_Actividad4;

public class Carnivoro extends Animal { //hereda de Animal
	protected String presaFavorita;
	
	//constructor
		public Carnivoro(String nombre, int edad, String especie, String habitat, String presaFavorita) {
			super(nombre, edad, especie, habitat); //referencia al constructor de la superclase (Animal)
			this.presaFavorita=presaFavorita;
		}
		
		//métodos
		public void cazarAnimal() {
			System.out.println("Cazando "+presaFavorita+"...");
			System.out.println(presaFavorita+" murió a manos de "+nombre);
		}
		
		@Override
		public void comer() { //añado al método comer de Animal lo que está comiendo el carnívoro
			super.comer(); //SUPER sirve para llamar al método de la superclase (Animal)
			System.out.print("Está comiendo "+presaFavorita);
		}
		
		//getters
		public String getPresafavorita() {
			return presaFavorita;
		}
}
