package Ejercicios;

import java.util.Scanner;

public class ej1_d {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
	System.out.println("Escribe un n�mero c�digo postal: ");
	 String numero= s.nextLine();
	if(numero.matches("\\d{5}"))
			System.out.println("C�digo correcto");
	else {
		System.out.println("C�digo incorrecto");
	}
	}

}
