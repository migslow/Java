package ejercicios;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = 0, factorial = 1;
		System.out.println("Introduce un numero entero: ");
		numero = s.nextInt();

		if (numero < 0) {
			System.out.println("No has introducido un numero entero");
		} else {
			while (numero != 0) {
				factorial = factorial * numero;
				--numero;
			}
			System.out.println("El facotrial es: " + factorial);
		}

	}

}
