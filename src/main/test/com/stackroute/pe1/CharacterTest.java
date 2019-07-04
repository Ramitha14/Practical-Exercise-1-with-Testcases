package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {
    Character character;

    @Before
    public void setup(){
        //System.out.println("Before");
        character=new Character();
    }
    @Test
    public void givenCharactershouldReturnUppercase() {
        // Arrange
        // App app = new App();
        //Act
        String result = character.findCharacter('A');
        //Assert
        assertEquals("Upper case", result);
    }
    @Test
    public void givenCharactershouldReturnLowercase() {
        // Arrange
        // App app = new App();
        //Act
        String result = character.findCharacter('a');
        //Assert
        assertEquals("Lower case", result);
    }
    @Test
    public void givenNumbershouldReturnDigit() {
        // Arrange
        // App app = new App();
        //Act
        String result = character.findCharacter('9');
        //Assert
        assertEquals("Digit", result);
    }
    @Test
    public void givenCharactershouldReturnSpecialcharacter() {
        // Arrange
        // App app = new App();
        //Act
        String result = character.findCharacter('%');
        //Assert
        assertEquals("Special character", result);
    }
}

