package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTargetNumberTest {

    GuessTargetNumber guess;
    @Before
    public void setup()
    {
        guess=new GuessTargetNumber();
    }
    @Test
    public void givenIntegerShouldreturnLessThanTheoriginalNumber()
    {
        String result=guess.checkwithOriginalNumber(26);
        assertEquals("Number guessed is less than original number",result);
    }
    @Test
    public void givenIntegerShouldreturnGreaterThanTheoriginalNumber()
    {
        String result=guess.checkwithOriginalNumber(60);
        assertEquals("Number guessed is more than original number",result);
    }

    @Test
    public void givenIntegerShouldreturnMatchesTheoriginalNumber()
    {
        String result=guess.checkwithOriginalNumber(50);
        assertEquals("Number guessed matches the original number",result);
    }
}
