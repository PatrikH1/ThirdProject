/**
 *  This file consists of the class RandomNumbers for
 *  generating random numbers.
 */
package guiFirstTest;
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
     * 
	 *  We will get a random number from 1 to maxnumbers.
	 *  
	 *  @args maxNumber The maximum random number
	 */
	public int getNextRandomInt() {
		return generator.nextInt(maxNumber) + 1;
	}
	
	/**
     * 
	 *  We will get a random number from 1 to maxnumbers.
	 *  
	 *  @args maxNumber The maximum random number
	 */
	public int getNextRandomInteger() {
		return generator.nextInt(maxNumber);
	}	
		
	/**
	 * Main method for class RandomNumbers.
	 * It tests using the RandomNumbers class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		RandomNumbers generator = new RandomNumbers();

		for (int i = 0; i < 20; i++) {
			System.out.print(generator.getNextRandomInteger() + " ");
		}
		System.out.println();
		
		
//		for (int i = 0; i < 20; i++) {
//			System.out.print(generator.getNextRandomInt() + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < 30; i++) {
//			System.out.print(generator.getNextRandomInt() + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < 10; i++) {
//			System.out.print(generator.getNextRandomInt() + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < 10; i++) {
//			System.out.print(generator.getNextRandomInt() + " ");
//		}
		System.out.println();		

	}
}
