package main.thoughtworks.university;

import java.util.Arrays;
import java.util.List;

public class Diamond extends Triangle {

    public Diamond(char character_diamonds_are_made_of) {
        super(character_diamonds_are_made_of);
    }

    public String StandardDiamond(int size) {
        String result = printTriangle(size);
        if(size > 1) {
            result += "\n";
            String reverse_result = getReverseLines(result);
            result += reverse_result;
        }
        return result;
    }

    protected String getReverseLines(String lines) {
        List<String> lines_list = Arrays.asList(lines.split("\n"));
        String result = "";
        for(int i = lines_list.size() - 2; i >= 0; i--) {
            result += lines_list.get(i);
            if(i > 0) {
                result += "\n";
            }
        }
        return result;
    }
}
