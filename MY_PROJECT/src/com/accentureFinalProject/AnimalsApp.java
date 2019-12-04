package com.accentureFinalProject;

public class AnimalsApp {

	public static void main(String[] args) {
		Animals monkey = new Animals("Monkey", "Tree",50, Gender.male, FoodPreferences.herbivore, 0, 0);
		Animals giraffe = new Animals("Giraffe", "Savanna",70, Gender.female, FoodPreferences.herbivore, 0, 0);
		Animals tiger = new Animals ("Tiger", "Rainy forest",90, Gender.male, FoodPreferences.predator, 0, 0);
		//System.out.println(tiger.toString());
		
//		monkey.setFoodAmount(20);
//		System.out.println(monkey.getFoodAmount());
//		monkey.increaseFoodAmount(20);
//		System.out.println(monkey.getFoodAmount());
//		System.out.println(monkey);
//		System.out.println(giraffe);
//		
//		
//		
//		
//		monkey.stealFood(tiger, 15);
//		monkey.getFoodAmount();
//		tiger.getFoodAmount();
//		
//		tiger.shareFood(giraffe);
//		tiger.getFoodAmount();
//		giraffe.getFoodAmount();
//		
tiger.startGame();
//monkey.play();
//monkey.giveFood();
//monkey.changeHabitat();		
		 
		 }
		
	

	}


