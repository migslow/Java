package exa;

import java.util.Scanner;

public class HojaCalculo {

	public static void main(String args[]) {
		int filas, columnas;
		int[][] matriz;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce n�mero de filas (>=1)");
		filas = s.nextInt();
		System.out.println("Introduce n�mero de columnas (>1)");
		columnas = s.nextInt();
		matriz = new int[filas][columnas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println(matriz[filas][columnas]);
			}
		}
	}
}
