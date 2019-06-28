package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class characterTest {
    character ch;

    @Before
    public void setup(){
        //System.out.println("Before");
        ch=new character();
    }
    @Test
    public void upper() {
        // Arrange
        // App app = new App();
        //Act
        String result = ch.findcharacter('A');
        //Assert
        assertEquals("Upper case", result);
    }
    @Test
    public void lower() {
        // Arrange
        // App app = new App();
        //Act
        String result = ch.findcharacter('a');
        //Assert
        assertEquals("Lower case", result);
    }
    @Test
    public void digit() {
        // Arrange
        // App app = new App();
        //Act
        String result = ch.findcharacter('9');
        //Assert
        assertEquals("Digit", result);
    }
    @Test
    public void Special() {
        // Arrange
        // App app = new App();
        //Act
        String result = ch.findcharacter('%');
        //Assert
        assertEquals("Special character", result);
    }
}

