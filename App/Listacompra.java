package App;

import java.util.ArrayList;

public class Listacompra {
	private ArrayList<Integer> lista=new ArrayList<>();
	
	
	public void anadirProducto(int producto, int numeroProductos) {
			for(int i=0; i<numeroProductos; i++) {
				lista.add(new Integer(producto));
			}
			System.out.println("Se ha actualizado la lista de compra.");
		}
	
	public void eliminarProducto(int producto, int numeroProductos) {
		try {
			for(int i=0; i<numeroProductos; i++) {
				lista.remove(new Integer(producto));//elimina n veces el producto escogido
				
			}
			System.out.println("Se ha actualizado la lista de la compra.");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("El producto que se ha intentado eliminar no existe.");
		}
	}
	
	public void listar() {
		System.out.println("Productos en la lista:");
		for(int producto:lista) { //for-each
			System.out.println(producto);
		}
	}
	/*anadirProducto(id producto, numero productos); //implementar try and catch en estos dos métodos
	eliminarProducto(id producto, numero productos);
	 //imprimir lista de enteros*/
	
	//mirar método remove para eliminar, meter el remove en un try-catch IndexOutOfBoundsException
}
