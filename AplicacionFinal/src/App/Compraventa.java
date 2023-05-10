package App;

public interface Compraventa { //esta interfaz sirve para todos los productos. Contiene dos métodos, inicialmente vacíos, que se implementarán para la compra y venta de productos
	void comprar(String nombre, int cantidad);
	void vender(String nombre, int cantidad);
}
