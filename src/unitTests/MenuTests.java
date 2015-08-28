package unitTests;

import static org.junit.Assert.*;

import org.junit.*;

import menuMaker.*;

public class MenuTests {
	private static Menu mainMenu;
	
	private static Recipe milkChickenRecipe;
	private static Recipe bbqChicken;
	private static Recipe beefRoast;
	
	@Before
	public void setup() {
		mainMenu = new Menu();

		milkChickenRecipe = new Recipe("Milk Chicken", 2);
		bbqChicken = new Recipe("BBQ Chicken", 1);
		beefRoast = new Recipe("Beef Roast", 3);

		mainMenu.addRecipe(milkChickenRecipe);
		mainMenu.addRecipe(beefRoast);
		mainMenu.addRecipe(bbqChicken);
	}

	@Test
	public void checkMenuFilling(){
		mainMenu.setAllowRepeats(true);

		int testValue1 = 14;
		int testValue2 = 10;
		int testValue3 = 7;

		mainMenu.fillMenu(testValue1);
		assertTrue(mainMenu.getDaysCovered() == testValue1);

		mainMenu.clearMenu();

		mainMenu.fillMenu(testValue2);
		assertTrue(mainMenu.getDaysCovered() == testValue2);

		mainMenu.clearMenu();

		mainMenu.fillMenu(testValue3);
		assertTrue(mainMenu.getDaysCovered() == testValue3);
	}

	@Test
	public void checkRecipeAdded(){		
		mainMenu.setAllowRepeats(false);

		mainMenu.fillMenu(6);
		assertTrue(mainMenu.getMenuList().contains(milkChickenRecipe));
		assertTrue(mainMenu.getMenuList().contains(bbqChicken));
		assertTrue(mainMenu.getMenuList().contains(beefRoast));

	}

	@Test
	public void checkMenuCoversDaysWithRepeats() {
		int testValue1 = 5;
		int testValue2 = 4;

		mainMenu.setAllowRepeats(true);

		mainMenu.fillMenu(testValue1);
		assertTrue(testValue1 == mainMenu.getDaysCovered());

		mainMenu.fillMenu(testValue2);
		assertTrue(testValue2 == mainMenu.getDaysCovered());
	}
	
	@Test
	public void checkRecipeRemovedAfterRepeatCap() {
		Recipe hamSteak = new Recipe("Ham Steak", 1);
		Menu testMenu = new Menu();
		
		testMenu.setAllowRepeats(true);
		
		testMenu.addRecipe(hamSteak);
		testMenu.fillMenu(3);
		
		assertFalse(testMenu.getRecipesAvailable().contains(hamSteak));
		
	}
}
