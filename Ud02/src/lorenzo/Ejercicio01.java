package lorenzo;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

	System.out.print("Introduce un n�mero entero: ");
	int x=s.nextInt();
	
	if (x % 2 == 0) {
		System.out.println("El n�mero " + x + " es par");
		} 
	else {
		System.out.println("El n�mero " + x + " es impar");
		}
	}
}
