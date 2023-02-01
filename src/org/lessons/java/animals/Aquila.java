package org.lessons.java.animals;

public class Aquila extends Animale implements IVolante {

	public Aquila() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verso() {
		System.out.println("Screech!");
	}

	@Override
	public void mangia() {
		System.out.println("Carne");
	}

	@Override
	public void vola() {
		System.out.println("L'aquila vola!!!");
	}

}
