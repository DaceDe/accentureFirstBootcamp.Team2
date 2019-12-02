package com.accentureFinalProject;

public class Animals {
	private String name;
	private String habitat;
	private boolean hungry;
	private double FoodAmount;
	private int requiredSleepAmount;
	private boolean isAsleep;
	private boolean gender; // make new class for gender
	private int happinessLevel; // make new class for hapiness with max, min, increase, decrease methods and
								// fields

	public Animals(String name, String habitat, boolean gender, int happinessLevel) {
		this.name = name;
		this.habitat = habitat;
		this.gender = gender;
		this.happinessLevel = happinessLevel;
	}

	public Animals(String name, String habitat, boolean hungry, int FoodAmount, int requiredSleepAmount,
			boolean isAsleep, boolean gender, int happinessLevel) {
		this.name = name;
		this.habitat = habitat;
		this.hungry = hungry;
		this.FoodAmount = FoodAmount;
		this.requiredSleepAmount = requiredSleepAmount;
		this.isAsleep = isAsleep;
		this.gender = gender;
		this.happinessLevel = happinessLevel;
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
		return FoodAmount;
	}

	public int getRequiredSleepAmount() {
		return requiredSleepAmount;
	}

	public boolean isAsleep() {
		return isAsleep;
	}

	public boolean isGender() {
		return gender;
	}

	public int getHappinessLevel() {
		return happinessLevel;
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

	public void setFoodAmount(double FoodAmount) {
		this.FoodAmount = FoodAmount;
	}

	public void setRequiredSleepAmount(int requiredSleepAmount) {
		this.requiredSleepAmount = requiredSleepAmount;
	}

	public void setAsleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public void setHappinessLevel(int happinessLevel) {
		this.happinessLevel = happinessLevel;
	}
	
	

	public void stealFood(Animals anotherAnimal, double stolenFoodAmount) { // interaction with other obj
		
		double totalFood =
		System.out.println(totalFood);
	}

	public void shareFood(Animals anotherAnimal) { // interaction with other obj

	}

	public void makeABaby(Animals anotherAnimal) { // interaction with other obj

	}

	public void giveFood(int foodAnount) { // scanner

	}

	public void play(int hours) { // scanner

	}

	public void changeHabitat(String habitat) { // scanner

	}

	public double  increaseFoodAmount(double foodAmmount) {
		FoodAmount = FoodAmount + foodAmmount;
		return FoodAmount;
	}

	public void hungry() {
		

	}

	public String getGenderString() {
		return gender == Gender.female ? "FEMALE" : "MALE";
	}

	public String getIsAsleepString() {
		return isAsleep == IsAsleep.awake ? "Awake" : "Is sleeping";
	}


	public String toString() {
		return "Animals [name =" + name + ", habitat = " + habitat + ", hungry = " + hungry + ", dailyFoodAmount = "
				+ FoodAmount + ", required Sleep Amount =" + requiredSleepAmount + ", isAsleep=" + getIsAsleepString()
				+ ", gender =" + getGenderString() + ", happiness Level =" + happinessLevel + "]";
	}

}
