package org.lessons.java.animals;

public class Main {

	public static void main(String[] args) {

		firstExercise();

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

}
