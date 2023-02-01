package org.lessons.java.animals;

public class Main {

	public static void main(String[] args) {

		firstExercise();

		System.out.println("------------------------------------------------");

		secondExercise();

	}

	public static void firstExercise() {

		System.out.print("+++++++++++++++++++++++++++++");
		System.out.print("- Benvenuto allo zoo! -");
		System.out.print("+++++++++++++++++++++++++++++");

		System.out.println();
		System.out.println();

		Aquila eagle = new Aquila();

		Delfino dolphin = new Delfino();

		Cane dog = new Cane();

		System.out.println("Ecco un'aquila che va a caccia! Si nutre di: ");
		eagle.mangia();

		System.out.println();

		System.out.println("Ecco un delfino che dorme!");
		dolphin.dormi();

		System.out.println();

		System.out.println("Che baccano, questo cane non smette di abbaiare!");
		dog.verso();

	}

	public static void secondExercise() {

		System.out.println("\nOra vediamo un po' cosa sono capaci di fare questi animali!");

		Passerotto bird = new Passerotto();
		System.out.println("\nEcco il passerotto!");

		faiVolare(bird);

		Delfino dolphin = new Delfino();
		System.out.println("\nIl delfino si è svegliato!");

		faiNuotare(dolphin);

		Aquila eagle = new Aquila();
		System.out.println("\nArriva anche l'aquila!");

		faiVolare(eagle);

	}

	public static void faiVolare(IVolante animale) {
		animale.vola();
	}

	public static void faiNuotare(INuotante animale) {
		animale.nuota();
	}

}
