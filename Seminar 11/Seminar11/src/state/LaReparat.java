package state;

public class LaReparat implements State{

	@Override
	public void schimbaStarea(Autobuz autobuz) {
		if (autobuz.getStare() instanceof LaCapatDeLinie) {
			System.out.println("Autobuzul cu numarul " + autobuz.getNrAutobuz() + " este in Service.");
			autobuz.setStare(this);
		} else {
			System.out.println("Autobuzul nu poate fi trimis la service.");
		}
		
	}

}
