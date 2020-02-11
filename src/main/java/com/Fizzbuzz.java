package com;

public class Fizzbuzz {

    public void checkItems(){

    }

    public String checkFizzBuzz (int value)
    {
        String isFizzBuzz = "";
        isFizzBuzz = isFizzBuzz + isMultipleOf3(value);
        isFizzBuzz = isFizzBuzz + isMultipleOf5(value);
        return isFizzBuzz;
    }

    public String isMultipleOf3(int num){
        String response = "";
        if((num % 3) ==0){
            response ="Fizz";
        }
        return response;
    }

    public String isMultipleOf5(int num){
        String response = "";
        if((num % 5) ==0){
            response ="Buzz";
        }
        return response;
    }
}
