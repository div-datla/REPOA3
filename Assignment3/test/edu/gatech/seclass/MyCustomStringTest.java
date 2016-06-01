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

	@Test
	public void testCountDigits2() {
		fail("Not yet implemented");
	}

	@Test
	public void testCountDigits3() {
		fail("Not yet implemented");
	}

	@Test
	public void testCountDigits4() {
		fail("Not yet implemented");
	}

    @Test
    public void testGetEveryNthCharacter1() {
        mycustomstring.setString("I'd better put s10me d1gits in this 5tr1n9, right?");
        assertEquals("deep 0 gsnh r9rh", mycustomstring.getEveryNthCharacter(3));
    }

	@Test
	public void testGetEveryNthCharacter2() { fail("Not yet implemented"); }

	@Test
	public void testGetEveryNthCharacter3() { fail("Not yet implemented"); }

	@Test
	public void testGetEveryNthCharacter4() {
		fail("Not yet implemented");
	}

    @Test
    public void testGetEveryNthCharacter5() {
        fail("Not yet implemented");
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd better put s10me d1gits in this 5tr1n9, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd better put sTenme dOnegits in this 5tr1n9, right?", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring2() { fail("Not yet implemented"); }

    @Test
    public void testConvertDigitsToNamesInSubstring3() { fail("Not yet implemented"); }

    @Test
    public void testConvertDigitsToNamesInSubstring4() { fail("Not yet implemented"); }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring5() { fail("Not yet implemented"); }

    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring6() { fail("Not yet implemented"); }

}
