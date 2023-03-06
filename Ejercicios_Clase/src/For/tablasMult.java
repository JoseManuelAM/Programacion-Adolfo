package For;

public class tablasMult {

	public static void main(String[] args) {
		
		int res;
		
		for(int i=1; i<11; i++) { 						//la 'i' muestra el número de la tabla
			System.out.println();
			System.out.println("Tabla del "+i);			 //número de las tablas
			for(int j=0; j<11; j++) { 					//la 'j' muestra el número por el que se multiplica cada número de la tabla
				res = i*j; 								//almacenamos el resultado de la operación
				System.out.println(i+"x"+j+" = "+res); //imprimimos por pantalla cada parte de la tabla
			}
		}
	}

}
