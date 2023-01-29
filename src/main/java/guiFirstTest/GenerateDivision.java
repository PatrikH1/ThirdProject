package guiFirstTest;

import guiFirstTest.RandomNumbers;

/**
*  This class generates a random numerator and random denominator. 
*/
public class GenerateDivision {
	private int numerator;
	private int denominator;
	private boolean useFirstNumber;
	RandomNumbers generator;

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	/**
	 * Constructor that initiates all private member variables.
	 * One important member variable is generator that is used
	 * for generating random integer numbers.
	 */
	public GenerateDivision() {
		numerator = 1;
		denominator = 1;	
		useFirstNumber = true;
		generator = new RandomNumbers();
	}
	
	/**
	 * This method generates a random numerator and a random 
	 * denominator. The new random numbers is used by calling
	 * the getters getNumerator() and getDenominator().
	 */
	public void genNumeratorDenominator() {
		int firstNumber = generator.getNextRandomInt();
		int secondNumber = generator.getNextRandomInt();

		numerator = firstNumber * secondNumber;
		 
		// Hopefully we get a more random number by alternate between
		// the first and second number.
		if (useFirstNumber) {
		    denominator = firstNumber;
		    useFirstNumber = false;
		}
		else {
			denominator = secondNumber;
			useFirstNumber = true;
		}			
	}

	/**
	 * Main method that in this case most is a help for testing the class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		GenerateDivision generateDivision = new GenerateDivision();
		int localNumerator;
		int localDenominator;

		for (int i = 0; i < 20; i++) {
			generateDivision.genNumeratorDenominator();

			localNumerator = generateDivision.getNumerator();
			localDenominator = generateDivision.getDenominator();

			System.out.println(localNumerator + " / " + localDenominator
					+ " = " + (localNumerator / localDenominator));
		}
	}
}
