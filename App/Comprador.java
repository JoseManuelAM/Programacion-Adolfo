package App;

import java.util.ArrayList;

public interface Comprador {
	void comprar(Listacompra lista, ArrayList<Producto> productos);  //si es usuarioVIP descuento del 2%, si es empleado del 5%	
}
