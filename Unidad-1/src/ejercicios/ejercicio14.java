package ejercicios;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double euros;
		double pesetas = 166.3860;
		double calculo;

		System.out.println("Introduce la cantidad en euros: ");
		euros = s.nextDouble();

		calculo = euros * pesetas;
		System.out.println("La cantidad: " + euros + " en euros es " + calculo);

	}

}
