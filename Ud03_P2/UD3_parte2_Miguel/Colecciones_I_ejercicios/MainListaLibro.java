package Colecciones_I_ejercicios;

public class MainListaLibro {

	public static void main(String[] args) {
		Persona p1=new Persona(123456,33,"Autores","Desconocidos");
		Persona p2=new Persona(12345678,25,"J.K.","Rowling");
		Persona p3=new Persona(43673425,48,"J.R.","Tolkien");
		Persona p4=new Persona(7575732,36,"Gabriel","Garcia Marquez");

		Libro l1=new Libro("La Biblia",p1,"00000-XX",2689,49,"Mundial","Iglesia X (el Vaticano)",new Fecha(1,1,1));
		Libro l2=new Libro("Harry Potter",p2,"4564-SAR",800,87,"Elvives","Londres (UK)",new Fecha(24,12,1987));
		Libro l3=new Libro("Lord of the Rings",p3,"87941-TRE",1400,20,"Editorial Generica","WWI (Polonia)",new Fecha(30,4,1894));
		Libro l4=new Libro("100 a�os de soledad",p4,"0129347-YR",100,6,"Elvives","Barcelona (Espa�a)",new Fecha(14,2,1945));
		Libro l5=new Libro();
//		l5.leer();
		
		ListaLibro lista= new ListaLibro();
		lista.a�adirLibro(l1);
		lista.a�adirLibro(l2);
		lista.a�adirLibro(l3);
		lista.a�adirLibro(l4);
		System.out.println(lista);
		/*
		Libro[] filtrado=lista.FiltroLibro("L");
		for(int i =0;i<filtrado.length;i++) {
			System.out.println(filtrado[i]);
		}^
		*/
		//System.out.println(lista.PosiconLibro("100 a�os de soledad"));
		//lista.eliminaLibro(2);
		//System.out.println(lista);
		
	}

}
