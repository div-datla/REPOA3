package edu.gatech.seclass;

/**
 * This is an interface for a simple class that represents a string, defined
 * as a sequence of characters.
 * 
 * @author Rufus
 * 
 */
public interface MyCustomStringInterface {

	/**
	 * Sets the value of the current string.
	 * 
	 * @param string
	 *            The value to be set
	 */
	void setString(String string);

	/**
	 * Returns the current string
	 * 
	 * @return Current string
	 */
	String getString();

	/**
	 * Returns a string that consists of all and only the characters
	 * in positions n, 2n, 3n, and so on in the current string, in the 
	 * same order and with the same case as in the current string (i.e., 
	 * for n=3, the method would return the 3rd, 6th, 9th, and so on 
	 * characters in the string). Value n is passed as a parameter. The 
	 * first character in the string is considered to be in Position 1.
	 * 
	 * @param n
	 *            Determines the positions of the characters to be returned
	 * @return String made of characters at positions n, 2n, and so on
	 * in the current string
	 */
	String getEveryNthCharacter(int n);

	/**
	 * Returns the number of digits in the current string
	 * 
	 * @return Number of digits in the current string
	 */
	int countDigits();
	
	/**
	 * Replace the individual digits (except in the case of "10", as
     * explained below) in the current string, between startPosition and
     * endPosition (included), with the corresponding English names of
     * those digits, with the first letter capitalized.
	 * The first character in the string is considered to be in Position 1.
	 * Digits are converted individually, even if contiguous, with the only
     * exception of "10", which is converted to "Ten". Some examples:
     * - 460 would be converted to FourSixZero
     * - 410 would be converted to FourTen
     * - 416 would be converted to FourOneSix
	 * 
	 * @param startPosition
	 *            Position of the first character to consider
	 * @param endPosition
	 *            Position of the last character to consider
	 * @return
     * @throws IllegalArgumentException
     *            If "startPosition" > "endPosition"
	 * @throws MyIndexOutOfBoundsException
	 *            If "startPosition" <= "endPosition", but either
     *            "startPosition" or "endPosition" are out of
	 *            bounds (i.e., either less than 1 or greater then the
	 *            length of the string)
	 */
	void convertDigitsToNamesInSubstring(int startPosition, int endPosition)
			throws MyIndexOutOfBoundsException, IllegalArgumentException;
}
