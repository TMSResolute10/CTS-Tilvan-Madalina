package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Matematica;

public class MatematicaTest {

	@Test
	public void test() {
		Matematica matematica = new Matematica();
		int suma;
		suma = matematica.suma(2, 6);
		assertEquals(8, suma);
	}

}
