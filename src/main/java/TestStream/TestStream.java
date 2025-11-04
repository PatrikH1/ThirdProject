package TestStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        // Create the first list and add five strings
        List<String> firstList = new ArrayList<>();
        firstList.add("Apple");
        firstList.add("Banana");
        firstList.add("Cherry");
        firstList.add("Date");
        firstList.add("Elderberry");

        // Create the second list to store characters
        List<List<Character>> secondList = new ArrayList<>();

        // Copy each string as a list of characters
        secondList = firstList.stream()
                .map(str -> str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        // Print the second list of character lists
        for (int i = 0; i < secondList.size(); i++) {
            System.out.println("String: " + firstList.get(i));
            System.out.println("Characters: " + secondList.get(i));
        }
    }
}