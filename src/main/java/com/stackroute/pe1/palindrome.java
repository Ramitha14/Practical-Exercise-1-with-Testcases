package com.stackroute.pe1;

public class palindrome {

    public String CheckPalindrome(long num) {
        //check whether the given number is palindrome or not
        long res = num, sum = 0;
        while (num > 0) {
            long dig = num % 10;
            sum = (sum * 10) + dig;
            num = num / 10;
        }
        if (res == sum) {
            //sum of even digits
            long sum2 = 0;
            while (sum > 0) {
                long dig = sum % 10;
                if (dig % 2 == 0) {
                    sum2 = sum2 + dig;
                }
                sum = sum / 10;

            }
            //check sum is greater than 25 or not
            if (sum2 > 25) {
                return "Palindrome and the sum of even numbers is greater than 25";
            } else {
                return "Palindrome and the sum of even numbers is less than 25";
            }
        }
        else {
            return "Not Palindrome";
        }

    }
}


