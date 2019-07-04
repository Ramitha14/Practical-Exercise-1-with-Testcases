package com.stackroute.pe1;


public class GuessTargetNumber {

    public String checkwithOriginalNumber(int number) {
        //compare guessed number with original number
        int originalnumber=50;
        String result=null;
        if (number > originalnumber) {
            result="Number guessed is more than original number";
        } else if (number < originalnumber) {
            result="Number guessed is less than original number";
        } else if (number == originalnumber) {

            result= "Number guessed matches the original number";
        }
        return result;
    }
}