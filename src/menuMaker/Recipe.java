package menuMaker;

import java.util.ArrayList;

public class Recipe {
	ArrayList<Item> recipeItems;
	String name;
	int daysUseable = 0;
	
	public Recipe(String name) {
		recipeItems = new ArrayList<Item>();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Recipe [recipeItems=" + recipeItems + ", name=" + name + "]";
	}
	
	
}
