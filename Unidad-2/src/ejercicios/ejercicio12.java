package ejercicios;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Escriba un n�mero real y un entero: ");
		double x = s.nextDouble();
		int y = s.nextInt();
		long result = 1;
		while (y != 0) {
			result *= x;
			--y;
		}
		System.out.println("La potencia es: " + result);
	}

}
