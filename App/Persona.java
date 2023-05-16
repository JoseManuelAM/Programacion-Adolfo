package App;

import java.util.ArrayList;

public class Persona implements Comprador{
	//atributos
	private String nombre;
	private String fechaNac;
	private int descuento;
	
	//constructor
	public Persona(String nombre, String fechaNac) {
		this.nombre=nombre;
		this.fechaNac=fechaNac;
	}
	//métodos
	public void comprar(Listacompra lista, ArrayList<Producto> productos) {
		double suma=0;
		double total;
		double descuentoAplicado;
		int id_producto;
		ArrayList<Integer>listaAux=lista.getLista();
		for(int i=0; i<listaAux.size(); i++) {
			id_producto=listaAux.get(i); //obtiene el valor en iésima posición de la lista
			suma=suma+productos.get(id_producto).getPrecio(); //productos.get(id_producto) es el objeto al que se accede para visualizar su precio
		}
		descuentoAplicado=suma*(getDescuento()/100);
		total=suma-descuentoAplicado;
		System.out.println("Su pedido total cuesta "+total+"€."+descuentoAplicado);
		if(descuentoAplicado>0) {
			System.out.println("Se le ha aplicado un descuento de "+descuentoAplicado+"€");
		}
	}

	//getters
	public String getNombre() {
		return nombre;
	}
	
	public String getFechanac() {
		return fechaNac;
	}
	
	public int getDescuento() {
		return descuento;
	}
	
	//setter para aplicar el descuento personalizado de cada subclase (Usuario VIP 2%, Empleado 5%)
	public void setDescuento(int descuento) {
		this.descuento=descuento;
	}
}
