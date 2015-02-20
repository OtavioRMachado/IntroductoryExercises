package com.thoughtworks.university;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by omachado on 2/20/15.
 */
public class FizzBuzzTest {
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
}
