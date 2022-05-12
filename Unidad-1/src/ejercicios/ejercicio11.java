package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1;
		System.out.println("Introduce un numero entero: ");
		n1 = s.nextInt();

		if (n1 % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
