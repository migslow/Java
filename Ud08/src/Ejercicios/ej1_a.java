package Ejercicios;

import java.util.Scanner;

public class ej1_a {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
	System.out.println("Escribe un n�mero de tel�fono: ");
	 String numero= s.nextLine();
	if(numero.matches("\\d{9}"))
			System.out.println("Numero correcto");
	else {
		System.out.println("N�mero incorrecto");
	}
	}

}
