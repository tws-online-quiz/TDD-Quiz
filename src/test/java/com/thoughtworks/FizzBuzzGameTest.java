package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzGameTest {
    private FizzBuzzGame game;

    @Before
    public void setup() {
        game = new FizzBuzzGame();
    }

    @Test
    public void test_IsMultiplesOf3_using_a_number_which_is_Not_multiple_of_3() {
        boolean isMultipleOf3 = game.isMultiplesOf3(4);
        assertThat(isMultipleOf3, is(false));

        isMultipleOf3 = game.isMultiplesOf3(8);
        assertThat(isMultipleOf3, is(false));
    }

    @Test
    public void test_IsMultiplesOf3_using_a_number_which_is_multiple_of_3() {
        boolean isMultipleOf3 = game.isMultiplesOf3(6);
        assertThat(isMultipleOf3, is(true));

        isMultipleOf3 = game.isMultiplesOf3(99);
        assertThat(isMultipleOf3, is(true));
    }

    @Test
    public void test_IsMultiplesOf5_using_a_number_which_is_Not_multiple_of_5() {
        boolean isMultipleOf5 = game.isMultiplesOf5(4);
        assertThat(isMultipleOf5, is(false));

        isMultipleOf5 = game.isMultiplesOf5(8);
        assertThat(isMultipleOf5, is(false));
    }

    @Test
    public void test_IsMultiplesOf5_using_a_number_which_is_multiple_of_5() {
        boolean isMultipleOf5 = game.isMultiplesOf5(10);
        assertThat(isMultipleOf5, is(true));

        isMultipleOf5 = game.isMultiplesOf5(15);
        assertThat(isMultipleOf5, is(true));
    }

    @Test
    public void test_SayNumber_say_original_number_when_number_is_not_multiple_of_3_or_5() {
        String word = game.sayNumber(2);
        assertThat(word, is("2"));

        word = game.sayNumber(4);
        assertThat(word, is("4"));

        word = game.sayNumber(43);
        assertThat(word, is("43"));
    }

    @Test
    public void test_SayNumber_say_Fizz_when_number_is_multiple_of_3() {
        String word = game.sayNumber(3);
        assertThat(word, is("Fizz"));

        word = game.sayNumber(6);
        assertThat(word, is("Fizz"));

        word = game.sayNumber(99);
        assertThat(word, is("Fizz"));
    }

    @Test
    public void test_SayNumber_say_Buzz_when_number_is_multiple_of_5() {
        String word = game.sayNumber(5);
        assertThat(word, is("Buzz"));

        word = game.sayNumber(10);
        assertThat(word, is("Buzz"));

        word = game.sayNumber(95);
        assertThat(word, is("Buzz"));
    }

    @Test
    public void test_SayNumber_say_FizzBuzz_when_number_is_multiple_of_3_and_5() {
        String word = game.sayNumber(15);
        assertThat(word, is("FizzBuzz"));

        word = game.sayNumber(30);
        assertThat(word, is("FizzBuzz"));

        word = game.sayNumber(90);
        assertThat(word, is("FizzBuzz"));
    }
}
