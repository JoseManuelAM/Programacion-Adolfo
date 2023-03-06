package exceptions;

import java.util.*;

public class exception {

	public static void main(String[] args) {
	
		double primerNumero, segundoNumero, resultado;
	
		Scanner leer = new Scanner(System.in);
		
		try {
			System.out.print("Introduce el primer número: ");
			primerNumero = leer.nextDouble();
		
			System.out.print("Introduce el segundo número: ");
			segundoNumero = leer.nextDouble();
		
			resultado = primerNumero/segundoNumero;
		
			
		}

		catch(ArithmeticException e) {
			System.out.println("No se puede dividir entre cero");
		}
	
		catch(Exception ex) {
			System.out.println("Se ha producido un error");
		}

		finally {
			leer.close();
		}
	}

}
