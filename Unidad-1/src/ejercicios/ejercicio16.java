package ejercicios;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cantidad;
		double base = 1.21;
		int iva = 21;
		double calculo1;
		double calculo2;

		System.out.println("Introduce la cantidad del producto: ");
		cantidad = s.nextInt();

		calculo1 = cantidad / base;
		System.out.println("El resultado de la cantidad con la base imponible es: " + calculo1);

		calculo2 = calculo1 * base;
		System.out.println("El resultado de la cantidad con el IVA es: " + calculo2);

	}

}
