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
    public void test_SayNumber_say_original_input_when_not_matched_with_any_rules() {
        assertThat(game.sayNumber(11), is("11"));
        assertThat(game.sayNumber(17), is("17"));
        assertThat(game.sayNumber(19), is("19"));
        assertThat(game.sayNumber(97), is("97"));

    }


    @Test
    public void test_SayNumber_say_Fizz_when_number_contains_3() {
        assertThat(game.sayNumber(3), is("Fizz"));
        assertThat(game.sayNumber(13), is("Fizz"));
        assertThat(game.sayNumber(23), is("Fizz"));
        assertThat(game.sayNumber(43), is("Fizz"));
        assertThat(game.sayNumber(30), is("Fizz"));
        assertThat(game.sayNumber(31), is("Fizz"));
        assertThat(game.sayNumber(32), is("Fizz"));
        assertThat(game.sayNumber(33), is("Fizz"));
        assertThat(game.sayNumber(34), is("Fizz"));
        assertThat(game.sayNumber(35), is("Fizz"));
        assertThat(game.sayNumber(36), is("Fizz"));
        assertThat(game.sayNumber(37), is("Fizz"));
        assertThat(game.sayNumber(38), is("Fizz"));
        assertThat(game.sayNumber(39), is("Fizz"));
    }

    @Test
    public void test_SayNumber_say_Fizz_when_number_is_multiple_of_3() {
        assertThat(game.sayNumber(3), is("Fizz"));
        assertThat(game.sayNumber(6), is("Fizz"));
        assertThat(game.sayNumber(99), is("Fizz"));
    }

    @Test
    public void test_SayNumber_say_Buzz_when_number_is_multiple_of_5() {
        assertThat(game.sayNumber(5), is("Buzz"));
        assertThat(game.sayNumber(100), is("Buzz"));

    }

    @Test
    public void test_SayNumber_say_Whizz_when_number_is_multiple_of_7() {
        assertThat(game.sayNumber(7), is("Whizz"));
        assertThat(game.sayNumber(49), is("Whizz"));
        assertThat(game.sayNumber(77), is("Whizz"));
    }

    @Test
    public void test_SayNumber_say_FizzBuzz_when_number_is_multiple_of_3_and_5() {
        assertThat(game.sayNumber(15), is("FizzBuzz"));
        assertThat(game.sayNumber(45), is("FizzBuzz"));
        assertThat(game.sayNumber(90), is("FizzBuzz"));
    }

    @Test
    public void test_SayNumber_say_BuzzWhizz_when_number_is_multiple_of_5_and_7() {
        assertThat(game.sayNumber(70), is("BuzzWhizz"));
    }

    @Test
    public void test_SayNumber_say_FizzWhizz_when_number_is_multiple_of_3_and_7() {
        assertThat(game.sayNumber(21), is("FizzWhizz"));
        assertThat(game.sayNumber(42), is("FizzWhizz"));
        assertThat(game.sayNumber(84), is("FizzWhizz"));
    }

    @Test
    public void test_SayNumber_say_FizzBuzzWhizz_when_number_is_multiple_of_3_and5_and_7() {
        assertThat(game.sayNumber(105), is("FizzBuzzWhizz"));
    }
}
