package ejercicios;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char caracter;
		System.out.println("Introduce un caracter alfanumerico: ");
		caracter = s.next().charAt(0);

		if (Character.isDigit(caracter)) {
			System.out.println("Es un digito");
		} else {
			System.out.println("No es un digito");
		}
		if (Character.isLetter(caracter)) {
			System.out.println("Es una letra");
		} else {
			System.out.println("No es una letra");
		}
		if (Character.isUpperCase(caracter)) {
			System.out.println("Es una mayuscula");
		} else {
			System.out.println("No es una mayuscula");
		}
	}

}
