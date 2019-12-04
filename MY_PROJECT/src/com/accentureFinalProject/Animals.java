package com.accentureFinalProject;

import java.util.Scanner;

public class Animals {
	private String name;
	private String habitat;
	private boolean hungry;
	private double foodAmount;
	private boolean isAsleep;
	private boolean gender;
	private HappinessLevel happynessLevel; // make new class for hapiness with
											// max, min,
	private boolean foodPreferences;
	private double foodConsumed;
	static Scanner scanner = new Scanner(System.in);

	public Animals(String name, String habitat, double foodAmount,
			boolean gender, boolean foodPreferences, double foodConsumed) {
		this.name = name;
		this.habitat = habitat;
		this.gender = gender;
		this.foodPreferences = foodPreferences;
		this.foodAmount = foodAmount;
		this.foodConsumed = foodConsumed;

	}

	public Animals(String name, String habitat, boolean hungry,
			int dailyFoodAmount, boolean isAsleep, boolean gender,
			int happinessLevel) {
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
		if (isAsleep = IsAsleep.isAsleep) {
			System.out.println("Your animal is sleeping! Shhhh!");
		}
		System.out.println("After sharing food " + getName() + " has "
				+ (this.foodAmount = anotherAnimal.foodAmount / 2)
				+ " kilograms of food!");
		System.out.println("But " + anotherAnimal.name + " "
				+ (anotherAnimal.foodAmount = this.foodAmount / 2)
				+ " kilograms of food!");
	}

	public void makeABaby(Animals anotherAnimal) {
		if (isAsleep = IsAsleep.isAsleep) {
			System.out.println("Your animal is sleeping! Shhhh!");
			return;
		}
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
		if (isAsleep = IsAsleep.isAsleep) {
			System.out.println("Your animal is sleeping! Shhhh!");
		}
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
		if (isAsleep = IsAsleep.isAsleep) {
			System.out.println("Your animal is sleeping! Shhhh!");
		} else {

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
	}

	public void giveFood() {
		if (isAsleep = IsAsleep.isAsleep) {
			System.out.println("Your animal is sleeping! Shhhh!");
		} else {

			System.out
					.println("What food do you want to give to your animal? Choose: ball, meat, grass.");
			String input1 = scanner.nextLine();
			switch (input1) {
			case "ball":
				System.out.println("Sorry your animal doesn't eat " + input1
						+ happynessLevel.decrease() + " happy");
				foodConsumed = 0;
				break;
			case "meat":
				if (foodPreferences == FoodPreferences.predator) {
					System.out.println("You have fed the animal with " + input1
							+ " and your animal now is "
							+ happynessLevel.increase() + " happy");
					foodConsumed = foodAmount;
				} else {
					System.out
							.println("Sorry your animal is herbivore and doesn't eat "
									+ input1
									+ happynessLevel.decrease()
									+ " happy");
					foodConsumed = 0;
				}
				break;
			case "grass":
				if (foodPreferences == FoodPreferences.herbivore) {
					System.out.println("You have fed the animal with " + input1
							+ " and your animal now is "
							+ happynessLevel.increase() + " happy");
					foodConsumed = foodAmount;
				} else {
					System.out
							.println("Sorry your animal is predator and doesn't eat "
									+ input1
									+ happynessLevel.decrease()
									+ " happy.");
					foodConsumed = 0;
				}
				break;
			default:
				System.out.println("Sorry your animal doesn't eat " + input1
						+ happynessLevel.decrease() + " happy");
			}
		}
	}

	public void play() {
		if (isAsleep = IsAsleep.isAsleep) {
			System.out.println("Your animal is sleeping! Shhhh!");
		} else {

			System.out
					.println("How do you want to play? (Choose: ball, frisbee or staffed rabbit).");
			String input2 = scanner.nextLine();
			switch (input2) {
			case "ball":
				System.out.println("You have played with the " + input2
						+ " and your animal now is "
						+ happynessLevel.increase() + " happy");
				break;
			case "frisbee":
				System.out.println("You have played with the " + input2
						+ " and your animal now is "
						+ happynessLevel.increase() + " happy");
				break;
			case "staffed rabbit":
				System.out.println("You have played with the " + input2
						+ " and your animal now is "
						+ happynessLevel.increase() + " happy");
				break;
			default:
				System.out.println("Sorry you cannot play with the " + input2
						+ happynessLevel.decrease() + " happy");
			}
		}
	}

	public void changeHabitat() { // scanner

		System.out.println("Enter the new home for your animal:");
		String input3 = scanner.nextLine();
		System.out.println("Animal now lives in " + input3);
	}

	public double increaseFoodAmount(double foodAmmount) {
		foodAmount = foodAmount + foodAmmount;
		return foodAmount;
	}

	public void hungry() {
		happynessLevel.reset();
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

	//public String GetHappynessLevelString(){
	//	return System.out.println("your animal`s happyness level is " + Integer.toString(happynessLevel.getHappynessLevel()));
	//}
	
	public String toString() {
		return "Animals [name =" + name + ", habitat = " + habitat
				+ ", hungry = " + hungry +" food consumed = "+ foodConsumed +", FoodAmount = " + foodAmount
				+ getIsAsleepString() + ", gender =" + getGenderString()
				+ ", happiness Level = " + happynessLevel + "]";
	}
}