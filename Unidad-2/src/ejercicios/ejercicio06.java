package ejercicios;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double n1 = 0.15;
		double n2 = 0.20;
		double n3 = 0.35;
		double n4 = 0.80;

		double pago = 0, metros;
		double calculo;
		System.out.println("Introduce los metros cubicos: ");
		metros = s.nextInt();

		if (metros <= 100) {
			pago = metros * n1;
		} else if (metros >= 100 && metros <= 500) {
			pago = 0.15 * 100 + (metros - 100) * n2;
		} else if (metros > 500 && metros <= 1000) {
			pago = 0.15 * 100 + 400 * 0.2 + (metros - 500) * n3;
		} else if (metros > 1000) {
			pago = 0.15 * 100 + 400 * 0.2 + 500 * 0.35 + (metros - 1000) * n4;
		}
		System.out.println("Total a pagar: " + pago);
	}

}
