/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit9;

/**
 *
 * @author MCALAB01032
 */
//import java.util.*;

class Base
{
    void conversion1(int b)
    {
        System.out.println("b="+b);
    }
    void conversion1(float c,int b)
    {
        System.out.println("c="+c+"b="+b);
    }
    void conversion1(double f,int b,float c)
    {
        System.out.println("f="+f+"b="+b+"c="+c);
    }
}
public class Automatic extends Base {
    void conversion1(int b)
    {
        System.out.println("b="+b);
    }
    void conversion1(float c,int b)
    {
        System.out.println("c="+c+"b="+b);
    }
    void conversion1(double f,int b,float c)
    {
        System.out.println("f="+f+"b="+b+"c="+c);
    }
    public static void main(String args[])
    {
        //Scanner sc=new Scanner(System.in);
        Byte b=4;
        int c=10;
       float f=3.5f;
        Automatic ac=new Automatic();
        ac.conversion1(b);
        ac.conversion1(c,b);
        ac.conversion1(f,b,c);
    }
}
