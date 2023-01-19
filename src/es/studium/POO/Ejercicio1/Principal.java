package es.studium.POO.Ejercicio1;

public class Principal {

	public static void main(String[] args) {

		Raza raza1 = new Raza("Dalmata");
		
		Perro perro1 = new Perro(raza1, 1.2f, 10, "Blanco y negro");
		System.out.println("El perro de raza: " + perro1.getRaza().getNombreRaza()
				+ ", mide " + perro1.getTamano()
				+ ", tiene " + perro1.getEdad() + " años, "
				+ "y es de color " + perro1.getColor());
		
		//System.out.println(perro1.toString());
		
	}

}
