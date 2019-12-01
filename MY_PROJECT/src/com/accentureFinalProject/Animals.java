package com.accentureFinalProject;

public class Animals {
	private String name;
	private String habitat;
	private boolean hungry;
	private int dailyFoodAmount;
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

	public Animals(String name, String habitat, boolean hungry, int dailyFoodAmount, int requiredSleepAmount,
			boolean isAsleep, boolean gender, int happinessLevel) {
		this.name = name;
		this.habitat = habitat;
		this.hungry = hungry;
		this.dailyFoodAmount = dailyFoodAmount;
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

	public int getDailyFoodAmount() {
		return dailyFoodAmount;
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

	public void setDailyFoodAmount(int dailyFoodAmount) {
		this.dailyFoodAmount = dailyFoodAmount;
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

	public void stealFood(Animals anotherAnimal) { // interaction with other obj

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

	public void putAsleep() {
		if (isAsleep) {
			System.out.println(name + " is sleeping! Be quiet!");
		} else {
			System.out.println(name + " is awake! Hurray!");
		}

	}

	public int increaseFoodAmount(int foodAmmount) {
		dailyFoodAmount = dailyFoodAmount + foodAmmount;
		return dailyFoodAmount;
	}

	public void hungry() {

	}

	private String getGenderString() {
		return gender == Gender.female ? "FEMALE" : "MALE";
	}

	public String toString() {
		return "Animal(Gender=" + getGenderString() + ")";
	}

}
