package thoughtworks.university;

/**
 * Created by omachado on 2/20/15.
 */
public class FizzBuzz {
    public void print() {
        String result;
        for (int i = 1; i < 100; i++) {
            result = String.valueOf(i);
            if (!isFizzOrBuzz(i)) {
                System.out.print(result);
            }
            System.out.print("\n");
        }
    }

    private boolean isFizzOrBuzz(int value) {
        boolean hasWritten = false;
        if (value % 3 == 0) {
            System.out.print("Fizz");
            hasWritten = true;
        }
        if (value % 5 == 0) {
            System.out.print("Buzz");
            hasWritten = true;
        }
        return hasWritten;
    }
}
