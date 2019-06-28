package com.stackroute.pe1;

public class oddoreven {
    //to check odd or even
    public String findoddoreven(int res) {
        if ((res >= 20) && (res <= 30)) {

            if (res % 2 == 0) {
                return "Jerry";
            } else {
                return "Tom";
            }
        } else {
            return "Error";
        }

    }
}