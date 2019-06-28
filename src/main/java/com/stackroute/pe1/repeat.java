package com.stackroute.pe1;

import java.io.*;
import java.util.*;
public class repeat {

    public String SplitString(String input1,int input2)
    {
        String reverse="",res=input1;
        int count=0;
        for (int i = input1.length() - 1; i >= input2; i--) {
            if(count<input2)
            {
                count++;
                reverse = reverse + input1.charAt(i);
            }
        }
        String reverse2="";
        for(int j=reverse.length()-1;j>=0;j--)
        {
            reverse2=reverse2+reverse.charAt(j);
        }
        //System.out.print(input1);
        for(int i=0;i<input2;i++)
        {
            res=res+reverse2;
        }
        return res;
    }
}