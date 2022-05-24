package testare.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import acs.ase.clase.AgentieTurism;
import acs.ase.clase.IPachet;
import testare.dubluri.PachetDummy;
import testare.dubluri.PachetFake;
import testare.dubluri.PachetStub;

public class TestAgentieTurism {

	@Test
	public void testAdaugaPachet() {
		AgentieTurism agentie = new AgentieTurism();
		IPachet pachet = new PachetDummy();
		agentie.adaugaPachet(pachet);
		assertEquals(1, agentie.getNumarPacheteTuristice());
	}
	
	@Test
	public void testCalculareSumaTotalaPachete() { 
		AgentieTurism agentie = new AgentieTurism();
		PachetStub pachet = new PachetStub();
		PachetStub pachet2 = new PachetStub();
		
		agentie.adaugaPachet(pachet);
		agentie.adaugaPachet(pachet2);
		
		assertEquals(2000.0, agentie.calculareSumaTotalaPachete(), 0.01);
	}
	
	@Test
	public void testCalculareSumaTotalaPacheteFake() { 
		AgentieTurism agentie = new AgentieTurism();
		PachetFake pachet = new PachetFake();
		PachetFake pachet2 = new PachetFake();
		
		pachet.setPret(1000.0);
		pachet2.setPret(300.0);
		
		agentie.adaugaPachet(pachet);
		agentie.adaugaPachet(pachet2);
		
		assertEquals(1300.0, agentie.calculareSumaTotalaPachete(), 0.01);
	}
}
