package lorenzo;

import java.util.Scanner;

public class dfadf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Introduce un n�mero entero positivo: ");
		long x = s.nextInt(), acumulador = 0, y;
		
		while (x>10) {
			
			y=x%10;
			acumulador= acumulador + y;
			x=x/10;
			
		}
		
		System.out.print("La suma de todos sus d�gitos es: " + acumulador);		

	}

}