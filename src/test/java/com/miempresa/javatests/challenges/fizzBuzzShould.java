package com.miempresa.javatests.challenges;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class fizzBuzzShould {

    @Test
    public void  fizz_when_divisible_by_3(){
        assertEquals("Fizz", fizzBuzz.getfizzBuzz(3));
        assertEquals("Fizz", fizzBuzz.getfizzBuzz(6));

    }

    @Test
    public void  Buzz_when_divisible_by_5(){
        assertEquals("Buzz", fizzBuzz.getfizzBuzz(5));
        assertEquals("Buzz", fizzBuzz.getfizzBuzz(10));
    }

    @Test
    public void  fizzBuzz_when_divisible_by_3_and_5(){
        assertEquals("FizzBuzz", fizzBuzz.getfizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz.getfizzBuzz(30));
    }

    @Test
    public void  number_when_divisible_by_any_other_number(){
        assertEquals("2", fizzBuzz.getfizzBuzz(2));
        assertEquals("16", fizzBuzz.getfizzBuzz(16));
    }
}