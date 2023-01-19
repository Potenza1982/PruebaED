package es.studium.POO.Ejercicio1;

public class Raza {

	private String nombreRaza;
	
	public Raza() {
		nombreRaza = "";
	}

	@Override
	public String toString() {
		return "Raza [nombreRaza=" + nombreRaza + "]";
	}

	public String getNombreRaza() {
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza) {
		this.nombreRaza = nombreRaza;
	}

	public Raza(String nombreRaza) {
		this.nombreRaza = nombreRaza;
	}
}
