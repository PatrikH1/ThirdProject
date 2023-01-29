package PingPong;

public class NumberOfPingPongMatches {

	public NumberOfPingPongMatches() {		
	}
	
	static int calcNumberOfMatches(int n) {
	   if (n == 1) {
			return 0;
		}
		else {
		    return (n - 1) + calcNumberOfMatches(n - 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("5 players: " + calcNumberOfMatches(5));
		System.out.println("4 players: " + calcNumberOfMatches(4));
		System.out.println("3 players: " + calcNumberOfMatches(3));
		System.out.println("2 players: " + calcNumberOfMatches(2));

	}

}
