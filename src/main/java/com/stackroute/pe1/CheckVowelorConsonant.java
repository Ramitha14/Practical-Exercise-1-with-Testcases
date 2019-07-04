package com.stackroute.pe1;
public class CheckVowelorConsonant {
    //to check whether character is vowel or consonent
    public String vowelConsonent(String str) {
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result = result + "vowel";
            } else if ((ch >= 65) && (ch <= 90) || (ch >= 97) && (ch <= 122)) {
                result = result + "consonent";
            } else {
                result = result + "error";
            }
        }
        return result.trim();
    }

    }