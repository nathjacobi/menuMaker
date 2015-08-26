package menuMaker;

import java.util.ArrayList;

public class Recipe {
	ArrayList<Item> recipeItems;
	String name;
	int daysUseable;
	
	public Recipe(String name, int daysUseable) {
		recipeItems = new ArrayList<Item>();
		this.name = name;
		this.daysUseable = daysUseable;
	}

	@Override
	public String toString() {
		return "Recipe [recipeItems=" + recipeItems + ", name=" + name + "]";
	}
	
	
}
