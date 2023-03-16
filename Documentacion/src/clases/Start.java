package clases;

/**
 * Clase en la que se ejecutan los métodos de la clase Operaciones
 * @author Jandro
 * @version 1, 16/03/2023
 */
public class Start {

	public static void main(String[] args) {
		
		System.out.println("Suma = "+Operaciones.sumar(2, 2));
		System.out.println("Resta = "+Operaciones.restar(2, 2));
		System.out.println("Multiplicacion = "+Operaciones.multiplicar(2, 2));
		System.out.println("Division = "+Operaciones.dividir(2, 0));
	}

}
