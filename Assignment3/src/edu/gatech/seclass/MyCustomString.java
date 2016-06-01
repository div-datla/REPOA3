package edu.gatech.seclass;

public class MyCustomString implements MyCustomStringInterface{
    
	private String inputString;
	
	@Override
	public void setString(String string) {
		this.inputString = string;
		
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return this.inputString;
	}

	@Override
	public String getEveryNthCharacter(int n) {
		// TODO Auto-generated method stub
		int i =1;
		int index = i*n - 1;
		String mystring = this.inputString;
		String newstring = "";
		char letter= '0';

		while (index< mystring.length()) {
			letter = mystring.charAt(index);
			newstring = newstring + Character.toString(letter);
			i++;
			index = i*n - 1;

		}



		return newstring;
	}

	@Override
	public int countDigits() {
		// TODO Auto-generated method stub
		int countDigits=0;
		char nthChar;
		String inputString = this.inputString;
		for (int i =0;i< inputString.length(); i++) {

			nthChar = inputString.charAt(i);
			if (Character.isDigit(nthChar)){
				countDigits++;
			}

		}
		return countDigits;
	}

	@Override
	public void convertDigitsToNamesInSubstring(int startPosition, int endPosition)
			throws MyIndexOutOfBoundsException, IllegalArgumentException {
		// TODO Auto-generated method stub
		if (startPosition > endPosition){
			throw new IllegalArgumentException();
		}
		if (startPosition <1 || endPosition > this.inputString.length()) {
			throw new MyIndexOutOfBoundsException();
		}




		String myString = inputString.substring(startPosition-1, endPosition);
		
		myString = myString.replaceAll("10", "Ten");
		myString = myString.replaceAll("0", "Zero");
		myString = myString.replaceAll("1", "One");
		myString = myString.replaceAll("2", "Two");
		myString = myString.replaceAll("3", "Three");
		myString = myString.replaceAll("4", "Four");
		myString = myString.replaceAll("5", "Five");
		myString = myString.replaceAll("6", "Six");
		myString = myString.replaceAll("7", "Seven");
		myString = myString.replaceAll("8", "Eight");
		myString = myString.replaceAll("9", "Nine");
		

		this.inputString = inputString.substring(0, startPosition-1) + myString 
				+ inputString.substring(endPosition, inputString.length());




	}

}
