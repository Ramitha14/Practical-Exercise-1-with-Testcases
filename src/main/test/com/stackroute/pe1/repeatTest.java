package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class repeatTest {
    repeat repeat;

    @Before
    public void setup(){
        //System.out.println("Before");
        repeat=new repeat();
    }
    @Test
    public void SplitString() {
        // Arrange
        // App app = new App();
        //Act
        String result = repeat.SplitString("stackroute",5);
        //Assert
        assertEquals("stackrouterouterouterouterouteroute", result);
    }
    @Test
    public void SplitString2() {
        // Arrange
        // App app = new App();
        //Act
        String result = repeat.SplitString("hello",0);
        //Assert
        assertEquals("hello", result);
    }

    @Test
    public void SplitString3() {
        // Arrange
        // App app = new App();
        //Act
        String result = repeat.SplitString("hai@",2);
        //Assert
        assertEquals("hai@i@i@", result);
    }

}