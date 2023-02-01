package org.lessons.java.animals;

public class Passerotto extends Animale implements IVolante {

	public Passerotto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verso() {
		System.out.println("Cip cip!");
	}

	@Override
	public void mangia() {
		System.out.println("Vermi, insetti, semi");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}

}
