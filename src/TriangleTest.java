import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    private Triangle t;
    @Before
    public void setup() {
        t = new Triangle();
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
}