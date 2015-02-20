package main.thoughtworks.university;

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
        String result = "";
        for(int i = 0; i < elementsInLine; i++) {
            if(isVertical && i > 0) {
                result += "\n";
            }
           result += getCharAsStr();
        }
        return result;
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
        String result = "";
        int elementsInLine = 1;
        int emptySpaces;
        int howManyElementsShouldIAdd;

        if(isHalfTriangle) {
            emptySpaces = 0;
            howManyElementsShouldIAdd = 1;
        } else {
            emptySpaces = lines - 1;
            howManyElementsShouldIAdd = 2;
        }

        for(int i = 0; i < lines; i++) {
            if(i > 0) {
                result += "\n";
            }

            result += getSpaces(emptySpaces);
            result += printHLine(elementsInLine);

            elementsInLine += howManyElementsShouldIAdd;
            emptySpaces--;
        }
        return result;
    }

    public String printTriangle(int lines) {
        String result = generateTriangle(lines, false);
        return result;
    }

    private String getSpaces(int emptySpaces) {
        if(emptySpaces > 0) {
            return " " + getSpaces(emptySpaces - 1);
        } else {
            return "";
        }
    }
}
