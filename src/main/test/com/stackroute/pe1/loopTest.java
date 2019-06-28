
package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class loopTest {
    loop loop;
    @Before
    public void setup()
    {
        loop=new loop();
    }
    @Test
    public void GenerateSeries()
    {
        String result=loop.LoopPrinting(3);
        assertEquals("1 2 2 3 3 3",result);
    }
    @Test
    public void GenerateSeries2()
    {
        String result=loop.LoopPrinting(0);
        assertEquals("",result);
    }
    @Test
    public void GenerateSeries3()
    {
        String result=loop.LoopPrinting(-2);
        assertEquals("",result);
    }
}