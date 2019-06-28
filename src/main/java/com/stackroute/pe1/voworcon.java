package com.stackroute.pe1;
public class voworcon {
    //to check whether character is vowel or consonent
    public String vowelconsonent(String str) {
        String res = "";
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                res = res + "vowel";
            } else if ((ch >= 65) && (ch <= 90) || (ch >= 97) && (ch <= 122)) {
                res = res + "consonent";
            } else {
                res = res + "error";
            }
            return res.trim();
        }

    }
