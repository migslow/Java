package ejercicios;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double mb, kb;
		double calculo1, calculo2;
		System.out.println("Introduce la cantidad en mb para convertirlo a kb: ");
		mb = s.nextDouble();
		calculo1 = mb * 1000;
		System.out.println("El resultado de pasar megabytes a kilobytes es: " + calculo1);
		System.out.println("");
		System.out.println("Introduce la cantidad en kb para convertirlo a mb: ");
		kb = s.nextDouble();
		calculo2 = kb / 1000;
		System.out.println("El resultado de pasar kilobytes a megabytes es: " + calculo2);

	}

}
