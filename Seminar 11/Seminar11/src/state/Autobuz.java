package state;

public class Autobuz {
	private State stare;
	private int nrAutobuz;

	public State getStare() {
		return stare;
	}

	protected void setStare(State stare) {
		this.stare = stare;
	}

	public int getNrAutobuz() {
		return nrAutobuz;
	}

	public void setNrAutobuz(int nrAutobuz) {
		this.nrAutobuz = nrAutobuz;
	}

	public Autobuz(int nrAutobuz) {
		super();
		this.nrAutobuz = nrAutobuz;
		this.stare = new LaCapatDeLinie();
	}

	public void pleacaInCursa() {
		InCursa inCursa = new InCursa(); //incalca dependence inversion
		inCursa.schimbaStarea(this);
	}

	public void intraInService() {
		State laReparat = new LaReparat();  
		laReparat.schimbaStarea(this);
	}

	public void ieseDinService() {
		State laCapatDeLinie = new LaCapatDeLinie();
		laCapatDeLinie.schimbaStarea(this);
	}

	public void terminaCursa() {
		State laCapatDeLinie = new LaCapatDeLinie();
		laCapatDeLinie.schimbaStarea(this); 
	}

}
