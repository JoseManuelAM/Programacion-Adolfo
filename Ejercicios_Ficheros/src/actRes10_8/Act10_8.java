package actRes10_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Escribir un programa que duplique el contenido de un fichero cuyo nombre se pide al usuario. El fichero copia tendrá el mismo nombre con el prefijo <<copia_de_>>.
 */
public class Act10_8 {
	public static void main(String[] args) {
		System.out.println("Nombre del fichero: ");
		String fichOriginal=new Scanner(System.in).nextLine();
		String fichCopia="copia_de_"+fichOriginal;
		
		//Abrimos los ficheros para lectura y escritura en la misma sentencia del bloque try-catch-resources
		try(BufferedReader in=new BufferedReader(new FileReader(fichOriginal));
		BufferedWriter out=new BufferedReader(new FileWriter(fichCopia)) {
			int c=in.read(); //leemos del original
			while(c!=-1) { //mientras no lleguemos al final del fichero
				out.write(c); //escribimos en el fichero copia
				c=in.read(); //volvemos a leer
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
