package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.Persoana;
import acs.ase.exceptii.CNPInvalidException;

public class GetSexTest {

	@Test
	public void getSexRight() {
		Persoana persoana1 = new Persoana("Andrei", "6000534532163");
		assertEquals("F", persoana1.getSex());

		Persoana persoana2 = new Persoana("Maria", "5000523523521");
		assertEquals("M", persoana2.getSex());
	}
	
	@Test
	public void getSexBoundarySuper() {
		Persoana persoana1 = new Persoana("Andrei", "1000534532163");
		assertEquals("M", persoana1.getSex());
	}
	
	@Test
	public void getSexBoundaryUpper() {
		Persoana persoana2 = new Persoana("Maria", "6000523523521");
		assertEquals("F", persoana2.getSex());
	}
	
	@Test
	public void getSexCrossCheck() {
		Persoana persoana = new Persoana("Maria", "6000523523521");
		int primaCifra = persoana.CNP.charAt(0);
		assertEquals(primaCifra%2==0?"F":"M", persoana.getSex());
	}
	
	@Test 
	public void testGetSexShouldThrowExceptionJunit3() {
		Persoana persoana = new Persoana("Andrei", "0045763839571");
		try {
			persoana.getSex();
			fail("Metoda nu arunca exceptie");
		} catch (CNPInvalidException exception) {
			
		}
	}
	
	@Test(expected = CNPInvalidException.class)
	public void testGetSexShouldThrowExceptionJunit4() {
		Persoana persoana = new Persoana("Andrei", "02347863795436");
		persoana.getSex();
	}
	
	@Test(expected = NullPointerException.class)
	public void testGetSexShouldThrowNullException() {
		Persoana persoana = new Persoana("Andrei", null);
		persoana.getSex();
	}
	
	@Test (timeout = 100) 
	public void testGetSexPerformance() {
		Persoana persoana = new Persoana("Andrei", "52347863795436");
		persoana.getSex();
	}
	
	@Test
	public void testGetSexComformance() {
		Persoana persoana = new Persoana("Andrei", "52347863795436");
		assertEquals(1, persoana.getSex().length());
	}
	
	@Test 
	public void testGetSexRangeSuperior() {
		Persoana persoana = new Persoana("Andrei", "72347863795436");
		assertEquals("N/A", persoana.getSex());
	}
	

}
