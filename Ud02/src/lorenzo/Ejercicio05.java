package lorenzo;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un car�cter: ");
		char x = s.nextLine().charAt(0); 
		int n = (int) x;
		
		

		if ((n >= 48) && (n <= 57)) {
			System.out.println(x + " es un car�cter alfanum�rico. Se trata de un d�gito");
			}
		else
			if ((n >= 65) && (n <= 90)){
				System.out.println(x + " es un car�cter alfanum�rico. Se trata de una letra may�scula");
				}
			else
				if ((n >= 97) && (n <= 122)){
					System.out.println(x + " es un car�cter alfanum�rico. Se trata de una letra min�scula");
				}
				else{
					System.out.println(x + " no es un car�cter alfanum�rico");
				}
		}

}
