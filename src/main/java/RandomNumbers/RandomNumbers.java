/**
 *  This file consists of the class RandomNumbers for
 *  generating random numbers.
 */
package RandomNumbers;
import java.util.Random;

/**
 * @author Patrik
 *
 * Class to generate Random numbers.
 */
public class RandomNumbers {
	
	private int maxNumber;
	private Random generator;

	/**
	 *  Constructor for class RandomNumbers.
	 */
	public RandomNumbers() {
		maxNumber = 10;
		generator = new Random();
	}

	/**
	 *  Constructor for class RandomNumbers.
	 *  
	 *  @args maxNumber The maximum random number
	 */
	public RandomNumbers(int maxNumber) {
		this.maxNumber = maxNumber;
		generator = new Random();
	}

	/**
	 *  Constructor for class RandomNumbers.
	 *  
	 *  @args maxNumber The maximum random number
	 */
	public int getNextRandomInt() {
		return generator.nextInt(maxNumber) + 1;
	}
		
	/**
	 * Main method for class RandomNumbers.
	 * It tests using the RandomNumbers class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		RandomNumbers generator = new RandomNumbers();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(generator.getNextRandomInt() + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(generator.getNextRandomInt() + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(generator.getNextRandomInt() + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(generator.getNextRandomInt() + " ");
		}
		System.out.println();		

	}
}
