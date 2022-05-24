package testare.dubluri;

import acs.ase.clase.IPachet;

public class PachetFake implements IPachet {

	Double pret;
	Boolean rezerva;

	@Override
	public boolean poateRezerva() {
		return this.rezerva;
	}

	@Override
	public void aplicaDiscountVarstnici(int procent) {
	}

	@Override
	public Double getPret() {
		return this.pret;
	}

	public void setPret(Double pret) {
		this.pret = pret;
	}

	public void setRezerva(Boolean rezerva) {
		this.rezerva = rezerva;
	}

}
