package testare.dubluri;

import acs.ase.clase.IPachet;

public class PachetDummy implements IPachet{

	@Override
	public boolean poateRezerva() {
		return false;
	}

	@Override
	public void aplicaDiscountVarstnici(int procent) {
	}

	@Override
	public Double getPret() {
		return null;
	}

}
