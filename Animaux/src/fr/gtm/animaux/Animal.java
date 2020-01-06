package fr.gtm.animaux;

public abstract class Animal {
	public String name ;
	
	public abstract void manger ();
	public abstract void crier ();
	public Animal(String name) {
		this.name = name;
	}
}
