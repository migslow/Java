package ejercicios;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double longitud, anchura, calculo;

		System.out.println("Introduce la longitud: ");
		longitud = s.nextDouble();

		System.out.println("Introduce la anchura: ");
		anchura = s.nextDouble();
		
		calculo = longitud * anchura;
		System.out.printf("%.4f%s", calculo, " m2");

	}

}
