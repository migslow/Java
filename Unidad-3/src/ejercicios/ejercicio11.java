package ejercicios;

import java.util.Scanner;

public class ejercicio11 {
	public static int par;
	public static int impar;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[8];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Introduce 8 numeros enteros: ");
			n[i] = s.nextInt();
		}
		par = comproblarPar(n);
		impar = comproblarImpar(n);
		imprimir(n);
	}

	public static int comproblarPar(int[] n) {
		int par = n[0];
		for (int i = 2; i < n.length; i++) {
			if (n[i] % i == 0) {
				n[i] = par;
			}
		}
		return par;
	}

	public static int comproblarImpar(int[] n) {
		int impar = n[0];
		for (int i = 2; i < n.length; i++) {
			if (n[i] % i == 2) {
				n[i] = impar;
			}
		}
		return impar;
	}

	public static void imprimir(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
			if (n[i] == par) {
				System.out.println(n[i] + " par");
			}
			if (n[i] == impar) {
				System.out.println(n[i] + " impar");
			}
		}
	}

}
