/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit3;

/**
 *
 * @author MCALAB01032
 */

public class CallByValue {
    void Swap(int a,int b)
    {
        System.out.println("After Swapping");
        int c=a;
        a=b;
        b=c;
        System.out.println("a="+a+"b="+b);
        
    }
    public  static void main(String args[])
    {
        CallByValue CB=new CallByValue();
        int a=30;
        int b=20;
        System.out.println("Before Swappin");
        
        System.out.println("a="+a+"b="+ b);
        CB.Swap(a,b);
    }
    
}