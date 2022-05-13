package command;

public class ComandaPlecareInCursa implements Comanda {

	Autobuz autobuz;
	int linie;

	public ComandaPlecareInCursa(Autobuz autobuz, int linie) {
		super();
		this.autobuz = autobuz;
		this.linie = linie;
	}

	@Override
	public void executa() {
		autobuz.pleacaInCursa(linie);
	}

}
