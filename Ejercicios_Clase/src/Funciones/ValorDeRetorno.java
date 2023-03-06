package Funciones;

public class ValorDeRetorno {

		static int sumar (int a, int b) {
		a = a+b;
		System.out.println("Dentro de la función a = "+a);
		return a;
	}
	
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		System.out.println("Antes de la función a = "+a);
		int res = sumar(a, b);
		System.out.println("Después de la función a = "+a);
		System.out.println("Resultado = "+res);
	}

}
