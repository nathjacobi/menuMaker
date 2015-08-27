package menuMaker;

import java.util.ArrayList;

public class Recipe {
	private ArrayList<Item> recipeItems;
	private String name;
	private int daysUseable;
	
	public Recipe(String name, int daysUseable) {
		recipeItems = new ArrayList<Item>();
		this.name = name;
		this.daysUseable = daysUseable;
	}

	@Override
	public String toString() {
		return "Recipe [recipeItems=" + recipeItems + ", name=" + name + "]";
	}

	public int getDaysUseable() {
		// TODO Auto-generated method stub
		return daysUseable;
	}
	
	
}
