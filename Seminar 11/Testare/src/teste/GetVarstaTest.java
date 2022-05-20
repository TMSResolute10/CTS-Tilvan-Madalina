package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.Persoana;
import acs.ase.exceptii.CNPInvalidException;

public class GetVarstaTest {

	@Test
	public void getVarstaRight() {
		Persoana persoana = new Persoana("Maria", "6000831674698");
		assertEquals(21, persoana.getVarsta());
	}

	@Test
	public void getVarstaBoundaryInf() {
		Persoana persoana = new Persoana("Maria", "4000101674698");
		assertEquals(222, persoana.getVarsta());
	}
	
	@Test
	public void getVarstaBoundarySup() {
		Persoana persoana = new Persoana("Maria", "6220131674698");
		assertEquals(0, persoana.getVarsta());
	}
	
	@Test (expected = NullPointerException.class) 
	public void getVarstaThrowNullPointerException() {
		Persoana persoana = new Persoana("Maria", null);
		persoana.getVarsta();
	}
	
	@Test (expected = CNPInvalidException.class) 
	public void getVarstaThrowCNPInvalid() {
		Persoana persoana = new Persoana("Maria", "6250831674698");
		persoana.getVarsta();
	}
	
	@Test (timeout = 100) 
	public void getVarstaPerformance() {
		Persoana persoana = new Persoana("Maria", "6200831674698");
		persoana.getVarsta();
	}
	
	@Test
	public void getVarstaOrdering() {
		Persoana persoana1 = new Persoana("Maria", "6020831674698");
		Persoana persoana2 = new Persoana("Maria", "6120831674698");
		
		assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
	}
	
	@Test
	public void getVarstaCardinality1() {
		Persoana persoana = new Persoana("Maria", "6210401674698");
		assertEquals(1, persoana.getVarsta());
	}
	
	//facem pentru metoda checkcnp
	
}
