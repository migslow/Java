package exa;

import java.util.Scanner;

public class ValidarContrasenya {

	public static void main(String[] args) {

		char[] contrasenya;
		Scanner s = new Scanner(System.in);
		System.out.print(
				"Introduzca la contraseña. Requisitos: \n" + "- La contraseña debe tener como mínimo 8 caracteres.\n"
						+ "- Como mínimo deben aparecer 2 dígitos \n" + "- Debe comenzar por una letra mayúscula \n");

		contrasenya = s.nextLine().toCharArray();

		// COMPLETAR
	}
}