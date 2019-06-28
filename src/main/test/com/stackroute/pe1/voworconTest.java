package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class voworconTest {
    voworcon vow;

    @Before
    public void setup(){
        //System.out.println("Before");
        vow=new voworcon();
    }
    @Test
    public void vowelconsonent() {
        // Arrange
        // App app = new App();
        //Act
        String result = vow.vowelconsonent("ap");
        //Assert
        assertEquals("vowel consonent", result);
    }
    @Test
    public void vowelconsonent2() {
        // Arrange
        // App app = new App();
        //Act
        String result = vow.vowelconsonent("9");;
        //Assert
        assertEquals("Error", result);
    }
    @Test
    public void vowelconsonent3() {
        // Arrange
        // App app = new App();
        //Act
        String result = vow.vowelconsonent("r$");
        //Assert
        assertEquals(" consonent Error", result);
    }
}