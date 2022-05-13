package ejercicios;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double euros = 1.04;
		double pesetas;
		double calculo;

		System.out.println("Introduce la cantidad en pesetas: ");
		pesetas = s.nextDouble();

		calculo = (pesetas * 1.66) / 1;

		System.out.println("La cantidad es: " + calculo + "eur");

	}
}
