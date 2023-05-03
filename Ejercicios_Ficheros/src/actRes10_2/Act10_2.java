package actRes10_2;

import java.io.FileReader;
import java.io.IOException;

/*
 * Leer el archivo de texto de un proyecto y mostrarlo por pantalla.
 */
public class Act10_2 {
	public static void main(String[] args) {
		String texto="";
		FileReader in=null; //la declaramos fuera de la estructura try-catch para que sea accesible también desde fuera
		try {
			in=new FileReader("C:\\Users\\aguilera.majos\\eclipse-workspace\\Ejercicios_Ficheros\\src\\actRes10_3\\HolaMundo.java");
			int c=in.read();
			while(c!=-1) { //mientras no lleguemos al final del archivo
				texto=texto+(char) c; //convertimos c a char
				c=in.read();
			}
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		} finally { //en todo caso cerramos el flujo
			if(in!=null) { //si el flujo está abierto
				try {
					in.close(); //cerramos el flujo
				} catch(IOException ex) {
					System.out.println(ex);
				}
			}
		}
		System.out.println(texto); //mostramos el texto leído
	}

}
