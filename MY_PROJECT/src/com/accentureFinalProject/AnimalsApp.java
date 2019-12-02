package com.accentureFinalProject;

public class AnimalsApp {

	public static void main(String[] args) {
		Animals monkey = new Animals("Monkey", "Tree", Gender.male, 50, FoodPreferences.herbivore);
		Animals giraffe = new Animals("Giraffe", "Savanna", Gender.female, 70, FoodPreferences.herbivore);
		Animals tiger = new Animals ("Tiger", "Rainy forest", Gender.male, 90, FoodPreferences.herbivore);
//		monkey.setFoodAmount(20);
//		System.out.println(monkey.getFoodAmount());
//		monkey.increaseFoodAmount(20);
//		System.out.println(monkey.getFoodAmount());
//		System.out.println(monkey);
//		System.out.println(giraffe);
		
		monkey.stealFood(giraffe, 30);
		System.out.println(monkey.getFoodAmount());
		System.out.println(giraffe.getFoodAmount());
		
		//monkey.play();
		
	}

}
