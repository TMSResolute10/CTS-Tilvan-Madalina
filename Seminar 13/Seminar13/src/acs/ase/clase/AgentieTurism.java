package acs.ase.clase;

import java.util.ArrayList;
import java.util.List;

public class AgentieTurism {

	private List<IPachet> pacheteTuristice;
	
	public AgentieTurism() {
		pacheteTuristice=new ArrayList<IPachet>();
	}
	
	public void adaugaPachet(IPachet pachet) {
		pacheteTuristice.add(pachet);
	}
	
	public int getNumarPacheteTuristice() {
		return pacheteTuristice.size();
	}
	
	public double calculareSumaTotalaPachete() {
		double suma=0;
		for(IPachet pachet:pacheteTuristice) {
			suma+=pachet.getPret();
		}
		
		return suma;
	}
}
