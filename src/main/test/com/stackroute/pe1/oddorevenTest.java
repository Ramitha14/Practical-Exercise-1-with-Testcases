package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class oddorevenTest {
    oddoreven odd;

    @Before
    public void setup(){
        //System.out.println("Before");
        odd=new oddoreven();
    }
    @Test
    public void FindoddorEven() {
        // Arrange
        // App app = new App();
        //Act
        String result = odd.findoddoreven(23);
        //Assert
        assertEquals("Tom", result);
    }
    @Test
    public void FindoddorEven2() {
        // Arrange
        // App app = new App();
        //Act
        String result = odd.findoddoreven(26);
        //Assert
        assertEquals("Jerry", result);
    }
    @Test
    public void FindoddorEven3() {
        // Arrange
        // App app = new App();
        //Act
        String result = odd.findoddoreven(45);
        //Assert
        assertEquals("Error", result);
    }
}