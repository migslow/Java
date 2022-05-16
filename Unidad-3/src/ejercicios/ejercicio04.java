package ejercicios;

import java.util.Scanner;

public class ejercicio04 {

	static int maximo, minimo;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Introduce los 10 numeros por teclado: ");
			n[i] = s.nextInt();
		}
		maximo = maximo(n);
		minimo = minimo(n);
		imprimir(n);
	}

	public static int maximo(int[] n) {
		int maximo = n[0];
		for (int j = 1; j < n.length; j++) {
			if (n[j] > maximo) {
				maximo = n[j];
			}
		}
		return maximo;
	}

	public static int minimo(int[] n) {
		int minimo = n[0];
		for (int x = 1; x < n.length; x++) {
			if (n[x] < minimo) {
				minimo = n[x];
			}
		}
		return minimo;
	}

	public static void imprimir(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
			if (n[i] == maximo) {
				System.out.println(n[i] + " maximo");
			}
			if (n[i] == minimo) {
				System.out.println(n[i] + " minimo");
			}
		}
	}

}
