package pilas_y_colas;

import java.util.LinkedList;
import java.util.Queue;

public class ColaEjemplo {
	public static void main(String[] args) {
		Queue<String> cola=new LinkedList<>();
		
		//Agregar elementos a la cola
		cola.add("A");
		cola.add("B");
		cola.add("C");
		
		//Imprimir la cola
		System.out.println("Cola: "+cola);
		
		//Obtener el primer elemento de la cola
		String primero=cola.peek();
		System.out.println("El primer elemento es: "+primero);
		
		//Eliminar un elemento de la cola
		String eliminado=cola.remove();
		System.out.println("Elemento eliminado: "+eliminado);
		
		//Imprimir la cola actualizada
		System.out.println("Cola actualizada: "+cola);
	}

}
