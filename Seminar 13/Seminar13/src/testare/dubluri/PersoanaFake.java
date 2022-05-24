package testare.dubluri;

import acs.ase.clase.IPersoana;

public class PersoanaFake implements IPersoana {

	String sex;
	int varsta;
	Boolean valoareCheckCNP;

	@Override
	public String getSex() {
		return this.sex;
	}

	@Override
	public int getVarsta() {
		return this.varsta;
	}

	@Override
	public boolean checkCNP() {
		return this.valoareCheckCNP;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setValoareCheckCNP(Boolean valoareCheckCNP) {
		this.valoareCheckCNP = valoareCheckCNP;
	}

}
