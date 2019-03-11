package com.miempresa.javatests.challenges;

public class fizzBuzz {
    public static String getfizzBuzz(int n){
        if ((n % 3 == 0) && (n % 5 == 0)){
            return "FizzBuzz";
        }

        if (n % 3 == 0){
            return "Fizz";
        }

        if (n % 5 == 0){
            return "Buzz";
        }
        return Integer.toString(n);

    }
}
