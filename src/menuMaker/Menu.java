package menuMaker;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<Recipe> menuList;
	int daysRequested = 0;
	
	public Menu() {
		menuList = new ArrayList<Recipe>();
		fillMenu();
	}
	
	
	
	private void fillMenu() {
		System.out.println("How many days do you want to plan for: ");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		
		daysRequested = Integer.parseInt(userInput);
		
		for (int i=0; i<daysRequested; i++) {
			menuList.add(new Recipe("a"));
		}
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
}
