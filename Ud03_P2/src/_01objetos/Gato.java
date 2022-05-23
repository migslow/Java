package _01objetos;


public class Gato {
 // 
  private String nombre;
  private String raza;
  private String sexo;
  private int edad;
  private double peso;
  
 
  
  public Gato(String nombre, String raza, String sexo, int edad, double peso) {
	
	this.nombre = nombre;
	this.raza = raza;
	this.sexo = sexo;
	this.edad = edad;
	this.peso = peso;
}

// constructor
  
  
  public Gato () {
	  nombre = "";
	  raza = "";
	  sexo = "";
	  edad = 0;
	}
  
  
  // getter
 public String getSexo() {
    return this.sexo;
  }
 public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getRaza() {
	return raza;
}

public void setRaza(String raza) {
	this.raza = raza;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public void setpeso(double peso) {
	    this.peso=peso;
	  }
 public double getpeso() {
	    return this.peso;
	  }
  /**
   * Hace que el gato maulle
   */
  public void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */  
  public void ronronea() {
    System.out.println("mrrrrrr");
  }
  
 
  public void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  
  public void peleaCon(Gato contrincante) {
    if (this.sexo.equals("hembra")) {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getSexo().equals("hembra")) {
        System.out.println("no peleo contra gatitas");
      } else {
        System.out.println("ven aqu� que te vas a enterar");
      }
    }
  }

@Override
public String toString() {
	return "Gato [nombre=" + nombre + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + "]";
}
  
}
