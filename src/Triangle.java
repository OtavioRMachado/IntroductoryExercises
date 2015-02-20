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
        result = generate_Triangle(lines, true);
        return result;
    }

    private String generate_Triangle(int lines, boolean isHalfTriangle) {
        String result = "";
        int elements_in_line = 1;
        int empty_spaces = lines - 1;
        for(int i = 0; i < lines; i++) {
            if(i > 0) {
                result += "\n";
            }
            if(!isHalfTriangle) {
                result += get_Spaces(empty_spaces);
            }
            result += PrintHLine(elements_in_line);

            elements_in_line++;

            if(!isHalfTriangle) {
                elements_in_line++;
            }
            empty_spaces--;
        }
        return result;
    }

    public String PrintTriangle(int lines) {
        //return PrintHLine(lines);
        /*
         * Here, I should do the same for as I do above, but increasing my elements_in_line value by 2 instead of one and add (n-1 - line) spaces between the lines
         * I can probably refactor those fors in a method where I set if I want to draw only half a triangle or a whole triangle.
         */
        String result = generate_Triangle(lines, false);
        return result;
    }

    private String get_Spaces(int empty_spaces) {
        if(empty_spaces > 0) {
            return " " + get_Spaces(empty_spaces - 1);
        } else {
            return "";
        }
    }
}
