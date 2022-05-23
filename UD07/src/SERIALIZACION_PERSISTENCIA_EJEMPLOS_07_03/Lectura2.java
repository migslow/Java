package SERIALIZACION_PERSISTENCIA_EJEMPLOS_07_03;

import java.io.EOFException;

//Clase principal

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lectura2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream entrada = null;
		Persona p;

		try {

			fis = new FileInputStream("Ficheros/personas.dat");
			entrada = new ObjectInputStream(fis);
			
			p = (Persona) entrada.readObject(); // es necesario el casting
			while (true) {
				System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());
				p = (Persona) entrada.readObject();
			}
		}catch (EOFException e) {
			System.out.println("-- FINAL DE FICHERO --");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (entrada != null) {
					entrada.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}