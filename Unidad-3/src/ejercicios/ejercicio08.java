package ejercicios;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[8];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Introduce el numero binario en bits (1 o 0): ");
			n[i] = s.nextInt();
		}
		contar(n);

	}

	public static void contar(int[] n) {
		int suma = 0;
		for (int i = 0; i < n.length; i++) {
			if ((n[i] == 1 || n[i] == 0)) {
				if (n[0] == 1) {
					suma = suma + 128;
				} else if (n[0] == 0) {
					suma = suma + 0;
				}
				if (n[1] == 1) {
					suma = suma + 64;
				} else if (n[1] == 0) {
					suma = suma + 0;
				}
				if (n[2] == 1) {
					suma = suma + 32;
				} else if (n[2] == 0) {
					suma = suma + 0;
				}
				if (n[3] == 1) {
					suma = suma + 16;
				} else if (n[3] == 0) {
					suma = suma + 0;
				}
				if (n[4] == 1) {
					suma = suma + 8;
				} else if (n[4] == 0) {
					suma = suma + 0;
				}
				if (n[5] == 1) {
					suma = suma + 4;
				} else if (n[5] == 0) {
					suma = suma + 0;
				}
				if (n[6] == 1) {
					suma = suma + 2;
				} else if (n[6] == 0) {
					suma = suma + 0;
				}
				if (n[7] == 1) {
					suma = suma + 1;
				} else if (n[7] == 0) {
					suma = suma + 0;
				} else {
					System.out.println("No es un numero binario (1 o 0)");
					System.exit(0);
				}
				System.out.println(suma);

			}
		}
	}

}
