package ejercicios;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double n1;
		System.out.println("Introduce un n�mero entero: ");
		n1 = s.nextDouble();
		double cuadrado;

		cuadrado = (double) Math.sqrt(n1);

		if (n1 % cuadrado == 0) {
			System.out.printf("La ra�z cuadrada de " + n1 + " es " + cuadrado);
		} else {
			System.out.println("");
		}

	}

}
