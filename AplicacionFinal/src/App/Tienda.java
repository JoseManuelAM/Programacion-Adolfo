package App;

public class Tienda {
	private Producto[] almacen; //array que guarda los productos que están disponibles en el almacén de la tienda
	//constructor
	public Tienda() {
		almacen=new Producto[0]; //el array lo inicializo a 0 en el constructor
	}
	
	//métodos
	public void anadirProducto(Producto producto) {
		Producto[] nuevoAlmacen=new Producto[almacen.length+1]; //aumentamos en 1 la longitud del array cuando se utilice el método para agregar un nuevo producto
		for(int i=0; i<almacen.length; i++) { //copia los elementos al array creado 'nuevoAlmacen'
			nuevoAlmacen[i]=almacen[i];
		}
		nuevoAlmacen[almacen.length-1]=producto; //añade el producto nuevo en la última posición del array
		almacen=nuevoAlmacen; //asignar el almacen actual 'nuevoAlmacen'
	}
	
	public Producto buscarProducto(String nombre) {
		for(Producto producto:almacen) {
			if(producto.getNombre().equals(nombre)) { //si el nombre introducido por teclado es igual al nombre de algún producto, devuelve ese producto
				return producto;
			}
		}
	}
}
