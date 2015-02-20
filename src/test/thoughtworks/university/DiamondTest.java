package test.thoughtworks.university;

import main.thoughtworks.university.Diamond;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
