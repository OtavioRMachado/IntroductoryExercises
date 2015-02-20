/**
 * Created by omachado on 2/19/15.
 */
public class Triangle {
    char TriangleCharacter;

    public Triangle(char selected_character) {
        this.TriangleCharacter = selected_character;
    }
    public String Print() {
        return String.valueOf(TriangleCharacter);
    }

    public String getCharAsStr() {
        return String.valueOf(TriangleCharacter);
    }

    protected String CreateLine(int elements_in_line, boolean isVertical) {
        String result = "";
        for(int i = 0; i < elements_in_line; i++) {
            if(isVertical && i > 0) {
                result += "\n";
            }
           result += getCharAsStr();
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
        String result = "";
        result = generate_Triangle(lines, true);
        return result;
    }

    private String generate_Triangle(int lines, boolean isHalfTriangle) {
        String result = "";
        int elements_in_line = 1;
        int empty_spaces;
        int how_many_elements_should_i_add;

        if(isHalfTriangle) {
            empty_spaces = 0;
            how_many_elements_should_i_add = 1;
        } else {
            empty_spaces = lines - 1;
            how_many_elements_should_i_add = 2;
        }

        for(int i = 0; i < lines; i++) {
            if(i > 0) {
                result += "\n";
            }

            result += get_Spaces(empty_spaces);
            result += PrintHLine(elements_in_line);

            elements_in_line += how_many_elements_should_i_add;
            empty_spaces--;
        }
        return result;
    }

    public String PrintTriangle(int lines) {
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
