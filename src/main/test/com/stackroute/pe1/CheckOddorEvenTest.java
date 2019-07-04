package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CheckOddorEvenTest {
    CheckOddorEven object;

    @Before
    public void setup(){
        object=new CheckOddorEven();
    }
    @Test
    public void givenIntegershouldReturnTom() {
        String result = object.findOddorEven(23);
        assertEquals("Tom", result);
    }
    @Test
    public void givenIntegershouldReturnJerry() {
        String result = object.findOddorEven(26);
        //Assert
        assertEquals("Jerry", result);
    }
    @Test
    public void givenIntegershouldReturnError() {

        String result = object.findOddorEven(45);
        //Assert
        assertEquals("Error", result);
    }
}