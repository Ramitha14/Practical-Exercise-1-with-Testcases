package com.stackroute.pe1;
public class ReversetheString
{
       //to main.java.com.stackroute.pe1.reverse the given string
    public String reverseString(String string)
    {
        if(string=="null")
        {
           return "not allowed";
        }
      String str="";
       for(int i=string.length()-1;i>=0;i--)
       {
         str=str+string.charAt(i);
       }
        return str;
    }
}
