package modernCalc;

import java.util.Random;

public class NumberGenerator {
    private final Random rng = new Random();
    private boolean useFirstAsDenominator = true;

    public int nextFactor() {
        return rng.nextInt(10) + 1;
    }

    public int[] nextDivision() {
        int a = nextFactor();
        int b = nextFactor();
        int numerator = a * b;
        int denominator = useFirstAsDenominator ? a : b;
        useFirstAsDenominator = !useFirstAsDenominator;
        return new int[] { numerator, denominator };
    }
}
