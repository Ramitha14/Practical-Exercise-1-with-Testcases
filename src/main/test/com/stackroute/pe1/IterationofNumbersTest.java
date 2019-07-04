package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationofNumbersTest {

        IterationofNumbers iteration;
        @Before
        public void setup()
        {
            iteration =new IterationofNumbers();
        }
        @Test
        public void givenIntegerShouldreturnSequenceofNumbers()
        {
            String result= iteration.iteration(3);
            assertEquals("1 2 2 3 3 3",result);
        }
        @Test
        public void givenIntegerShouldreturnNullforZero()
        {
            String result= iteration.iteration(0);
            assertEquals("",result);
        }
        @Test
        public void givenIntegerShouldreturnNullforNegativeNumber()
        {
            String result= iteration.iteration(-2);
            assertEquals("",result);
        }
    }

