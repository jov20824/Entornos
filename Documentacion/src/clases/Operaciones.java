package clases;
/**
 * @class Esta clase tiene 4 métodos para realizar operaciones con 2 parámetros.
 * @author Jandro
 *
 */
public class Operaciones {

	/**
	 * Suma los dos números que se la pasan por parámetro
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int sumar(int n1 , int n2) {
		
		int devolver=n1+n2;
		
		return devolver;
	}
	/**
	 * Resta los dos números que se la pasan por parámetro
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int restar(int n1 , int n2) {
		
		int devolver=n1-n2;
		
		return devolver;
	}
	/**
	 * Multiplica los dos números que se la pasan por parámetro
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int multiplicar(int n1 , int n2) {
		
		int devolver=n1*n2;
		
		return devolver;
	}
	/**
	 * Divide los dos números que se la pasan por parámetro
	 * @exception Puede dar aritmetical exception al dividir entre 0
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static double dividir(int n1 , int n2) {
		double devolver=0;
		
		try {
			devolver=n1/n2;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return devolver;
	}
	
}
