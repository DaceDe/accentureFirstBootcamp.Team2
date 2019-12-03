package com.accentureFinalProject;

public class AnimalsApp {

	public static void main(String[] args) {
		Animals monkey = new Animals("Monkey", "Tree",50, Gender.male, FoodPreferences.herbivore, 0);
		Animals giraffe = new Animals("Giraffe", "Savanna",70, Gender.female, FoodPreferences.herbivore, 0);
		Animals tiger = new Animals ("Tiger", "Rainy forest",90, Gender.male, FoodPreferences.herbivore, 0);
		monkey.setFoodAmount(20);
		System.out.println(monkey.getFoodAmount());
		monkey.increaseFoodAmount(20);
		System.out.println(monkey.getFoodAmount());
		System.out.println(monkey);
		System.out.println(giraffe);
		
		monkey.stealFood(giraffe, 30);
		System.out.println(monkey.getFoodAmount());
		System.out.println(giraffe.getFoodAmount());
		
		//monkey.play();
		
	}

}
