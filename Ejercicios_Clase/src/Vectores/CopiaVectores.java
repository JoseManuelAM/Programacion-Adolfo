package Vectores;

public class CopiaVectores {

	public static void main(String[] args) {
		int[]arrayFuente = {2,3,1,5,10};
		int[]arrayDestino = new int[arrayFuente.length];
		
		for(int i=0; i<arrayFuente.length; i++) { //Recorremos el array
			arrayDestino[i] = arrayFuente[i]; //Copiamos el valor de arrayFuente a la copia
			
			//Imprimimos ambos valores
			System.out.println(arrayFuente[i]+" Original");
			System.out.println(arrayDestino[i]+" Copia\n");
		}

	}

}

//definir, definir inverso, definirlo en base a un tamaño, hacer una copia