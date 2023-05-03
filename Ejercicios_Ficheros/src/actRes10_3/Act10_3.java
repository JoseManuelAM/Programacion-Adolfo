package actRes10_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * Repetir la actividad 10.2 usando un flujo de texto con búfer.
 */
public class Act10_3 {
	public static void main(String[] args) {
		String texto="";
		BufferedReader in=null;
		try {
			in=new BufferedReader(new FileReader("C:\\Users\\aguilera.majos\\eclipse-workspace\\Ejercicios_Ficheros\\src\\actRes10_3\\HolaMundo.java"));
			String linea=in.readLine();
			while (linea!=null) { //mientras no llegue al final del archivo
				texto=texto+linea+'\n'; //el cambio de línea hay que insertarlo manualmente
				linea=in.readLine();
			}
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if(in!=null) {
				try {
					in.close();
				} catch(IOException ex) {
					System.out.println(ex);
				}
			}
		}
		System.out.println(texto);
	}

}
