package exa;

public class Estaturas {

	static double alturasDescartadas;
	static double media;
	static int contador = 0;
	static double suma = 0;

	public static void main(String[] args) {
		double[] altura = { 1.75, 1.68, 1.9, 2.04, 1.85, 1.66, 1.55, 1.88, 1.45, 1.82, 2.01, 1.79, 1.8, 1.56, 1.69,
				1.79, 1.83, 1.75 };

		alturasDescartadas = alturasDescartadas(altura);
		media = media(altura);

		System.out.println("De las " + altura.length + " hay " + alturasDescartadas + " no validas");
		System.out.println("La media de las estaturas validas es: " + media(altura));
	}

	public static double alturasDescartadas(double[] altura) {
		for (int i = 0; i < altura.length; i++) {
			if (altura[i] < 1.50 || altura[i] > 2.00) {
				contador++;
			}
		}
		return contador;
	}

	public static double media(double[] altura) {
		double suma = 0;
		for (int i = 0; i < altura.length; i++) {
			if (altura[i] > 1.00) {
				suma = suma / altura[i];
			}
		}
		return suma;
	}
}
