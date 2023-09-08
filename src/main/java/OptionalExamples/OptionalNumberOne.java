package OptionalExamples;

import java.util.Optional;

public class OptionalNumberOne {

    public static void main(String[] args) {
        System.out.println("Simple program for testing Optional in Java:");
        System.out.println("--------------------------------------------");
        Optional obj1 = Optional.of
                ("This is a sample text");
        Optional obj2 = Optional.empty();

        if (obj1.isPresent()) {
            System.out.println
                    ("isPresent method called on obj1 returned true");

        }
        obj1.ifPresent(s -> System.out.println("This is the content of obj1: " + s));

        obj1.ifPresent(s -> System.out.println
                ("ifPresent method called on obj1"));

        obj2.ifPresent(s -> System.out.println
                ("ifPresent method called on obj2 "));

        System.out.println("Try to use ifPresentOrElse:");
        System.out.println("---------------------------");

        obj1.ifPresentOrElse(
                s -> System.out.println("This is the content of obj1: " + s),
                () -> System.out.println("No content of obj1!"));

        obj2.ifPresentOrElse(
                s -> System.out.println("This is the content of obj2: " + s),
                () -> System.out.println("No content of obj2!"));
    }

}
