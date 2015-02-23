package com.thoughtworks.university;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    protected FizzBuzz fb;
    @Before
    public void setup() {
        fb = new FizzBuzz();
    }

    @Test
    public void shouldReturnNumber() {
        assertEquals("2", fb.isFizzOrBuzz(2));
    }
    @Test
    public void shouldReturnBuzz() {
        assertEquals("Buzz", fb.isFizzOrBuzz(5));
    }
    @Test
    public void shouldReturnFizz() {
        assertEquals("FizzBuzz", fb.isFizzOrBuzz(15));
    }

    @Test
    public void shouldPrintNumberOneWhenStartAtOneAndEndAtTwo() {
        setUpStreams();
        fb.print(1, 2);
        assertEquals("1\n", outContent.toString());
        cleanUpStreams();
    }

    @Test
    public void shouldPrintFizzWhenStartAtThreeAndEndAtFour() {
        setUpStreams();
        fb.print(3,4);
        assertEquals("Fizz\n", outContent.toString());
        cleanUpStreams();
    }

    @Test
    public void shouldPrintBuzzWhenStartAtFiveAndEndAtSix() {
        setUpStreams();
        fb.print(5,6);
        assertEquals("Buzz\n", outContent.toString());
        cleanUpStreams();
    }

    @Test
    public void shouldPrintFizzBuzzWhenNumberIsDivisibleByThreeAndFive() {
        setUpStreams();
        fb.print(15,16);
        assertEquals("FizzBuzz\n", outContent.toString());
        cleanUpStreams();
    }

    private void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    private void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}
