package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Introduce tres numeros enteros: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();
		
		System.out.println(n1<n2 && n2<n3);

	}

}
