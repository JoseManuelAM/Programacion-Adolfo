package interfaces;

//Definir una interfaz con un método abstracto
interface Animal {
	void hacerSonido();
}

//Implementar la interfaz en una clase
class Perro implements Animal {
	public void hacerSonido() {
		System.out.println("Guau guau!");
	}
}

//Implementar la interfaz en otra clase
class Gato implements Animal {
	public void hacerSonido() {
		System.out.println("Miau miau!");
	}
}