package com.accentureFinalProject;

import java.util.Scanner;

public class Animals {
	private String name;
	private String habitat;
	private boolean hungry;
	private double foodAmount;
	private boolean isAsleep;
	private boolean gender; 
	private HappinessLevel happynessLevel; // make new class for hapiness with max, min,
	private boolean foodPreferences;
	private double foodConsumed;

	public Animals(String name, String habitat,double foodAmount, boolean gender,
		 boolean foodPreferences, double foodConsumed) {
		this.name = name;
		this.habitat = habitat;
		this.gender = gender;
		this.foodPreferences = foodPreferences;
		this.foodAmount = foodAmount;
		this.foodConsumed = foodConsumed;
		
	}

	public Animals(String name, String habitat, boolean hungry,
			int dailyFoodAmount, boolean isAsleep,
			boolean gender, int happinessLevel) {
		this.name = name;
		this.habitat = habitat;
		this.hungry = hungry;
		this.foodAmount = foodAmount;
		this.isAsleep = isAsleep;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getHabitat() {
		return habitat;
	}

	public boolean isHungry() {
		return hungry;
	}

	public double getFoodAmount() {
		return foodAmount;
	}

	public boolean isAsleep() {
		return isAsleep;
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

	public void setAsleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
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
	}

	public void makeABaby(Animals anotherAnimal) { 
	}

	public void stealFood(Animals anotherAnimal, double stolenFoodAmount) { 
		this.foodAmount+=stolenFoodAmount;
		anotherAnimal.foodAmount -= stolenFoodAmount;
	}

	public void startGame() {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Hello, please choose what do you want to do with you animal: play, give food or change habitat: ");
		String input3 = scanner.nextLine();
		switch (input3) {
		case "play":
			play();
			break;
		case "give food":
			giveFood();
			break;
		case "change habitat":
			changeHabitat();
			break;
		default:
			System.out.println("Sorry your animal doesn't like " + input3);
		}
	}

	public void giveFood() { // scanner
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("What food do you want to give to your animal? Choose: ball, meat, grass.");
		String input1 = scanner.nextLine();
		switch (input1) {
		case "ball":
			System.out.println("Sorry your animal doesn't eat " + input1+ happynessLevel.decreaseHappyness()+" happy" );
			foodConsumed = 0;
			break;
		case "meat":
			if (foodPreferences == FoodPreferences.predator) {
				System.out.println("You have fed the animal with " + input1
						+ " and your animal now is " + happynessLevel.increaseHappyness() +" happy");
				foodConsumed = foodAmount;
			} else {
				System.out
						.println("Sorry your animal is herbivore and doesn't eat "
								+ input1 + happynessLevel.decreaseHappyness()+" happy" );
						foodConsumed =0;
			}
			break;
		case "grass":
			if (foodPreferences == FoodPreferences.herbivore) {
				System.out.println("You have fed the animal with " + input1
						+ " and your animal now is " + happynessLevel.increaseHappyness()+" happy"  );
				foodConsumed = foodAmount;
			} else {
				System.out
						.println("Sorry your animal is predator and doesn't eat "
								+ input1 + happynessLevel.decreaseHappyness()+" happy.");
				foodConsumed = 0;
			}
			break;
		default:
			System.out.println("Sorry your animal doesn't eat " + input1 + happynessLevel.decreaseHappyness()+" happy" );
		}
	}

	public void play() { // scanner
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("How do you want to play? (Choose: ball, frisbee or staffed rabbit).");
		String input2 = scanner.nextLine();
		switch (input2) {
		case "ball":
			System.out.println("You have played with the " + input2
					+ " and your animal now is " + happynessLevel.increaseHappyness() +" happy");
			break;
		case "frisbee":
			System.out.println("You have played with the " + input2
					+ " and your animal now is " + happynessLevel.increaseHappyness()+" happy");
			break;
		case "staffed rabbit":
			System.out.println("You have played with the " + input2
					+ " and your animal now is " + happynessLevel.increaseHappyness()+" happy");
			break;
		default:
			System.out.println("Sorry you cannot play with the " + input2 + happynessLevel.decreaseHappyness()+" happy");
		}
	}

	public void changeHabitat() { // scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the new home for your animal:");
		String input3 = scanner.nextLine();
		System.out.println("Animal now lives in " + input3);
	}

	public double increaseFoodAmount(double foodAmmount) {
		foodAmount = foodAmount + foodAmmount;
		return foodAmount;
	}

	public void hungry() {
		happynessLevel.resetHappyness();
		foodConsumed = 0;
		
	}
	public void putAsleep() {
		isAsleep = IsAsleep.isAsleep;
		
	}

	public String getGenderString() {
		return gender == Gender.female ? "FEMALE" : "MALE";
	}

	public String getIsAsleepString() {
		return isAsleep == IsAsleep.awake ? ", Awake" : ", Is sleeping";
	}

	@Override
	public String toString() {
		return "Animals [name =" + name + ", habitat = " + habitat
				+ ", hungry = " + hungry + ", FoodAmount = " + foodAmount
				 + getIsAsleepString() + ", gender ="
				+ getGenderString() + ", happiness Level =" + happynessLevel
				+ "]";
	}
}