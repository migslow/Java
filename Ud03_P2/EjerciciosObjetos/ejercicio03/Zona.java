package ejercicio03;

public class Zona {
	
	private int entradasPorVender;
	
	public Zona(int n) {
		entradasPorVender=n;
	}
	
	public int getentradasPorVender() {
		return entradasPorVender;
	}

	public void vender(int n) {
		
		if(this.entradasPorVender==0) {
			System.out.println("Lo siento, las entradas para esa zona est�n agotadas.");
		}else
			if(this.entradasPorVender<n) {
				System.out.println("S�lo quedan" + this.entradasPorVender + " entradas para esa zona.");
			}
		
		if(this.entradasPorVender>=n) {
			entradasPorVender= entradasPorVender-n;
			System.out.println("Aqui tiene sus "+ n+ " entradas, gracias.");
			
		}
		
		}
	}
	
	
	
	
	

