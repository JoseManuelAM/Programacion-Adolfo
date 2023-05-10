package aplicacion;

public class Carnivoro extends Animal { //HEREDA de Animal
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
		
		@Override //también lo sobreescribo para Carnivoro
		public void comer() { //añado al método comer de Animal lo que está comiendo el carnívoro
			super.comer(); //SUPER sirve para llamar al método de la superclase (Animal)
			System.out.println("Está comiendo "+presaFavorita);
		}
		
		//getters
		public String getPresafavorita() {
			return presaFavorita;
		}
}
