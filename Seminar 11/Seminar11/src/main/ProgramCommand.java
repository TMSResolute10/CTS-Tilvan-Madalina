package main;

import command.Autobuz;
import command.Comanda;
import command.ComandaPlecareInCursa;
import command.Operator;

public class ProgramCommand {
	Autobuz autobuz = new Autobuz("B22AAA");
	Autobuz autobuz2 = new Autobuz("B23AAA");
	
	Operator operator = new Operator();
	Comanda comanda = new ComandaPlecareInCursa(autobuz, 2);
	Comanda comanda2 = new ComandaPlecareInCursa(autobuz2, 3);
	Comanda comanda3 = new ComandaPlecareInCursa(autobuz, 4);
	Comanda comanda4 = new ComandaPlecareInCursa(autobuz2, 2);
	Comanda comanda5 = new ComandaPlecareInCursa(autobuz, 1);
	
//	operator.adauga(comanda);
//	operator.adauga(comanda2);
//	operator.adauga(comanda3);
//	operator.adauga(comanda4);
//	operator.adauga(comanda5);
//	operator.executaComanda();
//	operator.executaComanda();
}
