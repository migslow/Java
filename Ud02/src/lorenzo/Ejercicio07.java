package lorenzo;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un n�mero entero mayor que 0: ");
		int n = s.nextInt(), i, suma = 0;

		if (n <= 0) {
			System.out.println("El n�mero introducido no es v�lido");
		} else {
			for (i = 1; i <= n; i++) {
				suma = suma + i;
			}

			System.out.println("La suma de todos los n�meros hasta llegar a " + n + " (incluy�ndolo), es " + suma);
		}

	}

}
