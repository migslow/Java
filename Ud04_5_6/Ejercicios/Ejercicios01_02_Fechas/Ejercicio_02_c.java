package Ejercicios01_02_Fechas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ejercicio_02_c {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.now();
		LocalTime hora = LocalTime.now();
		System.out.println("A�o: " + fecha.getYear());
		System.out.println("Dia: " + fecha.getDayOfMonth());
		System.out.println("Mes: " + fecha.getMonthValue());
		System.out.println("Horas: " + hora.getHour());
		System.out.println("Minutos: " + hora.getMinute());
		System.out.println("Segundos: " + hora.getSecond());

	}

}
