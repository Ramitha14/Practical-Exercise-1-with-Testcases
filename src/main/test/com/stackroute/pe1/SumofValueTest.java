package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumofValueTest{

    SumofValue obj;
    @Before
    public void setup()
    {
        obj=new SumofValue();
    }
    @Test
    public void givenArrayShouldreturnTwenty()
    {
        int a1[]={10,3,2,5};
        int result=obj.sumofNumbers(a1);
        assertEquals(20,result);
    }
    @Test
    public void givenArrayShouldreturnZero()
    {
        int a2[]={10,3,2,-15};
        int result=obj.sumofNumbers(a2);
        assertEquals(0,result);
    }
    @Test
    public void givenArrayShouldreturnNegativeTen()
    {
        int a3[]={0,3,2,-15};
        int result=obj.sumofNumbers(a3);
        assertEquals(-10,result);
    }

}