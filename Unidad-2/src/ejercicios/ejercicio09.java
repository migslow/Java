package ejercicios;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n;
		System.out.println("Introduce un numero entero: ");
		n = s.nextInt();

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}

	}

}
