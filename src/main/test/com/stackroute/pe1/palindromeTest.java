package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class palindromeTest {
    palindrome pal;

    @Before
    public void setup(){
        //System.out.println("Before");
        pal=new palindrome();
    }
    @Test
    public void FindPalindromeorNot() {
        // Arrange
        // App app = new App();
        //Act
        String result = pal.CheckPalindrome(2468642);
        //Assert
        assertEquals("Palindrome and the sum of even numbers is greater than 25", result);
    }

    @Test
    public void FindPalindromeorNot2() {
        // Arrange
        // App app = new App();
        //Act
        String result = pal.CheckPalindrome(121);
        //Assert
        assertEquals("Palindrome and the sum of even numbers is less than 25", result);
    }
    @Test
    public void FindPalindromeorNot3() {
        // Arrange
        // App app = new App();
        //Act
        String result = pal.CheckPalindrome(2324);
        //Assert
        assertEquals("Not Palindrome", result);
    }



}
