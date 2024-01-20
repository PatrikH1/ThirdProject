package Vector;

import java.util.*;

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

		ArrayList<InfoClass> arrayList = new ArrayList<>();
		// Init of ArrayList
		int max = 6;
		int i;
		for (i = 0; i < max; i++) {
			arrayList.add(new InfoClass("Info " + i, i));
		}
		arrayList.add(new InfoClass("Info " + 2, 2));
		arrayList.add(new InfoClass("Info " + 2, 2));
		arrayList.add(new InfoClass("Info " + 3, 3));
		infoList(arrayList);

		// runVectorAndArrayTest();

	}

	private static void infoList(List<InfoClass> infoList) {
		boolean found = false;
		System.out.println("\nInfo about array:");
		// infoList.stream().forEach(arr -> System.out.println(arr.getTextStr() + " : " + arr.getValue()));

		Map<InfoClass, Integer> infoMap = new LinkedHashMap<>();
		// Gå igenom listan och spara undan antalet saker i en Map -> saker som nyckel, antalet som värde
		infoList.forEach(info ->
				infoMap.entrySet()
						.stream()
						.filter(entry -> entry.getKey().equalsDuplicateCheck(info))
						.findAny()
						.ifPresentOrElse(entry -> entry.setValue(entry.getValue() + 1), () -> infoMap.put(info, 1))
		);

		// Om vi hittar en identifierad dubblett (mer än en förekomst) returneras true
		for (Map.Entry<InfoClass, Integer> entry : infoMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate found!" + " str: " + entry.getKey().getTextStr() +
						", value: " + entry.getKey().getValue() +
						", number: "  + entry.getValue());
				found = true;
			}
		}
		if (!found) {
			System.out.println("Duplicate not found!");
		}
	}



	private static void runVectorAndArrayTest() {

		Vector<InfoClass> vector = new Vector<>();
		ArrayList<InfoClass> array = new ArrayList<>();

		// Init of vector
		int max = 10;
		int i;
		for (i = 0; i < max; i++) {
			vector.add(new InfoClass("Info " + i, i));
		}

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

