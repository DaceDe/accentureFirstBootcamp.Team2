package com.accentureFinalProject;

import java.util.Scanner;

public class Animal {
	private String name;
	private String habitat;
	private boolean hungry;
	private int foodAmount;
	private boolean gender;
	private HappinessLevel happynessLevel;
	private boolean foodPreferences;
	static Scanner scanner = new Scanner(System.in);

	public Animal(String name, String habitat, int foodAmount, boolean gender, boolean foodPreferences,
			double foodConsumed, int happynessLevel) {
		this.name = name;
		this.habitat = habitat;
		this.gender = gender;
		this.foodPreferences = foodPreferences;
		this.foodAmount = foodAmount;
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

	public void setFoodAmount(int foodAmount) {
		this.foodAmount = foodAmount;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public boolean isFoodPreferences() {
		return foodPreferences;
	}

	public void setFoodPreferences(boolean foodPreferences) {
		this.foodPreferences = foodPreferences;
	}

	public void shareFood(Animal anotherAnimal) {
		if (this == anotherAnimal) {
			System.out.println("You can`t share food with yourself!");
		} else {
			int toShare = this.foodAmount / 2;
			anotherAnimal.foodAmount += toShare;
			this.foodAmount -= toShare;
			System.out.println(this.name + " has shared " + toShare + " with " + anotherAnimal.name +
					" and now has " + this.happynessLevel.increase() + " level happy.\n"
					+ anotherAnimal.name + " now has "+ anotherAnimal.happynessLevel.increase() + " level happy");
		}
	}

	public boolean makeABaby(Animal anotherAnimal) {
		if (this == anotherAnimal) {
			System.out.println("You can`t make a baby alone!");
			return false;
		}
		if (this.happynessLevel.isMax() && anotherAnimal.happynessLevel.isMax()
				&& isCompatibleForLove(anotherAnimal) == true) {
			System.out.println("Congratulations! Your animals have a baby! You won!");
			return true;
		} else {
			System.out.println("Your animals can't have a baby!");
			return false;
		}

	}

	private boolean isCompatibleForLove(Animal anotherAnimal) {
		if (this.gender == Gender.female && anotherAnimal.gender == Gender.male
				|| this.gender == Gender.male && anotherAnimal.gender == Gender.female) {
			return true;
		} else {
			return false;
		}
	}

	public void stealFood(Animal anotherAnimal) {
		if (this == anotherAnimal) {
			System.out.println("You can`t steal food from yourself!");
		} else {
			if (anotherAnimal.foodAmount == 0) {
				System.out.println(name + " hasn't stole anything since " + anotherAnimal.name + " had no food");
				return;
			}
			this.foodAmount += anotherAnimal.foodAmount;
			anotherAnimal.foodAmount = 0;
			System.out.println(name + " has stolen all the food from " + anotherAnimal.name + " and now has "
					+ this.foodAmount + " food" + " and " + this.happynessLevel.increase() + " level happy.\n" +
					anotherAnimal.name + " now has "
					+ anotherAnimal.foodAmount + " food" + " and " + anotherAnimal.happynessLevel.decrease() + " level happy." );
		}
	}

	public void eat(String food) {
		if (food == null) {
			System.out.println(
					"Sorry, " + name + " doesn't eat that and now is " + happynessLevel.decrease() + " level happy.");
		} else {
			switch (food) {
			case "ball":
				System.out.println("Sorry, " + name + " doesn't eat ball and now is " + happynessLevel.decrease()
						+ " level happy");
				break;
			case "meat":
				if (foodPreferences == FoodPreferences.predator) {
					System.out.println("You have fed the " + name + " with meat and now is " + happynessLevel.increase()
							+ " level happy.");
				} else {
					System.out.println("Sorry, " + name + " is herbivore and doesn't eat meat and now is "
							+ happynessLevel.decrease() + " level happy.");
				}
				break;
			case "grass":
				if (foodPreferences == FoodPreferences.herbivore) {
					System.out.println("You have fed the " + name + " with grass and now is "
							+ happynessLevel.increase() + " level happy.");
				} else {
					System.out.println("Sorry, " + name + " is predator and doesn't eat grass and now is  "
							+ happynessLevel.decrease() + " level happy.");
				}
				break;
			}
		}
	}

	public void play(String toy) {
		if (toy != null) {
			System.out.println("You have played with " + toy + " and " + name + " now is level "
					+ happynessLevel.increase() + " happy");
		} else {
			System.out.println("You cannot play with that: " + happynessLevel.decrease() + " happy");
		}
	}

	public void changeHabitat(String habitat) { 
		this.habitat = habitat;
		System.out.println("Animal now lives in " + habitat);
	}

	public String getGenderString() {
		return gender == Gender.female ? "FEMALE" : "MALE";
	}

	public String getfoodPreferencesString() {
		return foodPreferences == FoodPreferences.herbivore ? "herbivore" : "predator";
	}

	public String toString() {
		return name + ". It leaves in " + habitat + ", has to eat " + foodAmount + " killograms of food, "
				+ " gender is " + getGenderString() + " and it " + getfoodPreferencesString() + "\n";
	}

}
