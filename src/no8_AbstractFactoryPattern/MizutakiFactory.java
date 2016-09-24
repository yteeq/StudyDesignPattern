package no8_AbstractFactoryPattern;

import java.util.ArrayList;
import java.util.List;

public class MizutakiFactory extends Factory{
	public Soup getSoup(){
		return new ChickenBonesSoup();
	}
	public Protein getMain(){
		return new Chicken();
	}
	public List<Vegetable> getVegetables(){
		List<Vegetable> vegetables = new ArrayList<Vegetable>();
		vegetables.add(new ChineseCabbage()); // ”’Ø
		vegetables.add(new Leek()); // ‚Ë‚¬
		vegetables.add(new Chrysanthemum()); // t‹e
		return vegetables;
	}
	public List<Ingredients> getOtherIngredients(){
		List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
		otherIngredients.add(new Tohu()); // “¤•…
		return otherIngredients;
	}
}
