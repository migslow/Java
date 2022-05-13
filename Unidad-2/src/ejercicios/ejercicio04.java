package ejercicios;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1;
		double cuadrado;
		System.out.println("introduce un numero entero: ");
		n1 = s.nextInt();

		cuadrado = Math.sqrt(n1);
		System.out.println(cuadrado);

	}

}
