package HelloWorld;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorld1Test {

    @Test
    public void testClass1() {
        Class1 class1 = new Class1();

        assertEquals("Hej", class1.inputString("Hej"));
    }

}