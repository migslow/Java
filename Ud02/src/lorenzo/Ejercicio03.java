package lorenzo;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

	int x, y;
	
	System.out.print("Introduce dos n�meros enteros distintos: ");
	x = s.nextInt(); 
	y = s.nextInt();
	
	if (x % y == 0) {
		System.out.println("El n�mero " + x + " es m�ltiplo de " + y);
		}
		
	if (y % x == 0) {
		System.out.println("El n�mero " + y + " es m�ltiplo de " + x);
		}
		
	if ((x % y != 0) && (y % x != 0)) {
		System.out.println("Los n�meros no son m�ltiplos entre s�");		
		}
		
	}

}

/*  if (x % y == 0) {
		System.out.println("El n�mero " + x + " es m�ltiplo de " + y);
		}
		
	else {
		if (y % x == 0) {
			System.out.println("El n�mero " + y + " es m�ltiplo de " + x);
			}
		else {
			System.out.println("Los n�meros no son m�ltiplos entre s�");
			}
	}
*/