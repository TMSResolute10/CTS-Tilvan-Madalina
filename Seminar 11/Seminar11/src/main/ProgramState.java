package main;

import state.Autobuz;

public class ProgramState {

	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz(381);
		
		autobuz.pleacaInCursa();
		autobuz.terminaCursa();
		autobuz.intraInService();
		autobuz.ieseDinService();
		autobuz.pleacaInCursa();
		autobuz.intraInService();
		autobuz.terminaCursa();
	}

}
