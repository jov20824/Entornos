package clases;

import junit.framework.TestCase;

public class TestParImpar extends TestCase {

	public void testPar() {
		assertEquals("Par" , Pruebas.parImpar(2));
	}
	public void testImpar() {
		assertEquals("Impar" , Pruebas.parImpar(3));
	}
	
}
