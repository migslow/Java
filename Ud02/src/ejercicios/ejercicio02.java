package ejercicios;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Introduce tres n�meros");
		double x= s.nextDouble();
		double y= s.nextDouble();
		double z= s.nextDouble();
		
		if (x>y && x>z)
			System.out.print("El n�mero mayor es " + x);
		if (y>x && y>z)
			System.out.print("El n�mero mayor es " + y);
		if (z>x && z>y)
			System.out.print("El n�mero mayor es " + z);
		
	}

}
