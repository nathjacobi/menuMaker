package unitTests;

import static org.junit.Assert.*;

import org.junit.*;

import menuMaker.*;

public class MenuTests {
	private static Menu mainMenu;
	
	@Before
	public void setup() {
		mainMenu = new Menu();
	}
	
	@Test
	public void checkMenuFilling(){
		int testValue1 = 14;
		int testValue2 = 10;
		int testValue3 = 7;
		
		mainMenu.fillMenu(testValue1);
		assertTrue(mainMenu.getMenuList().size() == testValue1);
		
		mainMenu.clearMenu();
		
		mainMenu.fillMenu(testValue2);
		assertTrue(mainMenu.getMenuList().size() == testValue2);
		
		mainMenu.clearMenu();
		
		mainMenu.fillMenu(testValue3);
		assertTrue(mainMenu.getMenuList().size() == testValue3);
	}
	
	@Test
	public void checkRecipeAdded(){
		Recipe milkChickenRecipe = new Recipe("Milk Chicken", 2);
		Recipe bbqChicken = new Recipe("BBQ Chicken", 1);
		Recipe beefRoast = new Recipe("Beef Roast", 3);
		
		mainMenu.addRecipeToMenu(milkChickenRecipe);
		mainMenu.addRecipeToMenu(beefRoast);
		mainMenu.addRecipeToMenu(bbqChicken);
		
		mainMenu.fillMenu(6);
		assertTrue(mainMenu.getMenuList().contains(milkChickenRecipe));
		assertTrue(mainMenu.getMenuList().contains(bbqChicken));
		assertTrue(mainMenu.getMenuList().contains(beefRoast));
		
	}
	
	@Test
	public void checkMenuCoversDays() {
		Recipe milkChickenRecipe = new Recipe("Milk Chicken", 2);
		Recipe bbqChicken = new Recipe("BBQ Chicken", 1);
		Recipe beefRoast = new Recipe("Beef Roast", 3);
		
		int daysCovered = 0;
		int testValue1 = 5;
		int testValue2 = 4;
		
		mainMenu.fillMenu(testValue1);
		for (Recipe recipe : mainMenu.getMenuList()) {
			daysCovered += recipe.getDaysUseable();
		}
		assertTrue(testValue1 == daysCovered);
		
		mainMenu.fillMenu(testValue2);
		for (Recipe recipe : mainMenu.getMenuList()) {
			daysCovered += recipe.getDaysUseable();
		}
		assertTrue(testValue2 == daysCovered);
	}
}
