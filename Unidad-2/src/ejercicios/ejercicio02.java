package ejercicios;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Introduce tres numeros enteros: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();

		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("El mayor es: " + n1);
			} else {
				System.out.println("el mayor es: " + n3);
			}
		} else if (n2 > n3) {
			System.out.println("el mayor es: " + n2);
		} else {
			System.out.println("el mayor es: " + n3);
		}
	}
}
