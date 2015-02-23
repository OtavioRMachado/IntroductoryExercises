package com.thoughtworks.university;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiamondTest {
    private Diamond diamond;

    @Before
    public void setup() {
        diamond = new Diamond('*');
    }

    @Test
    public void shouldReturnEmptyDiamondWhenSizeIsZero() {
        Assert.assertEquals("", diamond.StandardDiamond(0));
    }

    @Test
    public void shouldReturnSizeOneDiamond() {
        Assert.assertEquals("*", diamond.StandardDiamond(1));
    }

    @Test
    public void shouldReturnSizeTwoDiamond() {
        Assert.assertEquals(" *\n***\n *", diamond.StandardDiamond(2));
    }

    @Test
    public void shouldReturnSizeThreeDiamond() {
        Assert.assertEquals("  *\n ***\n*****\n ***\n  *", diamond.StandardDiamond(3));
    }

    @Test
    public void shouldReturnSizeOneDiamondWithName() {
        Assert.assertEquals("oi", diamond.namedDiamond(1, "oi"));
    }

    @Test
    public void shouldReturnSizeZeroDiamondWithName() {
        Assert.assertEquals("", diamond.namedDiamond(0, "oi"));
    }

    @Test
    public void shouldReturnSizeTwoDiamondWithName() {
        Assert.assertEquals(" *\noi\n *", diamond.namedDiamond(2, "oi"));
    }
}
