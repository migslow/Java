package ejercicios;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[10];
		System.out.println("Introduce los elementos: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce el " + i + ": ");
			n[i] = s.nextInt();
		}
		for (int i = 9; i >= 0; i--) {
			System.out.println("Los numeros al reves son: " + n[i]);
		}

	}

}
