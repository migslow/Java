package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double euros = 0.96;
		double dollars;
		double calculo;

		System.out.println("Introduce la cantidad en dolares a conversar: ");
		dollars = s.nextDouble();

		calculo = dollars * euros;
		System.out.println("La cantidad: " + dollars + " en dollares es " + calculo);
	}

}
