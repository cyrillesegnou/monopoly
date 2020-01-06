package fr.gtm.animaux;

public class Kangourou extends Animal {

	public Kangourou(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
		public void manger () {
		System.out.println("mange des herbes");
	}
	@Override
	public void crier () {
		System.out.println("ooooooo");
	}

}


