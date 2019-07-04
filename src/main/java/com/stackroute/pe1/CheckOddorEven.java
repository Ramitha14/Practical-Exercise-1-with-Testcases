package com.stackroute.pe1;

public class CheckOddorEven {
    //to check odd or even
    public String findOddorEven(int result) {
        if ((result >= 20) && (result <= 30)) {

            if (result % 2 == 0) {
                return "Jerry";
            } else {
                return "Tom";
            }
        } else {
            return "Error";
        }

    }
}