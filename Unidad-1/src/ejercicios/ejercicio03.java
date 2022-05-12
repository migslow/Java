package ejercicios;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double euros;
		double dollars = 1.04;
		double calculo;

		System.out.println("Introduce la cantidad en euros a conversar: ");
		euros = s.nextDouble();

		calculo = euros * dollars;
		System.out.println("La cantidad: " + euros + " en dollares es " + calculo);

	}

}
