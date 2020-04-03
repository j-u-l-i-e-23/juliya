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

public class NegativeArraySize {
    public static void main(String args[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            int n;
            
            System.out.println("Enter the number of elements in array");
            n=sc.nextInt();
            
            int a[]=new int[n];
            
            System.out.println("Enter the array elements");
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            
            System.out.println("Array Elements Are:");
            for(int i=0;i<n;i++)
                System.out.println("a["+i+"]="+a[i]);
        }
        catch(NegativeArraySizeException ex)
        {
            System.out.println("Array Size Can't be negative");
        }
    }
}
