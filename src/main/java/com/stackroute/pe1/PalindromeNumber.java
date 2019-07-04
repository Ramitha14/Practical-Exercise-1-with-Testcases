package com.stackroute.pe1;

public class PalindromeNumber {

    public String checkPalindrome(long number) {
        //check whether the given number is palindrome or not
        long result = number, sum = 0;
        while (number > 0) {
            long digit = number % 10;
            sum = (sum * 10) + digit;
            number = number / 10;
        }
        if (result == sum) {
            //sum of even digits
            long sum2 = 0;
            while (sum > 0) {
                long digit = sum % 10;
                if (digit % 2 == 0) {
                    sum2 = sum2 + digit;
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


