package ejercicios;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int segundos;
		int minutos = 0;
		int horas = 0;

		System.out.println("Introduce el tiempo trascurrido: ");
		segundos = s.nextInt();

		minutos = segundos / 60;
		horas = minutos / 60;

		System.out.println("Timepo en minutos: " + minutos);
		System.out.println("Tiempo en horas: " + horas);

	}

}
