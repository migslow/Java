package lorenzo;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	double x, y, z;
	
	System.out.print("Introduce tres n�meros distintos separados por un espacio: ");
	x = s.nextDouble();
	y = s.nextDouble();
	z = s.nextDouble();
	
	
	if (x == y || x == z || y == z) {
		System.out.println("Los n�meros no son diferentes");
		}
	else	{
		if (x > y && x > z) {
			System.out.println("El n�mero " + x + " es el mayor de los tres");
			System.exit(1);
			}
		if (y > x && y > z) { 
			System.out.println("El n�mero " + y + " es el mayor de los tres");
			System.exit(1);
			}
		if (z > x && z > y) { 
			System.out.println("El n�mero " + z + " es el mayor de los tres");
			}
			}
	}

}
/*	double maximo;
	if (x >= y)
		if (x >= z)
			maximo = x;
		else // x < z
			maximo = z;
	else // x < y
		if (y >= z)
			maximo = y;
		else
			maximo = z;
	System.out.println("El n�mero " + maximo + " es el mayor de los tres");
*/	
	

