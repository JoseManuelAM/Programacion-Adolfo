package actProp10_1;
/*
 * Crea un fichero de texto con un editor e implementa un programa que lo abra y lo lea, mostrando su contenido por pantalla.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act10_1 {
	public static void main(String[] args) {
		String texto="";
		BufferedReader in=null;
		try {
			in=new BufferedReader(new FileReader("C:\\Users\\aguilera.majos\\Fichero.txt"));
			String linea=in.readLine();
			while (linea!=null) {
				texto=texto+linea+'\n';
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

	}

}
