package ejercicio01;

import java.time.LocalDate;
import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca el dia: ");
		int d = s.nextInt();
		System.out.println("Introduzca el mes: ");
		int m = s.nextInt();
		System.out.println("Introduzca el ańo: ");
		int a = s.nextInt();

		LocalDate fecha = LocalDate.of(a, m, d);

		System.out.println(fecha.getDayOfWeek());

	}

}
