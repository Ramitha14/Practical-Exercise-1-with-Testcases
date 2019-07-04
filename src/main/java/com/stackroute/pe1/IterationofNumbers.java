package com.stackroute.pe1;


public class IterationofNumbers {

    //generate number series
    public String iteration(int number)
    {
        String reverse="";
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++)
            {
                reverse=reverse+i+" ";
            }
        }
        return reverse.trim();
    }
}