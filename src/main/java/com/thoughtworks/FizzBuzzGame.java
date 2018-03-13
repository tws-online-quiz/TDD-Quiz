package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            String result = sayNumber(i);
            results.add(result);
        }
    }

    String sayNumber(int number) {
        boolean isMultiplesOf3 = isMultiplesOf3(number);
        boolean isMultiplesOf5 = isMultiplesOf5(number);
        if (isMultiplesOf3 && isMultiplesOf5) {
            return "FizzBuzz";
        }

        if (isMultiplesOf3) {
            return "Fizz";
        }

        if (isMultiplesOf5) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    boolean isMultiplesOf3(int number) {
        return number % 3 == 0;
    }

    boolean isMultiplesOf5(int number) {
        return number % 5 == 0;
    }

    public List<String> getResults() {
        return results;
    }
}
