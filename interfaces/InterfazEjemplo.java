package interfaces;

public class InterfazEjemplo {
	public static void main(String[] args) {
		Animal perro=new Perro();
		Animal gato=new Gato();
		
		//Llamar al método hacerSonido de las
		perro.hacerSonido(); //Output: Guau guau!
		gato.hacerSonido(); //Output: Miau miau!
	}

}
