package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int caracter, digitos = 0, letraMax = 0, letraMin = 0;

		System.out.println("Introduce un caracter hasta que finalice con un *");
		caracter = s.nextLine().charAt(0);

		while (caracter != 42) {
			if (caracter >= 65 && caracter <= 90) {
				letraMax++;
			}
			if (caracter >= 97 && caracter <= 122) {
				letraMin++;
			}
			if (caracter >= 48 && caracter <= 57) {
				digitos++;
			}
			System.out.println("Introduce un caracter hasta que finalice con un *");
			caracter = s.nextLine().charAt(0);
		}
		System.out.println("El n�mero de d�gitos es: " + digitos);
		System.out.println("El n�mero de mayusculas es: " + letraMax);
		System.out.println("El n�mero de minusculas es: " + letraMin);
	}

}
