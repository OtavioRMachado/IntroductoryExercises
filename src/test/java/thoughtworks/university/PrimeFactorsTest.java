package thoughtworks.university;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    protected List<Integer> result;
    @Before
    public void setup() {
        result = new ArrayList<Integer>();
    }
    @Test
    public void shouldReturnEmptyList() {
        assertEquals(result, PrimeFactors.generate(1));
    }

    @Test
    public void shouldReturnAListWithA2() {
        result.add(2);
        assertEquals(result, PrimeFactors.generate(2));
    }
    @Test
    public void shouldReturnAListWithTwo2s() {
        result.add(2);
        result.add(2);
        assertEquals(result, PrimeFactors.generate(4));
    }

    @Test
    public void shouldReturnOneMoreEmptyList() {
        assertEquals(result, PrimeFactors.generate(0));
    }
}
