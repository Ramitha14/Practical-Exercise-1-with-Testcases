package com.stackroute.pe1;


public class Character{
//check whether character is uppercase,lowercase,digit or special character
    public String findCharacter(char ch)
    {
        if((ch>=65)&&(ch<=90))
        {
            return ("Upper case");
        }
        else if((ch>=97)&&(ch<=122))
        {
            return ("Lower case");
        }
        else if((ch>=48)&&(ch<=57))

        {
            return ("Digit");
        }
        else if((ch>=58)&&(ch<65)||(ch>=91)&&(ch<97)||(ch>=1)&&(ch<=47)||(ch>=123)&&(ch<=127))
        {
            return ("Special character");
        }
        else
        {
            return ("Error");
        }


    }


}