package com.accentureFinalProject;

public class HappinessLevel {
	public int maxHappiness;
	public int minHappiness;
	public int happinessLevel;

	public int icreaseHappiness(int number) {
		happinessLevel = happinessLevel + number;
		return happinessLevel;
	}

	public int decreaseHappiness(int number) {
		happinessLevel = happinessLevel - number;
		return happinessLevel;
	}

}
