package pilas_y_colas;

import java.util.Stack;

public class PilaEjemplo {
	public static void main(String[] args) {
		Stack<String> pila=new Stack<>();
		
		//Agregar elementos a la pila
		pila.push("A");
		pila.push("B");
		pila.push("C");
		
		//Imprimir la pila
		System.out.println("Pila: "+pila);
		
		//Obtener el elemento superior de la pila
		String top=pila.peek();
		System.out.println("El elemento superior es: "+top);
		
		//Eliminar un elemento de la pila
		String eliminado=pila.pop();
		System.out.println("Elemento eliminado: "+eliminado);
		
		//Imprimir la pila actualizada
		System.out.println("Pila actualizada: "+pila);
	}

}
