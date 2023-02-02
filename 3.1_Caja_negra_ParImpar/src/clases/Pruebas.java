package clases;

public class Pruebas {
	
	public static String parImpar (int nume) {  
		String res=""; 
		if (nume% 2== 0){ 
			res = "Par"; 
		} 
		else { 
			res ="Impar"; 
		} 
		return res; 
	}

	@Override
	public String toString() {
		return "Pruebas []";
	} 
	
}
