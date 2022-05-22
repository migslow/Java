package ejercicios;

import java.util.LinkedList;

public class ejercicio01 {
	LinkedList<String> pila = new LinkedList<String>();

	public void apilarPalabra(String palabra) {
		pila.add(palabra);
	}

	public String desapilarPalabra() {
		return pila.remove();
	}

	public String obtenerPalabraCima() {
		return pila.getLast();
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
