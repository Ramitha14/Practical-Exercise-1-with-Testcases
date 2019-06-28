package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class reverseTest {
    reverse r;

    @Before
    public void setup(){
        //System.out.println("Before");
        r=new reverse();
    }
    @Test
    public void reverse1() {
        String result = r.Rev("city");
        //Assert
        assertEquals("ytic",result);
    }
    @Test
    public void reverse2() {

        String result = r.Rev("null");
        //Assert
        assertEquals("not allowed", result);
    }
    @Test
    public void reverse3() {

        String result = r.Rev("hello world");
        //Assert
        assertEquals("dlrow olleh",result);
    }


}