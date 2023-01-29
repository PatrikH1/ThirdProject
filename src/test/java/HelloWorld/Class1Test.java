package HelloWorld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Class1Test {

    @Test
    public void firstTest() {
        Class1 class1 = new Class1();

        assertEquals("Hej", class1.inputString("Hej"));
    }
}
