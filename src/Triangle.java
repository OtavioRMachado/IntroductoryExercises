/**
 * Created by omachado on 2/19/15.
 */
public class Triangle {
    char TriangleCharacter;
    public Triangle(char selected_character) {
        this.TriangleCharacter = selected_character;
    }
    public String Print() {
        return String.format("%s", TriangleCharacter);
    }

    public String getCharAsStr() {
        return String.valueOf(TriangleCharacter);
    }

    protected String CreateLine(int elements_in_line, boolean isVertical) {
        String result = "";
        int last_element = elements_in_line - 1; /* This variable should not be created if it is a horizontal line. What should I do? */
        for(int i = 0; i < elements_in_line; i++) {
           result += getCharAsStr();
            if(isVertical && i != last_element) {
                result += "\n";
            }
        }
        return result;
    }
    public String PrintHLine(int elements_in_line) {
        return CreateLine(elements_in_line, false);
    }

    public String PrintVLine(int elements_in_line) {
        return CreateLine(elements_in_line, true);
    }

    public String PrintRightTriangle(int lines) {
       int elements_in_line = 1;
        int last_line = lines - 1;
        String result = "";
        for(int i = 0; i < lines; i++) {
            result += PrintHLine(elements_in_line);
            elements_in_line++;
            if(i < last_line) {
                result += "\n";
            }
        }
        return result;
    }

    public String PrintTriangle(int lines) {
        return PrintHLine(lines);
        /*
         * Here, I should do the same for as I do above, but increasing my elements_in_line value by 2 instead of one and add (n-1 - line) spaces between the lines
         * I can probably refactor those fors in a method where I set if I want to draw only half a triangle or a whole triangle.
         */
    }
}
