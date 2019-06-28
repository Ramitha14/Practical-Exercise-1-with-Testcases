package com.stackroute.pe1;


public class loop {

    //generate number series
    public String LoopPrinting(int num)
    {
        String rev="";
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                rev=rev+i+" ";
            }
        }
        return rev.trim();
    }
}