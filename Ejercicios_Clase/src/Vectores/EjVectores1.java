package Vectores;
/*
 * Crear un vector de longitud 10 que se inicializará con números aleatorios comprendidos entre el 1 y el 100. Finalmente, se sumarán todos los aleatorios guardados en la tabla.
 */
public class EjVectores1 {

	public static void main(String[] args) {
		int valores[];
		valores = new int[10];
		
		
		for(int i=0; i<valores.length; i++) { //Recorremos el vector para insertar los valores aleatorios
			valores[i] = (int)(Math.random()*100+1);
		}
		int suma = 0; 
		for(int valor:valores) { //Iterator (es como una simplificación del for que hemos hecho anteriormente. Permite recorrer un vector completamente, ya que es un método que tiene ya establecido eso)
			suma +=valor;
		}	
		System.out.println("La suma total de los aleatorios es: "+suma);

	}          

}
