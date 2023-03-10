package repasot1;

public class Pelicula {

	public static void main(String[] args) {

	}
	//Atributos de la clase
	private String titulo;
	private String director;
	private String genero;
	private int estreno;
	private int duracion;
	
	//Constructor con el mismo nombre de la clase
	public Pelicula(String titulo)
	{
		this.titulo = titulo; //'this' hace referencia a un atributo en la clase actual, y lo podemos usar en lugar de 'nombreAtributo = nuevonombreAtributo'
	}
	
	//MÉTODOS DE LA CLASE
	
	public String getTitulo()
	{
		return titulo;
	}
	
	
	public void setDirector(String director)
	{
		this.director = director;
	}
	
	public String getDirector()
	{
		return director;
	}
	
	
	public void setGenero(String genero)
	{
		this.genero = genero;
	}
	
	public String getGenero()
	{
		return genero;
	}
	
	
	public void setEstreno(int estreno)
	{
		this.estreno = estreno;
	}
	
	public int getEstreno()
	{
		return estreno;
	}
	
	
	public void setDuracion(int duracion) 
	{
		this.duracion = duracion;
	}
	
	public int getDuracion()
	{
		return duracion;
	}
	
}