package ejercicios;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduce dos numeros enteros: ");
		n1 = s.nextInt();
		n2 = s.nextInt();

		if (n1 > n2) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}

	}

}
