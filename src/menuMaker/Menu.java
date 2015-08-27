package menuMaker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {
	private ArrayList<Recipe> menuList;
	private int daysRequested = 0;
	private ArrayList<Recipe> recipesAvailable;
	private Random rand;
	private boolean allowRepeats = false;
	private int daysCovered = 0;
	
	public Menu() {
		menuList = new ArrayList<Recipe>();
		recipesAvailable = new ArrayList<Recipe>();
		rand = new Random(System.nanoTime());
	}
	
	public void fillMenu(int numberDays) {
		int recipeSelection = 0;
		daysCovered = 0;
		while (daysCovered < numberDays) {
			Recipe pickedRecipe;
			recipeSelection = rand.nextInt(100000) % recipesAvailable.size();
			pickedRecipe = recipesAvailable.get(recipeSelection);
			if ((daysCovered + pickedRecipe.getDaysUseable() <= numberDays)) {
				menuList.add(pickedRecipe);
				daysCovered += pickedRecipe.getDaysUseable();
				if (!allowRepeats) {
					recipesAvailable.remove(recipeSelection);
				}
			}
		}
	}
	
	public void addRecipe(Recipe recipe) {
		recipesAvailable.add(recipe);
	}
	
	public void clearMenu() {
		menuList.clear();
	}
	
	public void printMenu() {
		for (int i=0; i<menuList.size(); i++) {
			System.out.println(menuList.get(i));
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.printMenu();
		
	}

	public ArrayList<Recipe> getMenuList() {
		return menuList;
	}

	public int getDaysRequested() {
		return daysRequested;
	}
	
	public boolean getAllowRepeats(){
		return allowRepeats;
	}
	
	public void setAllowRepeats(boolean repeats) {
		allowRepeats = repeats;
	}
	public int getDaysCovered() {
		return daysCovered;
	}
}
