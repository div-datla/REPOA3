package edu.gatech.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyCustomStringTest {

	private MyCustomStringInterface mycustomstring;

	@Before
	public void setUp() throws Exception {
		mycustomstring = new MyCustomString();
	}

	@After
	public void tearDown() throws Exception {
		mycustomstring = null;
	}

    @Test
    public void testCountDigits1() {
        mycustomstring.setString("I'd better put s10me d1gits in this 5tr1n9, right?");
        assertEquals(6, mycustomstring.countDigits());
    }

	@Test (expected = NullPointerException.class)
	public void testCountDigits2() {
		mycustomstring.setString(null);
		mycustomstring.countDigits();
	}

	@Test
	public void testCountDigits3() {
		mycustomstring.setString("This string has no digits");
        assertEquals(0, mycustomstring.countDigits());
	}

	@Test
	public void testCountDigits4() {
		mycustomstring.setString("");
        assertEquals(0, mycustomstring.countDigits());
	}

    @Test
    public void testGetEveryNthCharacter1() {
        mycustomstring.setString("I'd better put s10me d1gits in this 5tr1n9, right?");
        assertEquals("deep 0 gsnh r9rh", mycustomstring.getEveryNthCharacter(3));
    }

	@Test
	public void testGetEveryNthCharacter2() { 
		mycustomstring.setString("9 multipl");
        assertEquals("l", mycustomstring.getEveryNthCharacter(9));
	}

	@Test (expected= NullPointerException.class)
	public void testGetEveryNthCharacter3() { 
		mycustomstring.setString(null);
		mycustomstring.getEveryNthCharacter(9);
	}

	@Test (expected= IllegalArgumentException.class)
	public void testGetEveryNthCharacter4() {
		mycustomstring.setString("Small");
		mycustomstring.getEveryNthCharacter(0);
	}

    @Test
    public void testGetEveryNthCharacter5() {
    	mycustomstring.setString("Small");
        assertEquals("l", mycustomstring.getEveryNthCharacter(5));
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd better put s10me d1gits in this 5tr1n9, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd better put sTenme dOnegits in this 5tr1n9, right?", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring2() { 
    	mycustomstring.setString("Ar9ument5 fr0m fir57 t10 las7 posi7ion");
        mycustomstring.convertDigitsToNamesInSubstring(1, 38);
        assertEquals("ArNineumentFive frZerom firFiveSeven tTen lasSeven posiSevenion", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring3() { 
    	mycustomstring.setString("00101100");
    	mycustomstring.convertDigitsToNamesInSubstring(1, 8);
    	assertEquals("ZeroZeroTenOneTenZero", mycustomstring.getString()); }

    @Test (expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring4() { 
    	mycustomstring.setString(null);
    	mycustomstring.convertDigitsToNamesInSubstring(1, 8); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring5() { 
    	mycustomstring.setString("Small String");
        mycustomstring.convertDigitsToNamesInSubstring(23, 17);
    }

    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring6() { 
    	mycustomstring.setString("Small String");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23); }

}
