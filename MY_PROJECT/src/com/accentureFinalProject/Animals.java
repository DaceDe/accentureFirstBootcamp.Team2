package com.accentureFinalProject;

import java.util.Scanner;

public class Animals {
	private String name;
	private String habitat;
	private boolean hungry;
	private double foodAmount;
	private boolean gender;
	private HappinessLevel happynessLevel; // make new class for hapiness with
											// max, min,
	private boolean foodPreferences;
	private double foodConsumed;
	static Scanner scanner = new Scanner(System.in);

	public Animals(String name, String habitat, double foodAmount,
			boolean gender, boolean foodPreferences, double foodConsumed,
			int happynessLevel) {
		this.name = name;
		this.habitat = habitat;
		this.gender = gender;
		this.foodPreferences = foodPreferences;
		this.foodAmount = foodAmount;
		this.foodConsumed = foodConsumed;
		this.happynessLevel = new HappinessLevel();

	}

	public String getName() {
		return name;
	}

	public String getHabitat() {
		return habitat;
	}

	public double getFoodAmount() {
		return foodAmount;
	}

	public boolean isGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	public void setFoodAmount(double foodAmount) {
		this.foodAmount = foodAmount;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public boolean isFoodPreferences() {
		return foodPreferences;
	}

	public double getFoodCousumed() {
		return foodConsumed;
	}

	public void setFoodPreferences(boolean foodPreferences) {
		this.foodPreferences = foodPreferences;
	}

	public void setFoodCousumed(double foodCousumed) {
		this.foodConsumed = foodCousumed;
	}

	public void shareFood(Animals anotherAnimal) {

		System.out.println("After sharing food " + getName() + " has "
				+ (this.foodAmount = anotherAnimal.foodAmount / 2)
				+ " kilograms of food!");
		System.out.println("But " + anotherAnimal.name + " "
				+ (anotherAnimal.foodAmount = this.foodAmount / 2)
				+ " kilograms of food!");
	}

	public void makeABaby(Animals anotherAnimal) {

		if (this.happynessLevel.isMax() && anotherAnimal.happynessLevel.isMax()
				&& isCompatibleForLove(anotherAnimal) == true) {
			System.out.println("Congratulations! Your animals have a baby!");
		} else {
			System.out.println("Your animals can't have a baby!");
		}

	}

	private boolean isCompatibleForLove(Animals anotherAnimal) {
		if (this.gender == Gender.female && anotherAnimal.gender == Gender.male
				|| this.gender == Gender.male
				&& anotherAnimal.gender == Gender.female) {
			return true;
		} else {
			return false;
		}
	}

	public void stealFood(Animals anotherAnimal, double stolenFoodAmount) {

		if (anotherAnimal.foodAmount > stolenFoodAmount) {
			System.out.println("After stealing " + getName() + " has "
					+ (this.foodAmount += stolenFoodAmount)
					+ " kilograms of food!");
			System.out.println("But " + anotherAnimal.name + " has "
					+ (anotherAnimal.foodAmount -= stolenFoodAmount)
					+ " kilograms of food!");
		} else {
			System.out.println(getName() + "! You can't take more than "
					+ anotherAnimal.name + " has!");
		}
	}

	public void startGame() {
		System.out
				.println("Hello, welcome to the calmest game ever!\nYour goal is to make as much babies as possible and in order to do that, your animals should have level 4 of happyness. \nTo start, please choose animal you want to play with:\nEnter: \n (1) for monkey, \n (2) for giraffe, \n (3) for tiger.");
		String input5 = scanner.nextLine();// add do while loop
		switch (input5) {
		case "1":
			System.out.println("You have chosen to play with monkey");
			break;
		case "2":
			System.out.println("You have chosen to play with giraffe");
			break;
		case "3":
			System.out.println("You have chosen to play with tiger");
			break;
		default:
			System.out.println("Your entered number is wrong. Try again");
		}

		System.out
				.println("Please choose what do you want to do with you animal: \n  Enter: \n (1) for  playing, \n (2) for giving food, \n (3) for changing habitat,\n (4) for stealing food from another animal, \n (5) for sharing food with another animal \n (6) for making babies, \n (7) for choosing another animal. ");
		String input3 = scanner.nextLine();
		switch (input3) {
		case "1":
			play();
			break;
		case "2":
			giveFood();
			break;
		case "3":
			changeHabitat();
			break;
		case "4":

			System.out
					.println("Please choose animal you want to steal food from: \n Enter: \n (1) for \n (2)"); // add
																												// values
			String input4 = scanner.nextLine();
			System.out.println("How much food do you want to steal? ");// add
																		// loop
			int input6 = scanner.nextInt();
			if (this.foodAmount < input6) {
				System.out.println("You cannot steal more than animal has");
			} else {
				System.out.println("You can steal " + input6);

			}

			// from
			// array
			// list
			// stealFood(Animals anotherAnimal, double stolenFoodAmount);
			break;
		case "5":
			System.out
					.println("Please choose animal you want to share food with: \n Enter: \n (1) for \n (2)");
			// add values from array list
			// stealFood(anotherAnimal, stolenFoodAmount);
			break;
		case "6":
			System.out
					.println("Please choose animal you want to make babies with: \n Enter: \n (1) for \n (2)");
			// makeABaby(Animals anotherAnimal);
			break;
		case "7":
			System.out
					.println("Please choose the animal: \n Enter: \n (1) for \n (2) for ");

		default:
			System.out.println("Sorry your animal doesn't like " + input3);
		}
	}

	public void giveFood() {

		System.out
				.println("What food do you want to give to your animal? \n Enter: \n (1) ball, \n (2) meat, \n (3) grass.");
		String input1 = scanner.nextLine();
		switch (input1) {
		case "1":
			System.out
					.println("Sorry your animal doesn't eat ball and now is level "
							+ happynessLevel.decrease() + " happy");
			foodConsumed = 0;
			break;
		case "2":
			if (foodPreferences == FoodPreferences.predator) {
				System.out
						.println("You have fed the animal with meat and your animal now is "
								+ happynessLevel.increase() + " happy.");
				foodConsumed = foodAmount;
			} else {
				System.out
						.println("Sorry your animal is herbivore and doesn't eat meat and now is level "
								+ happynessLevel.decrease() + " happy.");
				foodConsumed = 0;
			}
			break;
		case "3":
			if (foodPreferences == FoodPreferences.herbivore) {
				System.out
						.println("You have fed the animal with grass and your animal now is "
								+ happynessLevel.increase() + " happy.");
				foodConsumed = foodAmount;
			} else {
				System.out
						.println("Sorry your animal is predator and doesn't eat grass and your animal now is  "
								+ happynessLevel.decrease() + " happy.");
				foodConsumed = 0;
			}
			break;
		default:
			System.out.println("Sorry your animal doesn't eat " + input1
					+ " and your animal now is " + happynessLevel.decrease()
					+ " happy.");
		}
	}

	public void play() {

		System.out
				.println("How do you want to play? \n Enter: \n (1) for playing with ball, \n (2) for playing with frisbee, \n (3) for playing with staffed rabbit.");
		String input2 = scanner.nextLine();
		switch (input2) {
		case "1":
			System.out
					.println("You have played with the ball and your animal now is level "
							+ happynessLevel.increase() + " happy");
			break;
		case "2":
			System.out
					.println("You have played with the frisbee and your animal now is level "
							+ happynessLevel.increase() + " happy");
			break;
		case "3":
			System.out
					.println("You have played with staffed raabbit and your animal now is level "
							+ happynessLevel.increase() + " happy");
			break;
		default:
			System.out.println("Sorry you cannot play with the " + input2
					+ happynessLevel.decrease() + " happy");
		}
	}

	public void changeHabitat() { // scanner

		System.out.println("Enter the new home for your animal:");
		String input3 = scanner.nextLine();
		System.out.println("Animal now lives in " + input3);
	}

	// public double increaseFoodAmount(double foodAmmount) {
	// foodAmount = foodAmount + foodAmmount;
	// return foodAmount;
	// }

	public String hungry() {
		foodConsumed = 0;
		happynessLevel.reset();
		return "your animal is hungry!";

	}

	public String getGenderString() {
		return gender == Gender.female ? "FEMALE" : "MALE";
	}

	public String getfoodPreferencesString() {
		return foodPreferences == FoodPreferences.herbivore ? "herbivore"
				: "predator";
	}

	public String toString() {
		return "Animals [name=" + name + ", habitat=" + habitat
				+ ", foodAmount=" + foodAmount + ", foodConsumed="
				+ foodConsumed + ", getFoodCousumed()=" + getFoodCousumed()
				+ ", hungry()=" + hungry() + ", getGenderString()="
				+ getGenderString() + ", getfoodPreferencesString()="
				+ getfoodPreferencesString() + "]";
	}

}
