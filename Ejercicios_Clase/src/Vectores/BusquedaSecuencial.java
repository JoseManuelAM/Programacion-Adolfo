package Vectores;

public class BusquedaSecuencial {

	public static void main(String[] args) {
		int indiceBusqueda = 0;
		
		while (indiceBusqueda<vector.length &&
				vector[indiceBusqueda]!=clave) {
			indiceBusqueda++;
		}

		if(indiceBusqueda<vector.length) {
			...//Clave se encuentra en la posición indiceBúsqueda
		} else {
			...//no encontrado
		}
	}

}

//Escribe la función int buscar(int vector[], int clave) para buscar de forma secuencial en el vector el valor de la clave.
//Si lo encuentra, me da la posición donde está.
//Si no lo encuentra, nos devuelve -1.