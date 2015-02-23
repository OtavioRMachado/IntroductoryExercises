package com.thoughtworks.university;

public class Triangle {
    protected char triangleCharacter;

    public Triangle(char selectedCharacter) {
        this.triangleCharacter = selectedCharacter;
    }
    public String print() {
        return String.valueOf(triangleCharacter);
    }

    protected String getCharAsStr() {
        return String.valueOf(triangleCharacter);
    }

    protected String createLine(int elementsInLine, boolean isVertical) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < elementsInLine; i++) {
            if (isVertical && i > 0) {
                result.append("\n");
            }
           result.append(getCharAsStr());
        }
        return result.toString();
    }
    public String printHLine(int elementsInLine) {
        return createLine(elementsInLine, false);
    }

    public String printVLine(int elementsInLine) {
        return createLine(elementsInLine, true);
    }

    public String printRightTriangle(int lines) {
        String result = "";
        result = generateTriangle(lines, true);
        return result;
    }

    protected String generateTriangle(int lines, boolean isHalfTriangle) {
        StringBuilder result = new StringBuilder();
        int elementsInLine = 1;
        int emptySpaces;
        int howManyElementsShouldIAdd;

        if (isHalfTriangle) {
            emptySpaces = 0;
            howManyElementsShouldIAdd = 1;
        } else {
            emptySpaces = lines - 1;
            howManyElementsShouldIAdd = 2;
        }

        for (int i = 0; i < lines; i++) {
            if (i > 0) {
                result.append("\n");
            }

            result.append(getSpaces(emptySpaces));
            result.append(printHLine(elementsInLine));

            elementsInLine += howManyElementsShouldIAdd;
            emptySpaces--;
        }
        return result.toString();
    }

    public String printTriangle(int lines) {
        String result = generateTriangle(lines, false);
        return result;
    }

    private String getSpaces(int emptySpaces) {
        StringBuilder result = new StringBuilder(" ");
        if (emptySpaces > 0) {
            return result.append(getSpaces(emptySpaces - 1)).toString();
        } else {
            return "";
        }
    }
}
