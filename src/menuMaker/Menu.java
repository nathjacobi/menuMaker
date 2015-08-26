package menuMaker;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<Recipe> menuList;
	int daysRequested = 0;
	
	public Menu() {
		menuList = new ArrayList<Recipe>();
	}
	
	public void fillMenu(int numberDays) {
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
	
	
}
