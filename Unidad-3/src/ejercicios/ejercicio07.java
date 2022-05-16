package ejercicios;

import java.util.Scanner;

public class ejercicio07 {

	static int maximo;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Introduce 30 calificaciones: ");
			n[i] = s.nextInt();
		}
		maximo = maxima(n);
		System.out.println("\nEl numero de aprovados son: " + aprovados(n));
		System.out.println("El numero de suspendidos son: " + suspensos(n));
		System.out.println("La media es: : " + media(n));
		System.out.println("La nota maxima es: " + maxima(n));
	}

	public static double media(int[] n) {
		double suma = 0;
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + "  ");
			suma = suma + n[i];
		}
		return suma / n.length;
	}

	public static int aprovados(int[] n) {
		int contador = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 5) {
				contador++;
			}
		}
		return contador;
	}

	public static int suspensos(int[] n) {
		int contador = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] <= 5) {
				contador++;
			}
		}
		return contador;
	}

	public static int maxima(int[] n) {
		int maximo = n[0];
		for (int j = 1; j < n.length; j++) {
			if (n[j] > maximo) {
				maximo = n[j];
			}
		}
		return maximo;
	}

	public static int ceros(int[] n) {
		int contador = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 0) {
				contador++;
			}
		}
		return contador;
	}

}
