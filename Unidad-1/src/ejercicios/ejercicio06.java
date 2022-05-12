package ejercicios;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double f;
		double cel;
		System.out.print("cuantos grados: ");
		f = s.nextDouble();

		cel = ((f - 32) / 1.8);

		System.out.println("La conversion es: " + cel);

	}

}
