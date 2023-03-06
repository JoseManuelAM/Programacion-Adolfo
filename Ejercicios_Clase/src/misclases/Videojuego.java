package misclases;

public class Videojuego {

	public static void main(String[] args) {


	}
	//Atributos de la clase
	private String titulo;
	private String categoria;
	private int lanzamiento;
	private String plataforma;
	
	//Constructor con el mismo nombre de la clase
	public Videojuego(String nuevotitulo)
	{
		titulo = nuevotitulo; //Se le da un título al videojuego
	}
	
	//MÉTODOS DE LA CLASE
	
	public String getTitulo()
	{
		return titulo;
	}
	
	public String getCategoria()
	{
		return categoria;
	}
	
	
	public void setCategoria(String nuevacategoria)
	{
		categoria = nuevacategoria;
	}
	
	
	public int getLanzamiento()
	{
		return lanzamiento;
	}
	
	public void setLanzamiento(int nuevolanzamiento)
	{
		lanzamiento = nuevolanzamiento;
	}
	
	
	public String getPlataforma()
	{
		return plataforma;
	}
	
	public void setPlataforma(String nuevaplataforma)
	{
		plataforma = nuevaplataforma;
	}
	
}
