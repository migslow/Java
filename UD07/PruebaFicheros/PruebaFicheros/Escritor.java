package PruebaFicheros;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("FicherosPruebaFicheros/fichero2.txt");
//		FileWriter fw = new FileWriter("Ficheros\\fichero2.txt"); //otra opci�n
		
		fw.write('1');
		fw.write('\n');
		fw.write(65);
		fw.write('\n');
		fw.write("Esto es una cadena que va en la tercera l�nea");
		fw.write('\n');
		fw.write("esto es un array de caracteres".toCharArray());	
		
		fw.close();

	}

}
