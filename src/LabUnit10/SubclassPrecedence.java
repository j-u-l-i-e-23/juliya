/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit10;

/**
 *
 * @author Me
 */
import java.util.*;
class Base{
    void msg()throws ArithmeticException
    {
        System.out.println("Super");
        int a=30;
        int b=0;
        int c=a/b;
    }
}
public class SubclassPrecedence extends Base{
    void msg()
    {
        int arr[]=new int[4];
        System.out.println("Subclass");
        arr[4]=4;
        
    }
    public static void main(String args[])
    {
        Base b=new SubclassPrecedence();
        try{
            b.msg();

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bound");
            
        }
        
    }
}
