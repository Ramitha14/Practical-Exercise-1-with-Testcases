package com.stackroute.pe1;
public class reverse {
       //to main.java.com.stackroute.pe1.reverse the given string
    public String Rev(String str)
    {
        if(str=="null")
        {
           return "not allowed";
        }
      String r="";
       for(int i=str.length()-1;i>=0;i--)
       {
         r=r+str.charAt(i);
       }
        return r;
    }
}
