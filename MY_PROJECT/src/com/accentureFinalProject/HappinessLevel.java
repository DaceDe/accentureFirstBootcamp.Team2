package com.accentureFinalProject;

public class HappinessLevel {
	private static final int maxHappyness = 4;
	private static final int minHappyness = 0;
	public int happynessLevel;

	public int increase() {
		happynessLevel++;
		if (happynessLevel > maxHappyness) {
			happynessLevel = maxHappyness;
		}
		return happynessLevel;
	}

	public int decrease() {

		happynessLevel--;
		if (happynessLevel < minHappyness) {
			happynessLevel = minHappyness;
		}
		return happynessLevel;
	}

	public int reset() {
		happynessLevel = minHappyness;
		return happynessLevel;
	}

	public boolean isMax() {
		return happynessLevel == maxHappyness;
	}

}
