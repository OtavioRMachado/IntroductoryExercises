import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    private Triangle t;
    @Before
    public void setup() {
        t = new Triangle('*');
    }

    @Test
    public void basic_triangle_should_return_one_asterisk() {
        assertEquals("*", t.Print());
    }

    @Test
    public void should_return_empty_line() {
        assertEquals("", t.PrintHLine(0));
    }

    @Test
    public void should_draw_one_line_with_five_asterisks() {
        assertEquals("*****", t.PrintHLine(5));
    }

    @Test
    public void should_draw_one_vertical_line_with_two_asterisks() {
        assertEquals("*\n*", t.PrintVLine(2));
    }

    @Test
    public void should_draw_right_triangle_with_no_lines() {
        assertEquals("", t.PrintRightTriangle(0));
    }

    @Test
    public void should_draw_right_triangle_with_one_line() {
        assertEquals("*", t.PrintRightTriangle(1));
    }

    @Test
    public void should_draw_right_triangle_with_two_lines() {
        assertEquals("*\n**", t.PrintRightTriangle(2));
    }

    @Test
    public void should_draw_empty_triangle() {
        assertEquals("", t.PrintTriangle(0));
    }

    @Test
    public void should_print_a_one_line_triangle() {
        assertEquals("*", t.PrintTriangle(1));
    }
}