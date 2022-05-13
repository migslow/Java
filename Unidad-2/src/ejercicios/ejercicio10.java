package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, maximo, minimo, media;
		double suma = 0;
		int contador = 0;

		System.out.println("Introduce un numero entero: ");
		n = s.nextInt();
		maximo = n;
		minimo = n;
		while (n < 0) {
			suma = suma + n;
			contador++;
		}
		if (minimo < n) {
			minimo = n;
		}
		if (maximo > n) {
			maximo = n;
		}
		System.out.println("Introduce otro numero entero: ");
		n = s.nextInt();

		if (contador != 0) {
			System.out.println("La media es: " + suma / contador);
			System.out.println("El maximo es: " + maximo);
			System.out.println("El minimo es: " + minimo);
		} else {
			System.out.println("El numero que has introducido es negativo");
		}
	}

}
