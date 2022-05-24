package testare.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.PachetTuristic;
import testare.dubluri.PersoanaFake;

public class TestPersoana {

	@Test
	public void testPoateRezerva() {
		PersoanaFake persoana = new PersoanaFake();
		persoana.setVarsta(22);
		PachetTuristic pachet = new PachetTuristic(persoana, "Iasi", 1000.0);
		assertTrue(pachet.poateRezerva());
	}
	
	@Test
	public void testPoateRezervaBoundary() {
		PersoanaFake persoana = new PersoanaFake();
		persoana.setVarsta(18);
		PachetTuristic pachet = new PachetTuristic(persoana, "Iasi", 1000.0);
		assertTrue(pachet.poateRezerva());
	}
	
	@Test
	public void testDiscountFake() {
		PersoanaFake persoana = new PersoanaFake();
		persoana.setVarsta(70);
		PachetTuristic pachet = new PachetTuristic(persoana, "Iasi", 1000.0);
		pachet.aplicaDiscountVarstnici(10);
		assertEquals(900.0, pachet.getPret(), 0.01);
	}
	
	@Test
	public void testNuAplicaDiscount() {
		PersoanaFake persoana = new PersoanaFake();
		persoana.setVarsta(50);
		PachetTuristic pachet = new PachetTuristic(persoana, "Iasi", 1000.0);
		pachet.aplicaDiscountVarstnici(10);
		assertEquals(1000.0, pachet.getPret(), 0.01);
	}
	
	@Test
	public void testDiscountBoundarySup() {
		PersoanaFake persoana = new PersoanaFake();
		persoana.setVarsta(65);
		PachetTuristic pachet = new PachetTuristic(persoana, "Iasi", 1000.0);
		pachet.aplicaDiscountVarstnici(10);
		assertEquals(900.0, pachet.getPret(), 0.01);
	}
	
	@Test
	public void testDiscountBoundary() {
		PersoanaFake persoana = new PersoanaFake();
		persoana.setVarsta(80);
		PachetTuristic pachet = new PachetTuristic(persoana, "Iasi", 1000.0);
		pachet.aplicaDiscountVarstnici(100);
		assertEquals(0, pachet.getPret(), 0.01);
	}

}
