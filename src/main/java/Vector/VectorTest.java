package Vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 *  Class for testing the use of Vector.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<InfoClass> vector = new Vector<>();
		ArrayList<InfoClass> array = new ArrayList<>();

		// Init of vector
		int max = 10;
		int i;
		for (i = 0; i < max; i++) {
			vector.add(new InfoClass("Info " + i, i));
		}

		array.addAll(vector);

//		for (i = 0; i < vector.size(); i++) {
//			array.add(vector.get(i));
//		}

		System.out.println("Info about Vector:");
		vector.stream().forEach(vec -> System.out.println(vec.getTextStr() + " : " + vec.getValue()));

//		Iterator<InfoClass> iter = vector.iterator();
//		while (iter.hasNext()) {
//			System.out.println(((InfoClass) iter.next()).getTextStr());
//		}

		System.out.println("\nInfo about array:");
		array.stream().forEach(arr -> System.out.println(arr.getTextStr() + " : " + arr.getValue()));

		String strToFind = "Info 10";

		InfoClass result = vector
				.stream()
				.filter(res -> res.getTextStr().equals(strToFind))
				.findFirst()
				.orElse(null);

		System.out.println();
		if (result != null) {
			System.out.println("(vec) Value found: " + strToFind);
		}
		else {
			System.out.println("(vec) Value not found!");
		}

		result = array
				.stream()
				.filter(res -> res.getTextStr().equals(strToFind))
				.findFirst()
				.orElse(null);

		if (result != null) {
			System.out.println("(array) Value found: " + strToFind);
		}
		else {
			System.out.println("(array) Value not found!");
		}

	}
}

