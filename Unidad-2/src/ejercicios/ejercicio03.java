package ejercicios;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1, n2;
		double cuadrado;
		System.out.println("Introduce dos numeros enteros: ");
		n1 = s.nextInt();
		n2 = s.nextInt();

		cuadrado = Math.sqrt(n1);

		if (n1 % cuadrado == 0) {
			System.out.println("El numero es multiplo del otro");
		} else {
			System.out.println("El numero no es multiplo del otro");
		}

	}

}
