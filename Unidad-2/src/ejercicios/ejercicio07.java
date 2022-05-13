package ejercicios;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		int suma = 0;
		System.out.println("introduce el numero entero: ");
		n = s.nextInt();

		for (int i = 1; i < n; i++) {
			suma = suma + n;
		}
		System.out.println("La suma es: " + suma);

	}

}
