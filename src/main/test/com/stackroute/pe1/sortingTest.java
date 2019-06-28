package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class sortingTest {

    sorting sort;
    @Before
    public void setup()
    {
        sort=new sorting();

    }
    @Test
    public void SorttheNumbers()
    {
        String result=sort.NumberSorting(234534);
        assertEquals("False",result);
    }

    @Test
    public void SorttheNumbers2()
    {
        String result=sort.NumberSorting(264534);
        assertEquals("True",result);
    }
    @Test
    public void SorttheNumbers3()
    {
        String result=sort.NumberSorting(-234534);
        assertEquals("Error",result);
    }

}
