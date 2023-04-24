package p3T_Actividad4;

public class Vaca extends Herviboro { //hereda de Herviboro
	private int cantidadLeche;
	 
	//constructor
	public Vaca(String nombre, int edad, String especie, String habitat, String hierbaFavorita, int cantidadLeche) {
		super(hierbaFavorita);
		this.cantidadLeche=cantidadLeche;
		}
}
