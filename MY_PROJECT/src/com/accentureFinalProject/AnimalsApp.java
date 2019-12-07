package com.accentureFinalProject;

import java.util.Scanner;

public class AnimalsApp {
	
	static Scanner scanner = new Scanner(System.in);
	
	static Animal monkey = new Animal("Monkey", "Tree", 50, Gender.male, FoodPreferences.herbivore, 0, 0);
	static Animal giraffe = new Animal("Giraffe", "Savanna", 70, Gender.female, FoodPreferences.herbivore, 0, 0);
	static Animal tiger = new Animal("Tiger", "Rainy forest", 90, Gender.male, FoodPreferences.predator, 0, 0);

	public static void main(String[] args) {
		

		System.out.println("Hello, welcome to the calmest game ever!\n"
				+ "Your goal is to make a baby and in order to do that, your animals should have level 4 of happyness.\n "
				+ "You have three animals:\n"
				+ monkey.toString()+
				giraffe.toString()+
				tiger.toString());
		System.out.println("Please, enter Your name!");
		String input = scanner.nextLine();
		System.out.println("Your name is "+input);
		boolean babyMade = false;
		while (!babyMade) {
			babyMade = startGame();
		}
	}
	
	private static Animal selectAnimal(String message) {
		System.out.println(
				message
				+ "\nEnter: "
				+ "\n (1) for monkey, "
				+ "\n (2) for giraffe, "
				+ "\n (3) for tiger.");
		String input = scanner.nextLine();// add do while loop
		switch (input) {
		case "1":
			System.out.println("You have chosen monkey");
			return monkey;
		case "2":
			System.out.println("You have chosen giraffe");
			return giraffe;
		case "3":
			System.out.println("You have chosen tiger");
			return tiger;
		default:
			System.out.println("Your entered number is wrong. Try again");
			return null;
		}
	}
	
	public static boolean startGame() {
		Animal animal = selectAnimal("Please choose animal you want to play with:");
		if (animal == null) {
			return false;
		}

		System.out.println(
				"Please choose what do you want to do with you animal: "
				+ "\n  Enter: "
				+ "\n (1) for playing, "
				+ "\n (2) for giving food, "
				+ "\n (3) for changing habitat,"
				+ "\n (4) for stealing food from another animal, "
				+ "\n (5) for sharing food with another animal "
				+ "\n (6) for making babies, "
				+ "\n (7) for choosing another animal. ");
		String input = scanner.nextLine();
		switch (input) {
		case "1":
			String toy = selectToy();
			animal.play(toy);
			return false;
		case "2":
			String food = selectFood();
			animal.eat(food);
			return false;
		case "3":
			String habitat = selectHabitat();
			animal.changeHabitat(habitat);
			return false;
		case "4":
			Animal target = selectAnimal("Please choose animal to steal from:");
			animal.stealFood(target);
			return false;
		case "5":
			target = selectAnimal("Please choose animal to share with:");
			animal.shareFood(target);
			return false;
		case "6":
			target = selectAnimal("Please choose animal to mate with:");
			return animal.makeABaby(target);			
		default:
			System.out.println("Invalid option");
			return false;
		}
	}
	

	public static String selectToy() {
		System.out.println(
				"How do you want to play? "
				+ "\n Enter: "
				+ "\n (1) for playing with ball, "
				+ "\n (2) for playing with frisbee, "
				+ "\n (3) for playing with stuffed rabbit.");
		String input = scanner.nextLine();
		switch (input) {
		case "1":
			return "ball";
		case "2":
			return "frisbee";
		case "3":
			return "stuffed rabbit";
		default:
			return null;
		}
	}
	
	public static String selectHabitat() {
		System.out.println("Enter the new home for your animal:");
		return scanner.nextLine();
	}
	
	public static String selectFood() {

		System.out.println(
				"What food do you want to give to your animal? "
				+ "\n Enter: "
				+ "\n (1) ball, "
				+ "\n (2) meat, "
				+ "\n (3) grass.");
		String input = scanner.nextLine();
		switch (input) {
		case "1":
			return "ball";
		case "2":
			return "meat";
		case "3":
			return "grass";
		default:
			return null;
		}
	}

}
