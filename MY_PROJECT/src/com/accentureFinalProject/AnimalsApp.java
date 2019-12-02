package com.accentureFinalProject;

public class AnimalsApp {

	public static void main(String[] args) {
		Animals monkey = new Animals("Monkey", "Tree", Gender.male, 50);
		Animals giraffe = new Animals("Giraffe", "Savanna", Gender.female, 70);
		Animals tiger = new Animals ("Tiger", "Rainy forest", Gender.male, 90);
		monkey.setFoodAmount(20);
		System.out.println(monkey.getFoodAmount());
		monkey.increaseFoodAmount(20);
		System.out.println(monkey.getFoodAmount());
		System.out.println(monkey);
		System.out.println(giraffe);
		
		monkey.stealFood(giraffe);
	}

}
