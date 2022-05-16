package ejercicios;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int base, altura;
		int calculo1, calculo2;
		System.out.println("Introduce la base y la altura del rectangulo: ");
		base = s.nextInt();
		altura = s.nextInt();
		calculo1 = base * altura;
		System.out.println("El resultado es: " + calculo1);

		/*--------------------------------------------------------------------------------------- */

		System.out.println("Introduce la base y la altura del triangulo: ");
		base = s.nextInt();
		altura = s.nextInt();
		calculo2 = base * altura / 2;
		System.out.println("El resultado es: " + calculo2);

	}

}
