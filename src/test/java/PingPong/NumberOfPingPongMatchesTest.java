package PingPong;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfPingPongMatchesTest {

    @Test
    public void firstTest() {
        assertEquals(10, NumberOfPingPongMatches.calcNumberOfMatches(5));
        assertEquals(45, NumberOfPingPongMatches.calcNumberOfMatches(10));
    }

}