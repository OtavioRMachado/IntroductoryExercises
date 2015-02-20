/**
 * Created by omachado on 2/20/15.
 */
public class Diamond extends Triangle {

    public Diamond(char character_diamonds_are_made_of) {
        super(character_diamonds_are_made_of);
    }

    public String StandardDiamond(int size) {
        return PrintHLine(size);
    }
}
