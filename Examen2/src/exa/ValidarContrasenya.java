package exa;

import java.util.Scanner;

public class ValidarContrasenya {

	public static void main(String[] args) {

		char[] contrasenya;
		Scanner s = new Scanner(System.in);
		System.out.print(
				"Introduzca la contrase�a. Requisitos: \n" + "- La contrase�a debe tener como m�nimo 8 caracteres.\n"
						+ "- Como m�nimo deben aparecer 2 d�gitos \n" + "- Debe comenzar por una letra may�scula \n");

		contrasenya = s.nextLine().toCharArray();

		// COMPLETAR
	}
}