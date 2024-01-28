package Vector;

import java.util.*;

public class VectorTest {

	public VectorTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 *  Class for testing the use of Vector, arrays and to find copies in a list.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//runTestToFindAtLeastOneDuplicate();
		// runTestToFindAllDuplicatesInList();
		// runVectorAndArrayTest();
		runFindValuesInInfoIntegerLong();
	}

	/**
	 *  Just some tests of InfoIntegerLong.
	 *
	 */
	private static void runFindValuesInInfoIntegerLong() {
		ArrayList<InfoIntegerLong> arrayList = new ArrayList<>();

		arrayList.add(new InfoIntegerLong(Integer.valueOf(2020), 100L));
		arrayList.add(new InfoIntegerLong(Integer.valueOf(2021), 200L));
		arrayList.add(new InfoIntegerLong(Integer.valueOf(2022), 300L));
		arrayList.add(new InfoIntegerLong(Integer.valueOf(2023), 400L));
		arrayList.add(new InfoIntegerLong(Integer.valueOf(2024), 500L));

		System.out.println("Info about values:");
		arrayList.stream().forEach(arr -> System.out.println(arr.getYear() + " : " + arr.getValue()));

		Integer yearToFind = Integer.valueOf(2024);

		InfoIntegerLong result = arrayList
				.stream()
				.filter(res -> res.getYear().equals(yearToFind))
				.findFirst()
				.orElse(null);

		System.out.println();
		if (result != null) {
			System.out.println("(vec) Value found: " + result.getValue());
		}
		else {
			System.out.println("(vec) Value not found!");
		}
	}


	/**
	 * Creates a list of the InfoClass and try to find all duplicates in the list.
	 */
	private static void runTestToFindAllDuplicatesInList() {
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
		findAllDuplicatesInList(arrayList);
	}

	/**
	 * Takes a list of InfoClass as inparameter and find all duplicates.
	 *
	 * @param infoList
	 */
	private static void findAllDuplicatesInList(List<InfoClass> infoList) {

		System.out.println("\nInfo about all in array:");

		Map<InfoClass.IdentityForInfoClass, List<InfoClass>> infoMap = new HashMap<>();
		List<InfoClass> infoDuplicateList = new ArrayList<>();
		// Go throw the list and save duplicates.
		for (InfoClass info : infoList) {
			InfoClass.IdentityForInfoClass identities = new InfoClass.IdentityForInfoClass(info);
			if (!infoMap.containsKey(identities)) {
				infoMap.put(identities, new ArrayList());
			}
			infoMap.get(identities).add(info);
		}

		for (Map.Entry<InfoClass.IdentityForInfoClass, List<InfoClass>> entry : infoMap.entrySet()) {
			if (entry.getValue().size() > 1) {
				infoDuplicateList.addAll(entry.getValue());
			}
		}

		infoDuplicateList.stream().forEach(arr -> System.out.println(arr.getTextStr() + " : " + arr.getValue()));

	}

	/**
	 * Creates a list of the InfoClass and try to find at least one duplicate in the list.
	 */
	private static void runTestToFindAtLeastOneDuplicate() {
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
		findAtLeastOneDuplicate(arrayList);
	}

	/**
	 * Takes a list of InfoClass as inparameter and checks if there is at least one
	 * duplicate in that list. If a duplicate is found it is print out, otherwise it is
	 * print out that no duplicate is found.
	 *
	 * @param infoList
	 */
	private static void findAtLeastOneDuplicate(List<InfoClass> infoList) {
		boolean found = false;
		System.out.println("\nInfo about array:");
		// infoList.stream().forEach(arr -> System.out.println(arr.getTextStr() + " : " + arr.getValue()));

		Map<InfoClass, Integer> infoMap = new LinkedHashMap<>();
		// Go throw the list and save duplicates in the Map, InfoClass as key and the number of
		// copies as an Integer
		infoList.forEach(info ->
				infoMap.entrySet()
						.stream()
						.filter(entry -> entry.getKey().equalsDuplicateCheck(info))
						.findAny()
						.ifPresentOrElse(entry -> entry.setValue(entry.getValue() + 1), () -> infoMap.put(info, 1))
		);

		// If we find at least one duplicate, print out that duplicate is found othervise that it is not found.
		for (Map.Entry<InfoClass, Integer> entry : infoMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate found!" + " str: " + entry.getKey().getTextStr() +
						", value: " + entry.getKey().getValue() +
						", number: "  + entry.getValue());
				found = true;
				break;
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

		for (i = 0; i < vector.size(); i++) {
			array.add(vector.get(i));
		}

		System.out.println("Info about Vector:");
		vector.stream().forEach(vec -> System.out.println(vec.getTextStr() + " : " + vec.getValue()));

		System.out.println("\nInfo about array:");
		array.stream().forEach(arr -> System.out.println(arr.getTextStr() + " : " + arr.getValue()));

		String strToFind = "Info 7";

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

