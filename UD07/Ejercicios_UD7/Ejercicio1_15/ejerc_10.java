package Ejercicio1_15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ejerc_10 {

	private static void copia(String n) {
	try {
		
		FileInputStream origen= new FileInputStream(n);
		FileOutputStream destino= new FileOutputStream("Ficheros/copia_de_fichero2.txt");
		
		int caracterLeido;
		

		while((caracterLeido = origen.read())!= -1)
			
			destino.write(caracterLeido);
			
		origen.close(); destino.close();
	} catch (IOException io) {
		System.out.println("ERROR");
	}	
		
	}
	
	public static void main(String[] args) {
	
		String n="Ficheros/fichero2.txt";
	 copia(n);

	}

}
