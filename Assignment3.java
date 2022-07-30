Java Program to Find Size of int, float, double and char in Your System
package javaassignment;
public class Assignment3 
{
    public static void main (String[] args)
 {
  System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
  System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
  System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
  System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
  }
}
