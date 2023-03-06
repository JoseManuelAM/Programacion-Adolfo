package Vectores;

public class BuclesVectores {

	public static void main(String[] args) {
		
		int [] vec = {1,7,3,4,5,6};

	       //Tamaño del vector
	       int tam = vec.length;

	       //Uso el bucle for para recorrer el array
	       for (int i=0; i<tam; i++) {
	           System.out.println("[" +i+ "] = "+ vec[i]);
		}

	}

}
