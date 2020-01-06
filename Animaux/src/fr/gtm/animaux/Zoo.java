package fr.gtm.animaux;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Animal> animaux = new ArrayList<Animal> ();
	public void addAnimal (Animal n) {
		animaux.add (n);
	}
	
	public void nourrirTous () {
		for (Animal n : animaux) {
			n.manger();
		}
	}
	public void faireCrierTous () {
		for (Animal n : animaux) {
			n.crier();
		}
		
	}
}
