package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckVowelorConsonantTest {
    CheckVowelorConsonant vow;

    @Before
    public void setup(){
        vow=new CheckVowelorConsonant();
    }
    @Test
    public void givenCharactershouldReturnVowelconsonant() {
        // Arrange
        // App app = new App();
        //Act
        String result = vow.vowelConsonent("ap");
        //Assert
        assertEquals("vowel consonent", result);
    }
    @Test
    public void givenIntegershouldReturnError() {
        // Arrange
        // App app = new App();
        //Act
        String result = vow.vowelConsonent("9");;
        //Assert
        assertEquals("Error", result);
    }
    @Test
    public void givenCharactershouldReturnConsonantError() {
        // Arrange
        // App app = new App();
        //Act
        String result = vow.vowelConsonent("r$");
        //Assert
        assertEquals(" consonent Error", result);
    }
}