package ejercicio01;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca el dia: ");
		int d = s.nextInt();
		System.out.println("Introduzca el mes: ");
		int m = s.nextInt();
		System.out.println("Introduzca el ańo: ");
		int a = s.nextInt();
		GregorianCalendar fecha = new GregorianCalendar();
		fecha.set(Calendar.DAY_OF_MONTH, d);
		fecha.set(Calendar.MONTH, m - 1);
		fecha.set(Calendar.YEAR, a);

		if (fecha.get(Calendar.DAY_OF_WEEK) == 1)
			System.out.println("Lunes");
		if (fecha.get(Calendar.DAY_OF_WEEK) == 2)
			System.out.println("Martes");
		if (fecha.get(Calendar.DAY_OF_WEEK) == 3)
			System.out.println("Miercoles");
		if (fecha.get(Calendar.DAY_OF_WEEK) == 4)
			System.out.println("Jueves");
		if (fecha.get(Calendar.DAY_OF_WEEK) == 5)
			System.out.println("Viernes");
		if (fecha.get(Calendar.DAY_OF_WEEK) == 6)
			System.out.println("Sabado");
		if (fecha.get(Calendar.DAY_OF_WEEK) == 7)
			System.out.println("Domingo");

	}

}
