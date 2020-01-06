package fr.gtm.animaux;

public class Lion extends Animal {
	

	public Lion (String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void manger () {
		System.out.println("mange du mouton");
	}
	@Override
	public void crier () {
		System.out.println("rugissement");
	}

}


