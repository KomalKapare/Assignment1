//Java Program to Check Whether Number is Even or Odd
package javaassignment;

import java.util.Scanner;

public class Assignment5 
{
    public static void main(String [] args)
    { 
        int number = 55;
        switch (number % 2) 
        {
            case 0: 
                System.out.printf("%d is an EVEN number\n", number);
                break; 
            case 1: 
                 System.out.printf("%d is an ODD number\n", number); 
                 break; 
            
        }
    } 
}
