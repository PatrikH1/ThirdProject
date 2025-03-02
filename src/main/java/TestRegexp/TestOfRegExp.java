package TestRegexp;

import java.util.regex.Pattern;

public class TestOfRegExp {
    public static void main(String[] args) {
        String input = "-123"; // Testa med olika värden
        String regex = "^[+-]?\\d+$";

        if (Pattern.matches(regex, input)) {
            System.out.println(input + " är ett giltigt heltal.");
        } else {
            System.out.println(input + " är inte ett giltigt heltal.");
        }
    }
}
