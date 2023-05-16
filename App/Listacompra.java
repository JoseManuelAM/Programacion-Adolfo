package App;

import java.util.ArrayList;

public class Listacompra {
	private ArrayList<Integer> lista=new ArrayList<>();
	
	
	public void anadirProducto(int producto, int numeroProductos) {
			for(int i=0; i<numeroProductos; i++) {
				lista.add(new Integer(producto));
			}
			System.out.println("Se ha actualizado la lista de compra correctamente.");
		}
	
	public void eliminarProducto(int producto, int numeroProductos) {
		try { //maneja el posible error de que el producto introducido no exista en el ArrayList lista que contiene los productos que el usuario ha añadido
			for(int i=0; i<numeroProductos; i++) {
				lista.remove(new Integer(producto));//elimina el producto introducido por parámetro el número de veces que el usuario introduce, también por parámetro a la función
				
			}
			System.out.println("Se ha actualizado la lista de la compra correctamente.");
		} catch(IndexOutOfBoundsException e) { //en caso de que no encuentre el producto que se ha introducido, salta el error
			System.out.println("El producto que se ha intentado eliminar no existe.");
		}
	}
	
	public void listar() {
		System.out.println("Productos en la lista:");
		for(Integer producto:lista) { //FOR-EACH que recorre la lista de la compra (productos que el usuario ha añadido a ella) e imprime los valores
			System.out.println(producto);
		}
	}
	
	public ArrayList<Integer> getLista(){
		return lista;
	}
	/*anadirProducto(id producto, numero productos); 
	eliminarProducto(id producto, numero productos);
	 //imprimir lista de enteros*/
	
	//mirar método remove para eliminar, meter el remove en un try-catch IndexOutOfBoundsException
}
