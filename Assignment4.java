Java Program to Swap Two Numbers
package javaassignment;


public class Assignment4 
{
    public static void main(String[] args) 
    {  
       int x = 21, y = 100;
        
        System.out.println("Before swapping : ");
        System.out.println("First : " + x);
        System.out.println("Second : " + y);
        
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("After swapping");
        System.out.println("First : " + x);
        System.out.println("Second : " + y); 
    }    
    
    
}
