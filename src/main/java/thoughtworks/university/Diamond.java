package thoughtworks.university;

import java.util.Arrays;
import java.util.List;

public class Diamond extends Triangle {

    public Diamond(char characterDiamondsAreMadeOf) {
        super (characterDiamondsAreMadeOf);
    }

    public String StandardDiamond(int size) {
        String result = printTriangle(size);
        if (size <= 1) {
            return result;
        }
        result += "\n";
        result += getReverseLines(result);
        return result;
    }

    protected String getReverseLines(String lines) {
        List<String> linesList = Arrays.asList(lines.split("\n"));
        String result = "";
        for (int i = linesList.size() - 2; i >= 0; i--) {
            result += linesList.get(i);
            if (i > 0) {
                result += "\n";
            }
        }
        return result;
    }

    public String namedDiamond(int size, String name) {
        String result = printTriangle(size);
        result = ignoreLastLine(result);
        result += shouldAddName(size, name);
        result += getReverseLines(result);
        return result;
    }

    private String shouldAddName(int size, String name) {
        if (size <= 0) {
            return "";
        }
        else if (size <= 1) {
            return name;
        }
        return name + "\n";
    }

    private String ignoreLastLine(String text) {
        List<String> linesList = Arrays.asList(text.split("\n"));
        String result = "";
        for (int i=0; i < linesList.size() - 1; i++) {
            result += linesList.get(i) + "\n";
        }
        return result;
    }
}
