package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		int numero, suma = 0, contador = 0, minimo, maximo;
		Scanner s = new Scanner(System.in);
		System.out.println("Por favor, vaya introduciendo n�meros y pulsando INTRO.");
		System.out.println("Para terminar, introduzca un numero negativo.");
		numero = s.nextInt();
		minimo=numero;
		maximo=numero;
		if (numero <0) {
			System.out.println("No hay n�meros de entrada");
			System.exit(0);
		}
		while (numero >= 0) {
			contador++; //contador=contador+1 o tambi�n ++contador
			suma=suma+numero;
			if (numero > maximo)
				maximo=numero;
			if (numero < minimo)
				minimo=numero;
			
			
			System.out.println("siguiente numero-> ");
			numero = s.nextInt();

		} // while
		System.out.println("FIN");
		System.out.println("La media vale "+ (double) suma/contador);
		System.out.println("El m�nimo es "+ minimo);
		System.out.println("El m�ximo es  "+ maximo);

	}// main

}
