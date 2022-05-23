package _EXAMENES;

import java.util.Scanner;

public class ValidarContrasenya {

	public static void main(String[] args) {

		char[] contrasenya;
		Scanner s = new Scanner(System.in);
		System.out.print(
				"Introduzca la contrase�a. Requisitos: \n" + "- La contrase�a debe tener como m�nimo 8 caracteres.\n"
						+ "- Como m�nimo deben aparecer 2 d�gitos \n" + "- Debe comenzar por una letra may�scula \n");

		contrasenya = s.nextLine().toCharArray();
		comprueba(contrasenya);

	}

	private static void comprueba(char[] cont) {
		int  num = 0;
		for (int i = 0; i < cont.length; i++) {
			if ((cont[i] > 47) && (cont[i] < 58))
				num++;
		}
		if((cont.length>7)&&(num>1)&&(cont[0]>64)&&(cont[0]<91))
			System.out.println("Contrase�a v�lida");
		else System.out.println("Contrase�a NO v�lida");
	}
}