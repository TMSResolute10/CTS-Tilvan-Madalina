package zoo;

public class Zebra extends Animal{

	public Zebra(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mananca(String mancare) {
		System.out.println("Zebra " + super.getNume() +" a mancat " + mancare);
	}
	
	

}
