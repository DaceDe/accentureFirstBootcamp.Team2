package com.accentureFinalProject;

public class AnimalsApp {

	public static void main(String[] args) {
		Animals monkey = new Animals("Monkey", "Tree", Gender.male, 50);
		Animals giraffe = new Animals("Giraffe", "Savanna", Gender.female, 70);
		monkey.setDailyFoodAmount(20);
		System.out.println(monkey.getDailyFoodAmount());
		monkey.increaseFoodAmount(20);
		System.out.println(monkey.getDailyFoodAmount());
		System.out.println(monkey);
		System.out.println(giraffe);
	}

}
