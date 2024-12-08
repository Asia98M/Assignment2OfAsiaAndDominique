package Ch10P2;

//********************************************************************
//  Zero.java       Author: Lewis/Loftus
//
//  Demonstrates an uncaught exception.
//********************************************************************

public class Zero
{
    //-----------------------------------------------------------------
    //  Deliberately divides by zero to produce an exception.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        int numerator = 10;
        int denominator = 0;
        
        if (denominator != 0) {
        	System.out.println(numerator/denominator);
        }
        else {
        	System.out.println("denominator can not be 0, please change you input.");
        }

//        System.out.println(numerator / denominator);
//
//        System.out.println("This text will not be printed.");
    }
}
