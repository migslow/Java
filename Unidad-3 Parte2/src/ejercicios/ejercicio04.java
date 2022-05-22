package ejercicios;

import java.util.LinkedList;

public class ejercicio04 {

	LinkedList<ejercicio03> lista = new LinkedList<ejercicio03>();

	public int tamanyo() {
		return lista.size();
	}

	public boolean agregarProducto(ejercicio03 p) {
		return lista.add(p);
	}

	public ejercicio03 buscarProducto(int posicion) {
		if (posicion < 1 || posicion > lista.size())
			return null;
		else
			return lista.get(posicion - 1);
	}

	public ejercicio03 buscarProductoCodigo(int codigo) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigo() == codigo)
				return lista.get(i);
		}
		return null;
	}

	public ejercicio03 borrarProductoCodigo(int codigo) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigo() == codigo)
				return lista.remove(i);
		}
		return null;
	}

	public boolean cambiarPrecio(int codigo, double nuevoPrecio) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigo() == codigo) {
				lista.get(i).setPrecio(nuevoPrecio);
				return true;
			}

		}
		return false;
	}
}
