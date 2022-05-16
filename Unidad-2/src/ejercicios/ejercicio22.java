package ejercicios;

import java.util.Scanner;

public class ejercicio22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double nota1, nota2, notaFinal;
		System.out.print("Introduzca la nota del primer examen: ");
		nota1 = s.nextDouble();
		System.out.print("¿Qué nota quiere sacar en el trimestre? ");
		notaFinal = s.nextDouble();

		nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;

		System.out.println("Para tener un " + notaFinal + " en el trimestre");
		System.out.println(" necesita sacar un " + nota2 + " en el segundo examen.");
	}
}