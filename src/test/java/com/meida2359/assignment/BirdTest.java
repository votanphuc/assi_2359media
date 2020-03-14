package test.java.com.meida2359.assignment;

import main.java.com.media2359.assigment.Bird;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BirdTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private Bird bird;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        bird = new Bird();
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testFly() {
        bird.fly();
        assertEquals("I am flying" + System.getProperty("line.separator"), outContent.toString());
    }

    @Test
    public void testSing() {
        bird.sing();
        assertEquals("I am singing" + System.getProperty("line.separator"), outContent.toString());
    }
}
