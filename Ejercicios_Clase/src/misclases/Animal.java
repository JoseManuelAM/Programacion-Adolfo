package misclases;

public class Animal {

	public static void main(String[] args) {
		

	}
	//Atributos de la clase (Encapsulamiento)
	private String raza;
	private String nombre;
	private int edad;
	
	//Constructor con el mismo nombre de la clase
	public Animal(String nuevoNombre)
	{
		nombre = nuevoNombre; //Se le da un nombre al animal
	}
	
	//MÉTODOS DE LA CLASE
	
	//Método para obtener la edad del animal
	public int getEdad() 
	{
		return edad;
	}
	//Método para establecer la edad del animal
	public void setEdad(int nuevaEdad)
	{
		edad = nuevaEdad;
	}
	
	//Método para obtener el nombre del animal
	public String getNombre()
	{
		return nombre;
	}
	
	//Método para establecer la raza del animal
	public void setRaza(String nuevaRaza)
	{
		raza = nuevaRaza;
	}
	
	//Método para obtener la raza del animal
	public String getRaza()
	{
		return raza;
	}
	

}
