package EjerciciosIniciales;

public class Pizza {

	private static int pedidas=0;
	public static int getPedidas() {
		return pedidas;
	}
	private static int servidas=0;
	public static int getServidas() {
		return servidas;
	}
	
	private String tipo;
	private String tama�o;
	private String estado;

	//Constructores
	public Pizza(String tipo, String tama�o) {
		this.tipo = tipo;
		this.tama�o = tama�o;
		this.estado = "pedida";
		pedidas++;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	public String getEstado() {
		return estado;
	}
	//Metodos
	public void servir() {
		if(estado!="servida") {
			this.estado="servida";
			servidas++;
		}else {
			System.out.println("esta pizza ya est� servida");
		}
	}

	@Override
	public String toString() {
		return "pizza "+ tipo+ " " + tama�o + ", " + estado;
	}
	


}
