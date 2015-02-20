/**
 * Created by omachado on 2/20/15.
 */
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondTest {
    private Diamond d;

    @Before
    public void setup() {
        d = new Diamond('*');
    }

    @Test
    public void Should_return_empty_diamond() {
        assertEquals("", d.StandardDiamond(0));
    }

    @Test
    public void Should_return_size_one_diamond() {
        assertEquals("*", d.StandardDiamond(1));
    }

    @Test
    public void Should_return_size_two_diamond() {
        assertEquals(" *\n***\n *", d.StandardDiamond(2));
    }

    @Test
    public void Should_return_size_three_diamond() {
        assertEquals("  *\n ***\n*****\n ***\n  *", d.StandardDiamond(3));
    }
}
