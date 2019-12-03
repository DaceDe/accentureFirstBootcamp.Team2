package com.accentureFinalProject;

public class HappinessLevel {
	private static final int maxHappyness = 4;
	private static final int minHappyness = 0;
	public int happynessLevel;

	public int increaseHappyness() {
		happynessLevel++;
		if (happynessLevel > maxHappyness) {
			happynessLevel = maxHappyness;
		}
		return happynessLevel;
	}

	public int decreaseHappyness() {
		
		happynessLevel--;
		if (happynessLevel < minHappyness) {
			happynessLevel = minHappyness;
		}
		return happynessLevel;
	}
	
	public int resetHappyness() {
		happynessLevel = minHappyness;
		return happynessLevel;
	}
	
	public int setmaxHappyness() {
		happynessLevel = maxHappyness;
		return happynessLevel;
	}

}
