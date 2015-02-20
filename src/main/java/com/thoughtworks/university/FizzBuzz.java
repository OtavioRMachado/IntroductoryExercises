package com.thoughtworks.university;

/**
 * Created by omachado on 2/20/15.
 */
public class FizzBuzz {
    public void print() {
        String result;
        for (int i = 1; i < 100; i++) {
            result = isFizzOrBuzz(i);
            System.out.println(result);
            System.out.print("\n");
        }
    }

    public String isFizzOrBuzz(int value) {
        boolean hasWritten = false;
        String whatToWrite = "";
        if (value % 3 == 0) {
            whatToWrite += "Fizz";
            hasWritten = true;
        }
        if (value % 5 == 0) {
            whatToWrite += "Buzz";
            hasWritten = true;
        }
        return whatToWrite == ""? String.valueOf(value) : whatToWrite;
    }
}
