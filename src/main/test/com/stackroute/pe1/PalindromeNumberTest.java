package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PalindromeNumberTest {
    PalindromeNumber object;

    @Before
    public void setup(){
        //System.out.println("Before");
        object=new PalindromeNumber();
    }
    @Test
    public void givenIntegerShouldreturnPalindromeAndGreaterThan25() {
               String result = object.checkPalindrome(2468642);
        //Assert
        assertEquals("Palindrome and the sum of even numbers is greater than 25", result);
    }

    @Test
    public void givenIntegerShouldreturnPalindromeAndLessThan25() {

        String result = object.checkPalindrome(121);
        //Assert
        assertEquals("Palindrome and the sum of even numbers is less than 25", result);
    }
    @Test
    public void givenIntegerShouldreturnNotPalindrome() {
        String result = object.checkPalindrome(2324);
        //Assert
        assertEquals("Not Palindrome", result);
    }



}
