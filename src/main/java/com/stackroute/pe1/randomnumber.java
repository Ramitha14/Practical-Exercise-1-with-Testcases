package com.stackroute.pe1;


public class randomnumber {

    public String checkwithoriginalnumber(int number) {
        //compare guess number with original number
        int original=50;
        String res=null;
        if (number > original) {
            res="Number guessed is more than original number";
        } else if (number < original) {
            res="Number guessed is less than original number";
        } else if (number == original) {

            res= "Number guessed matches the original number";
        }
        return res;
    }
}