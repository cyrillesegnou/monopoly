package fr.gtm.animaux;


public class MainZoo {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo ();
		
		zoo.addAnimal(new Lion ( "alex "));
		zoo.addAnimal(new Zebre( "Rolland" ));
		zoo.addAnimal(new Kangourou ( "Vinent "));
		
		zoo.nourrirTous();
		zoo.faireCrierTous();
				
	}

}
