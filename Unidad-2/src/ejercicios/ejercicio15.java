package ejercicios;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un n�mero entero: ");
		int numero = s.nextInt();
		int contador = 0;

		for (int i = 1; i <= numero; i++) {
			if ((numero % i) == 0) {
				contador++;
			}
		}

		if (contador == 2) {
			System.out.println("El numero " + numero + " es primo");
		} else {
			System.out.println("El numero " + numero + " no es primo");
		}

	}

}
