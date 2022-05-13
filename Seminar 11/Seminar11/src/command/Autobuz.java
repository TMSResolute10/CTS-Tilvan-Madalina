package command;

public class Autobuz {
	private String nrInmatriculare;

	public Autobuz(String string) {
		super();
		this.nrInmatriculare = string;
	}

	public void pleacaInCursa(int nrLinie) {
		System.out.println("Autobuzul cu nr de inmatriculare " + nrInmatriculare + " a plecate pe linia " + nrLinie);
	}
}
