package Funciones;

public class PasosPorParametro {

	static void sumar (int a, int b) {
		a = a+b;
		System.out.println("Dentro de la función a = "+a);
	}
	
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		System.out.println("Antes de la función a = "+a);
		sumar(a, b);
		System.out.println("Después de la función a = "+a);

	}

}
