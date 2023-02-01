package org.lessons.java.animals;

public class Delfino extends Animale implements INuotante {

	public Delfino() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verso() {
		System.out.println("Crrr crrr!");
	}

	@Override
	public void mangia() {
		System.out.println("Pesce");
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}

}
