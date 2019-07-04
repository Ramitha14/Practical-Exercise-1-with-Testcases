package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringrepeatTest {
    Stringrepeat repeat;

    @Before
    public void setup(){
        repeat=new Stringrepeat();
    }
    @Test
    public void givenIntegerShouldreturnSubstringFiveTimes() {
        String result = repeat.splitString("stackroute",5);
        //Assert
        assertEquals("stackrouterouterouterouterouteroute", result);
    }
    @Test
    public void givenIntegerShouldreturntheSameString() {
                String result = repeat.splitString("hello",0);
        //Assert
        assertEquals("hello", result);
    }

    @Test
    public void givenIntegerShouldreturnSubstringTwoTimes() {
                String result = repeat.splitString("hai@",2);
        //Assert
        assertEquals("hai@i@i@", result);
    }

}