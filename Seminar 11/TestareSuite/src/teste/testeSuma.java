package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import clase.Matematica;
import exceptii.NumitorInvalid;

class testeSuma {

	@Test
	public void testSumaRight() {
		Matematica matematica = new Matematica();
		assertEquals(7, matematica.suma(2, 5));
	}
	
	@Test
	public void testSumaInvers() {
		Matematica matematica = new Matematica();
		assertEquals(matematica.suma(2, 5) - 5, 2, "A picat testul de inverse relationship."); //diferenta intre junit5 si junit4
	}
	
	@Test 
	public void testSumaPerformance() {
		Matematica matematica = new Matematica();
		assertTimeout(Duration.ofMillis(10), ()-> matematica.suma(2, 5));
	}
	
	@Test
	public void testSumaBoundaryInf() {
		Matematica matematica = new Matematica();
		assertEquals(0, matematica.suma(0, 0));
	}
	
	@Test
	public void testRaportError() {
		Matematica matematica = new Matematica();
		assertThrows(NumitorInvalid.class, () -> matematica.raport(6, 0));
	}
	
	@Test
	public void testRaportRight() {
		Matematica matematica = new Matematica();
		assertEquals(2.0, matematica.raport(6, 3), 0.01);
	}
	
	@Test
	public void testRaportBoundarySup() {
		Matematica matematica = new Matematica();
		assertEquals(1.0, matematica.raport(12, 12), 0.01);
	}
	
	@Test
	public void testRaportBoundaryInf() {
		Matematica matematica = new Matematica();
		assertEquals(-1.0, matematica.raport(1, -1), 0.01);
	}
	
	@Test
	public void testRaportCrossCheck() {
		Matematica matematica = new Matematica();
		double raport = matematica.raport(10, 2);
		int numarator = 10;
		int numitor = 2;
		int contor = 0;
		while(numarator > 0){
			numarator -= numitor;
			contor ++;
		}
		assertEquals(contor, raport, 0.01);
	}
	
	@Test
	public void testRaportPerformance() {
		Matematica matematica = new Matematica();
		assertTimeout(Duration.ofMillis(10), new Executable() {
			
			@Override
			public void execute() throws Throwable {
				matematica.raport(20, 2);
			}
		});
	}
	
	@Test
	public void testParitateRight() {
		Matematica matematica = new Matematica();
		assertTrue(matematica.estePar(2));
	}
	
	@Test
	public void testParitateFalse() {
		Matematica matematica = new Matematica();
		assertFalse(matematica.estePar(7));
	}
	
	@Test
	public void testNumerePareConformance() {
		Matematica matematica = new Matematica();
		assertEquals(3, matematica.nNumerePare(3).size());
	}
	

}
