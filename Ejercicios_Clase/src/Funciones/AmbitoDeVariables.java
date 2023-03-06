package Funciones;

public class AmbitoDeVariables {

	static int mostrarValor(int a) {
		int b = 4;
		
		System.out.println("A en función es = "+a);
		System.out.println("B en función es = "+b);
		System.err.println("C en función es ERROR");
		return b;
	}
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 5;
		System.out.println("A antes es = "+a);
		System.out.println("B antes es = "+b);
		a = mostrarValor(b);
		System.out.println("A después es = "+a);
		System.out.println("B después es = "+b);
	}

}
