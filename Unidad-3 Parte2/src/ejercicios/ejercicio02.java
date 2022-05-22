package ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;

public class ejercicio02 {
	ArrayList<String> pila = new ArrayList<String>();

	public void apilarPalabra(String palabra) {
		pila.add(palabra);
	}

	public String desapilarPalabra() {
		return pila.remove(pila.size() - 1);
	}

	public String obtenerPalabraCima() {
		return pila.get(pila.size() - 1);
	}

	public boolean pilaPalabraVacia() {
		return pila.isEmpty();
	}

	public String imprimir() {
		String cadena = "";
		for (int i = 0; i < pila.size(); i++) {
			cadena = cadena + pila.get(i) + "\n";
		}
		return cadena;
	}
}
