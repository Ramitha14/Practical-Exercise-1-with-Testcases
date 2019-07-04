package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortNumbersinNonincreasingOrderTest {

    SortNumbersinNonincreasingOrder sortnumbers;
    @Before
    public void setup()
    {
        sortnumbers =new SortNumbersinNonincreasingOrder();

    }
    @Test
    public void givenIntegerShouldreturnFalse()
    {
        String result= sortnumbers.numberSorting(234534);
        assertEquals("False",result);
    }

    @Test
    public void givenIntegerShouldreturnTrue()
    {
        String result= sortnumbers.numberSorting(264534);
        assertEquals("True",result);
    }
    @Test
    public void SorttheNumberShouldReturnError()
    {
        String result= sortnumbers.numberSorting(-234534);
        assertEquals("Error",result);
    }

}
