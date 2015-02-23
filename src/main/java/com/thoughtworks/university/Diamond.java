package com.thoughtworks.university;

import java.util.Arrays;
import java.util.List;

public class Diamond extends Triangle {

    public Diamond(char characterDiamondsAreMadeOf) {
        super (characterDiamondsAreMadeOf);
    }

    public String StandardDiamond(int size) {
        StringBuffer result = new StringBuffer(printTriangle(size));
        if (size <= 1) {
            return result.toString();
        }
        result.append("\n");
        result.append(getReverseLines(result.toString()));
        return result.toString();
    }

    protected String getReverseLines(String lines) {
        List<String> linesList = Arrays.asList(lines.split("\n"));
        StringBuffer result = new StringBuffer();
        for (int i = linesList.size() - 2; i >= 0; i--) {
            result.append(linesList.get(i));
            if (i > 0) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public String namedDiamond(int size, String name) {
        StringBuilder result;
        result = new StringBuilder(ignoreLastLine(printTriangle(size)));
        result.append(shouldAddName(size, name));
        result.append(getReverseLines(result.toString()));
        return result.toString();
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
        StringBuilder result = new StringBuilder();

        for (int i=0; i < linesList.size() - 1; i++) {
            result.append(linesList.get(i)).append("\n");
        }
        return result.toString();
    }
}
