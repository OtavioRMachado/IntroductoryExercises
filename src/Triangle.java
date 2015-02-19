/**
 * Created by omachado on 2/19/15.
 */
public class Triangle {
    public Triangle() {
    }
    public String Print() {
        return "*";
    }

    public String CreateLine(int elements_in_line, boolean isVertical) {
        String result = "";
        int last_element = elements_in_line - 1; /* This variable should not be created if it is a horizontal line. What should I do? */
        for(int i = 0; i < elements_in_line; i++) {
           result += "*";
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
}
