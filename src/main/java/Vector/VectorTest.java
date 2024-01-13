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
		Vector<InfoClass> vec = new Vector<>();
		ArrayList<InfoClass> array = new ArrayList<>();

		// Init of vector
		int max = 10;
		int i;
		for (i = 0; i < max; i++) {
			vec.add(new InfoClass("Info " + i));
		}

		for (i = 0; i < vec.size(); i++) {
			array.add(vec.get(i));
		}

		System.out.println("Info about Vector:");
		Iterator<InfoClass> iter = vec.iterator();
		while (iter.hasNext()) {
			System.out.println(((InfoClass) iter.next()).getTextStr());
		}

		System.out.println("\nInfo about array:");
		array.stream().forEach(arr -> System.out.println(arr.getTextStr()));

		String strToFind = "Info 9";

		InfoClass result = vec
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

class InfoClass {
	String textStr;
	public InfoClass (String textStr) {
		this.textStr = textStr;
	}
	public String getTextStr() {
		return textStr;
	}
}
