package Vectores;
/*
 * Escribe la función int buscar(int vector[], int clave) para buscar de forma secuencial en el vector el valor de la clave.
 * Si lo encuentra, me da la posición donde está.
 * Si no lo encuentra, nos devuelve -1.
*/
public class BusquedaSecuencial {
	
	public static int buscar(int vector[], int clave) { //Busca de forma secuencial el valor de la clave
		int indiceBusqueda = 0;
		while(indiceBusqueda<vector.length && vector[indiceBusqueda]!=clave) {
			indiceBusqueda++;
		}
		for(i=0; i<vector.length; i++) {
			if(vector[i] = clave) {
				return i;
			}
		} else {
			return -1;
		}
		if(indiceBusqueda<vector.length) {
			indiceBusqueda = clave;
		}else {
			return -1
		}
	}
	
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
