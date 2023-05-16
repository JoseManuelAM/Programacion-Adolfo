package App;

public class UsuarioVIP extends Persona {
	//constructor
	public UsuarioVIP(String nombre, String fechaNac) {
	super(nombre, fechaNac);
	this.setDescuento(2);
	}
}
