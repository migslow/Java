package lorenzo;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
	int min, max, contador = 0;
	float sumador = 0;
	
	System.out.println("Por favor, vaya introduciendo n�meros enteros y pulsando INTRO.");
	System.out.println("Para finalizar, ponga un n�mero negativo");
	
	int x=s.nextInt();
	
	if (x>=0) {
		
	min=x;
	max=x;
	
	while (x>=0) {
		
		contador++;
		
		if (x<min){
			min=x;			
		}
		if (x>max) {
			max=x;
		}
		
		sumador = sumador + x;
		
		x=s.nextInt();
	}
	
	System.out.println("El n�mero m�nimo positivo es " + min + " , el n�mero m�ximo positivo es " + max + " . La media de todos los n�meros positivos introducidos es " + (sumador/contador));
	
	}
	else {
		System.out.println("No has introducido ning�n n�mero entero positivo.");
	}
		
	}

}
