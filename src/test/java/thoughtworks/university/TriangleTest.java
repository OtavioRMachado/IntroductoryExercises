package thoughtworks.university;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    private Triangle t;
    @Before
    public void setup() {
        t = new Triangle('*');
    }

    @Test
    public void basicTriangleShouldReturnOneAsterisk() {
        assertEquals("*", t.print());
    }

    @Test
    public void shouldReturnEmptyLine() {
        assertEquals("", t.printHLine(0));
    }

    @Test
    public void shouldDrawOneLineWithFiveAsterisks() {
        assertEquals("*****", t.printHLine(5));
    }

    @Test
    public void shouldDrawOneVerticalLineWithTwoAsterisks() {
        assertEquals("*\n*", t.printVLine(2));
    }

    @Test
    public void shouldDrawRightTriangleWithNoLines() {
        assertEquals("", t.printRightTriangle(0));
    }

    @Test
    public void shouldDrawRightTriangleWithOneLine() {
        assertEquals("*", t.printRightTriangle(1));
    }

    @Test
    public void shouldDrawRightTriangleWithTwoLines() {
        assertEquals("*\n**", t.printRightTriangle(2));
    }

    @Test
    public void shouldDrawEmptyTriangle() {
        assertEquals("", t.printTriangle(0));
    }

    @Test
    public void shouldPrintOneLineTriangle() {
        assertEquals("*", t.printTriangle(1));
    }

    @Test
    public void shouldPrintTwoLineTriangle() {
        assertEquals(" *\n***", t.printTriangle(2));
    }

    @Test
    public void shouldPrintFiveLineTriangle() {
        assertEquals("    *\n   ***\n  *****\n *******\n*********", t.printTriangle(5));
    }
}