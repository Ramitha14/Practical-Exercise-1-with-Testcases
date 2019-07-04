package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversetheStringTest {
        ReversetheString reverse;

        @Before
        public void setup(){
            //System.out.println("Before");
            reverse=new ReversetheString();
        }
        @Test
        public void givenStringShouldReturnytic() {
            String result = reverse.reverseString("city");
            //Assert
            assertEquals("ytic",result);
        }
        @Test
        public void givenStringShouldreturnNotAllowed() {

            String result = reverse.reverseString("null");
            //Assert
            assertEquals("not allowed", result);
        }
        @Test
        public void givenIntegerShouldreturndlrowolleh() {

            String result = reverse.reverseString("hello world");
            //Assert
            assertEquals("dlrow olleh",result);
        }


    }

