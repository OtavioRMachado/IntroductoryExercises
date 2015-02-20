import java.util.Arrays;
import java.util.List;

/**
 * Created by omachado on 2/20/15.
 */
public class Diamond extends Triangle {

    public Diamond(char character_diamonds_are_made_of) {
        super(character_diamonds_are_made_of);
    }

    public String StandardDiamond(int size) {
        String result = PrintTriangle(size);
        if(size > 1) {
            result += "\n";
            String reverse_result = getReverseLines(result);
            result += reverse_result;
        }
        return result;
    }

    private String getReverseLines(String lines) {
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
