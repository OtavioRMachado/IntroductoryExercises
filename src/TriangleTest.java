import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void basic_triangle_should_return_one_asterisk() {
        Triangle t = new Triangle();
        assertEquals("*", t.Print());
    }

}