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

public class MyException extends Exception{
    
}
class TryCatchExample {
    int flag=0;
    public static void main(String args[])
    {
        int a[]=new int[4];
        System.out.println("Enter the array elements");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++)
            a[i]=sc.nextInt();
        try
        {
            throw new MyException();
        }
        catch(MyException ex)
        {
            for(int i=0;i<4;i++)
            {
                if(a[i]<0)
                
                    System.out.println("Array Elements cannot be negative");
                
                
            }
            //System.out.println(ex.getMessage());
            
        }
    }
    
    
}
