package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int z;
		int y;
		int x;

		System.out.println("Introduce la primera variable: ");
		z = s.nextInt();

		System.out.println("Introduce la segunda variable: ");
		x = s.nextInt();

		System.out.println("Datos inicales: " + z + " - " + x);
		y = z;
		z = x;
		x = y;
		System.out.println("Valores intercambiados: " + z + " - " + x);

	}

}
