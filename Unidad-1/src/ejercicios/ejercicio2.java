package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double pi = 3.14;
		int radio;
		double area;

		System.out.println("Introduce el radio: ");
		radio = s.nextInt();

		area = pi * radio * 2;

		System.out.println("El area del circulo es: " + area);

	}

}
