package thoughtworks.university;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiamondTest {
    private Diamond d;

    @Before
    public void setup() {
        d = new Diamond('*');
    }

    @Test
    public void shouldReturnEmptyDiamond() {
        Assert.assertEquals("", d.StandardDiamond(0));
    }

    @Test
    public void shouldReturnSizeOneDiamond() {
        Assert.assertEquals("*", d.StandardDiamond(1));
    }

    @Test
    public void shouldReturnSizeTwoDiamond() {
        Assert.assertEquals(" *\n***\n *", d.StandardDiamond(2));
    }

    @Test
    public void shouldReturnSizeThreeDiamond() {
        Assert.assertEquals("  *\n ***\n*****\n ***\n  *", d.StandardDiamond(3));
    }

    @Test
    public void shouldReturnSizeOneDiamondWithName() {
        Assert.assertEquals("oi", d.namedDiamond(1, "oi"));
    }

    @Test
    public void shouldReturnSizeZeroDiamondWithName() {
        Assert.assertEquals("", d.namedDiamond(0, "oi"));
    }

    @Test
    public void shouldReturnSizeTwoDiamondWithName() {
        Assert.assertEquals(" *\noi\n *", d.namedDiamond(2, "oi"));
    }
}