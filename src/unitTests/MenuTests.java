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
		
		mainMenu.fillMenu(testValue2);
		assertTrue(mainMenu.getMenuList().size() == testValue2);
		
		mainMenu.fillMenu(testValue3);
		assertTrue(mainMenu.getMenuList().size() == testValue3);
		
	}
}
