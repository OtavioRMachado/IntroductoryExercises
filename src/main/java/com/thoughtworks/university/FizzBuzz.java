package com.thoughtworks.university;

public class FizzBuzz {
    public void print(int start_value, int end_value) {
        String result;
        for (int i = start_value; i < end_value; i++) {
            result = isFizzOrBuzz(i);
            System.out.println(result);
        }
    }

    public String isFizzOrBuzz(int value) {
        StringBuilder whatToWrite = new StringBuilder();
        if (value % 3 == 0) {
            whatToWrite.append("Fizz");
        }
        if (value % 5 == 0) {
            whatToWrite.append("Buzz");
        }
        return whatToWrite.length() == 0? String.valueOf(value) : whatToWrite.toString();
    }
}
