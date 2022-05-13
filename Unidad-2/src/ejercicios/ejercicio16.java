package ejercicios;

import java.util.Scanner;

// Programa de numeros primos

public class ejercicio16 {

	public static void main(String[] args) {
		int numero = 1, contador;
		boolean primo;
		contador = 0;
	
		while (contador < 100) {
			primo = true;
			for (int i = 2; i <= numero / 2; i++) {
				if (numero % i == 0) {
					primo = false;
					break;
					
				}
			}
			if (primo) {
				System.out.print(numero + "\n");
				contador++;
			}
			numero++;
		}
	}

}
