package com.accentureFinalProject;

public class HappinessLevel {
	public static final int maxHappiness = 100;
	public static final int minHappiness = 0;
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
