package Ejercicios08;

public class Biblioteca {
	private String codigo;
	private String titulo;
	private int a�o;
	
	public Biblioteca() {
		codigo="";
		titulo="";
		a�o=1900;
	}
	
	public Biblioteca(String codigo, String titulo, int a�o) {
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.a�o = a�o;
	}
	
	@Override
	public String toString() {
		return "Titulo=" + titulo + ", codigo: " + codigo +   ", a�o: " + a�o ;
	}

	public String getCodigo() {
		return codigo;
	}

	public int getA�o() {
		return a�o;
	}
	

}
