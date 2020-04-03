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

public class Factorial {
    int factorial(int n)
    {
        if(n<=1)
            return 1;
        else
            return(n*(factorial(n-1)));
        
        
    }
    public static void main(String args[])
    {
        int f1,f2,f3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Factorial f=new Factorial();
        f1=f.factorial(a);
        f2=f.factorial(b);
        f3=f.factorial(c);
        System.out.println("Factorial of"+a+"="+f1+"Factorial of"+b+"="+f2+"Factorial of"+c+"="+f3);
    }
}
