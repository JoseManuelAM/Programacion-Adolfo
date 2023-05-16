package App;

public class Usuario extends Persona {
	//constructor
	public Usuario(String nombre, String fechaNac) {
		super(nombre, fechaNac); //hace referencia al constructor de la superclase Persona
		setDescuento(0);
	}
	
	
}
