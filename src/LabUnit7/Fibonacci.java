/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit7;

/**
 *
 * @author Me
 */

import java.util.*;


public class Fibonacci {
   int fib(int n)
   {
       if(n<=1)
           return 1;
       else
           return(fib(n-1)+fib(n-2));
       
    
           
   }
   public static void main(String args[])
   {
       int i;
       Fibonacci f=new Fibonacci();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number graeter than 2");
       int n=sc.nextInt();
       for(i=0;i<n;i++)
       {
           int fi=f.fib(i);
           System.out.println("The fibonnaci number of"+i+"is="+fi );
       }
       
   }
}
