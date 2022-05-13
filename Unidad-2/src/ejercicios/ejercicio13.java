package ejercicios;

import java.util.Scanner;

// Programa que calcula la potencia de un numero. El numero es pedido por teclado al usuario.

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero1, numero2;
		double calculo;
		System.out.println("Introduce dos numeros enteros: ");
		numero1 = s.nextInt();
		numero2 = s.nextInt();
		
		calculo = Math.pow(numero1, numero2);
		System.out.println("El " + numero1 + " elevado a la potencia " + numero2 + " es: " + calculo);
	}

}
